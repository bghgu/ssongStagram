package config;

// jdbc 관련 패키지 import
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

// 각 DAO 클래스에서 공통으로 사용할 DAO 클래스 정의
// 실제 인스턴스는 가지지 않을 예정이므로, abstract(추상) 클래스로 정의

public abstract class DBClose {

// 사용이 끝난 connection, statement, resultset을 종료한다.
		static public void close(Connection c, Statement p, ResultSet r) throws Exception{
		if (c!=null)
			c.close();
		if (p!=null)
			p.close();
		if (r!=null)
			r.close();
	}

// 오류가 발생한 경우, exception의 내용을 출력한다.
	static public void printError(SQLException ex) {
	    for (Throwable e : ex) {
	        if (e instanceof SQLException) {
	                e.printStackTrace(System.err);
	                System.err.println("SQLState: " +
	                    ((SQLException)e).getSQLState());
	
	                System.err.println("Error Code: " +
	                    ((SQLException)e).getErrorCode());
	
	                System.err.println("Message: " + e.getMessage());
	        }
	    }
	}
}
