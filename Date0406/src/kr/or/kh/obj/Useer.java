package kr.or.kh.obj;

public class User {
	private String id;
	private String passwd;
	private String dong;
	private int age;
	private String irum;
	
	public User() {
		super();
		
	}
	
	
	public User(String id, String passwd, String dong, int age,String irum) {
		super();
		this.id = id;
		this.passwd = passwd;
		this.dong = dong;
		this.age = age;
		this.irum=irum;
	}
	
	
	
	public String getIrum() {
		return irum;
	}


	public void setIrum(String irum) {
		this.irum = irum;
	}


	@Override
	public String toString() {
		return "아이디id=" + id + ", 패스워드=" + passwd + ",동 =" + dong + ", 나이=" + age + "]";
	}
	
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getDong() {
		return dong;
	}
	public void setDong(String dong) {
		this.dong = dong;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
