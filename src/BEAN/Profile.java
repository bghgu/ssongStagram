package BEAN;

// Jobs 테이블에 있는 컬럼들과 대응되는 멤버들로 구성된 클래스
public class Profile {
	String userid;
	String password;
	String name;
	String nickname;
	String website;
	String intro;
	String email;
	int tel;
	int gender;
	int all_board;
	int similar_recomn;
	int comment_hide;
	int news_email;
	int notice_email;
	int product_email;
	int research_email;
	int sms_mes;
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public int getAll_board() {
		return all_board;
	}
	public void setAll_board(int all_board) {
		this.all_board = all_board;
	}
	public int getSimilar_recomn() {
		return similar_recomn;
	}
	public void setSimilar_recomn(int similar_recomn) {
		this.similar_recomn = similar_recomn;
	}
	public int getComment_hide() {
		return comment_hide;
	}
	public void setComment_hide(int comment_hide) {
		this.comment_hide = comment_hide;
	}
	public int getNews_email() {
		return news_email;
	}
	public void setNews_email(int news_email) {
		this.news_email = news_email;
	}
	public int getNotice_email() {
		return notice_email;
	}
	public void setNotice_email(int notice_email) {
		this.notice_email = notice_email;
	}
	public int getProduct_email() {
		return product_email;
	}
	public void setProduct_email(int product_email) {
		this.product_email = product_email;
	}
	public int getResearch_email() {
		return research_email;
	}
	public void setResearch_email(int research_email) {
		this.research_email = research_email;
	}
	public int getSms_mes() {
		return sms_mes;
	}
	public void setSms_mes(int sms_mes) {
		this.sms_mes = sms_mes;
	}
}
