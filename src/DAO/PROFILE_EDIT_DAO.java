package DAO;

// 관련 패키지들 import
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import oracle.jdbc.OracleTypes;

import java.util.ArrayList;
import config.DBConnect;
import config.NotRecordFoundException;
import config.DBClose;
import BEAN.Profile;

public class PROFILE_EDIT_DAO extends DBClose {

	private static Profile makeProfileEdit(ResultSet rs) throws Exception {
		Profile obj = new Profile();
		obj.setName(rs.getString("Name"));
		obj.setNickname(rs.getString("Nickname"));
		obj.setWebsite(rs.getString("Website"));
		obj.setIntro(rs.getString("Intro"));
		obj.setEmail(rs.getString("Email"));
		obj.setTel(rs.getInt("Tel"));
		obj.setGender(rs.getInt("Gender"));
		obj.setSimilar_recomn(rs.getInt("Similar_recomn"));
		obj.setComment_hide(rs.getInt("Commdent_hide"));
		obj.setNews_email(rs.getInt("News_email"));
		obj.setNotice_email(rs.getInt("Notice_email"));
		obj.setProduct_email(rs.getInt("Product_email"));
		obj.setResearch_email(rs.getInt("Research_email"));
		obj.setSms_mes(rs.getInt("Sms_mes"));
		return obj;
	}

	// 프로필 편집 페이지
	public static Profile selectByJob_Id(String USERID) throws Exception {
		String sql = "SELECT * FROM PROFILE WHERE USERID = ?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Profile p = null;
		try {
			con = DBConnect.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, USERID);
			rs = stmt.executeQuery();
			if (rs.next())
				p = makeProfileEdit(rs);
			else {
				NotRecordFoundException e = new NotRecordFoundException("USERID에 해당하는 데이터가 없음");
				throw e;
			}
		} catch (SQLException e) {
			printError(e);
		} finally {
			close(con, stmt, rs);
		}
		return p;
	}
	
	//비밀번호 변경
	public static Profile changePassword(String USERID) throws Exception {
		String sql = "SELECT * FROM PROFILE WHERE USERID = ?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Profile p = null;
		try {
			con = DBConnect.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, USERID);
			rs = stmt.executeQuery();
			if (rs.next())
				p = makeProfileEdit(rs);
			else {
				NotRecordFoundException e = new NotRecordFoundException("USERID에 해당하는 데이터가 없음");
				throw e;
			}
		} catch (SQLException e) {
			printError(e);
		} finally {
			close(con, stmt, rs);
		}
		return p;
	}

	public static void insert(String job_id, String job_title, int max_salary, int min_salary) throws Exception {
		String sql = "INSERT INTO Jobs(job_id, job_title, max_salary, min_salary) VALUES (?, ?, ?, ?)";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = DBConnect.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, job_id);
			stmt.setString(2, job_title);
			stmt.setInt(3, max_salary);
			stmt.setInt(4, min_salary);
			stmt.executeUpdate();
		} catch (SQLException e) {
			/*
			 * exception이 발생하였을 때, 종류에 따라 구별하여 처리하고 싶다면, 아래와 같은 코드를 이용할 수 있다.
			 * JDBC에서 발생할 수 있는 exception의 종류는 아래 사이트에서 확인한다.
			 * https://docs.oracle.com/javase/8/docs/api/java/sql/SQLException.
			 * html
			 * 
			 * if (e instanceof
			 * java.sql.SQLIntegrityConstraintViolationException)
			 * System.out.println("동일한 Job Id가 존재합니다.");
			 */
			printError(e);
		} finally {
			close(con, stmt, rs);
		}
	}

	// 수정
	public static void update(String job_id, String job_title, int max_salary, int min_salary) throws Exception {
		String sql = "UPDATE JOBS SET JOB_TITLE=?, MAX_SALARY=?, MIN_SALARY=? WHERE JOB_ID=?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = DBConnect.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, job_title);
			stmt.setInt(2, max_salary);
			stmt.setInt(3, min_salary);
			stmt.setString(4, job_id);
			int n = stmt.executeUpdate();
			if (n == 0) {
				NotRecordFoundException e = new NotRecordFoundException("JOB_ID에 해당하는 데이터가 없음");
				throw e;
			}
		} catch (SQLException e) {
			printError(e);
		} finally {
			close(con, stmt, rs);
		}
	}

	// 삭제
	public static void delete(String job_id) throws Exception {
		// 연습을 위해 삭제를 위한 코드는 Stored Procedure로 구현하였다.
		// Stored Procedure를 호출하기 위해서는 CallableStatement를 사용한다.
		// delete_job 이라는 프로시져가 db에 정의되어 있어야 한다
		String sql = "begin HR.DELETE_JOB(?); end;";
		Connection con = null;
		CallableStatement stmt = null;
		ResultSet rs = null;
		try {
			con = DBConnect.getConnection();
			// 여기서는, 트랜잭션 처리를 연습하기 위하여 설정되어 있는 setAutoCommit을 false로 설정한다.
			// autoCommit : DML문장 자동 커밋
			// 트랜잭션은 응용프로그램에서 원하는 방향에 따라, 설정될 수 있다.
			// Default로 autoCommit은 true로 설정되어 있다.
			// autoCommit이 false로 설정되면, commit 또는 rollback이 호출되어야 트랜잭션이 완료된다.
			con.setAutoCommit(false);
			stmt = con.prepareCall(sql);
			stmt.setString(1, job_id);
			// Stored Procedure를 실행하기 위해서는 아래 명령을 실행한다.
			stmt.execute();
			// 트랜잭션을 commit한다.
			con.commit();
		} catch (SQLException e) {
			con.rollback();
			printError(e);
		} finally {
			close(con, stmt, rs);
		}
	}

	// Stored Procedure에서 Result set 반환
	public static ArrayList<Profile> selectJobs() throws Exception {
		// Stored Procedure를 호출하여 여러 개의 결과를 반환하는 경우이다.
		// Stored Procedure를 호출하기 위해서는 CallableStatement를 사용한다.

		// Stored Procedure를 호출하기 위한 문자열 작성
		// 설정해야 하는 매개변수 부분은 ?로 표기
		// 여러 개의 row를 결과로 받는 Stored Procedure의 경우,
		// SYS_REFCURSOR 타입의 매개변수가 OUT 모드로 정의되어야 한다.
		String sql = "{call hr.get_all_jobs(?)}";
		Connection con = null;
		CallableStatement stmt = null;
		ResultSet rs = null;
		// 결과를 저장하기 위한 리스트 정의
		ArrayList<Profile> list = new ArrayList<Profile>();
		try {
			con = DBConnect.getConnection();
			stmt = con.prepareCall(sql);
			// Out모드 매개변수를 설정한다.
			stmt.registerOutParameter(1, OracleTypes.CURSOR);
			// Stored Procedure를 실행하기 위해서는 아래 명령을 실행한다.
			stmt.executeQuery();
			// 결과 집합에 하나 이상의 데이터가 포함될 수 있으므로, list와 반복문으로 처리한다.
			// 첫번째 매개변수값을 Object로 가져와서 ResultSet으로 형 변환한다.
			rs = (ResultSet) stmt.getObject(1);
			while (rs.next()) {
				// 가져온 결과를 결과 list에 추가한다.
				list.add(makeProfileEdit(rs));
				// 첫번째 매개변수값을 Object로 가져와서 ResultSet으로 형 변환한다.
				rs = (ResultSet) stmt.getObject(1);
			}
		} catch (SQLException e) {
			printError(e);
		} finally {
			close(con, stmt, rs);
		}
		return list;
	}
}
