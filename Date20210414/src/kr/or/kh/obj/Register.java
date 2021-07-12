		package kr.or.kh.obj;
		
		import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.SQLException;
		import java.sql.Statement;
		import java.util.Scanner;
		
		public class Register {
		  private int cnt;
		  public static Connection conn;
		  private Statement stmt;  
		  private String sql;
		  private String part;
		  public static Scanner input;
		  private StudentDTO student;
		  private ProfessorDTO professor;
		  private ManagerDTO manager;
		  public Register() {
			  try {
				Class.forName("com.mysql.jdbc.Driver");
				student = new StudentDTO();
				professor = new ProfessorDTO();
				manager = new ManagerDTO();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		  }
		  static {
			  input = new Scanner(System.in);
		  }
		  public static Connection getConnection()throws SQLException {
			  conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql?characterEncoding=utf-8", "root", "");
			  return conn;
		  }
		  public void setStudentSql()throws SQLException {
			  sql = "insert into student(age,irum,hakbun) values('"+student.getAge()+"','"+student.getIrum()+"','"+student.getHakbun()+"')";
			  stmt = conn.createStatement();
		  }
		  public void setProfessorSql() throws SQLException {
			  sql = "INSERT INTO professor(age,irum,subject) values('"+professor.getAge()+"','"+professor.getIrum()+"','"+professor.getSubject()+"')";
			  stmt = conn.createStatement();
		  }
		  public void setManagerSql() throws SQLException {
			  sql = "insert into manager(age,irum,part) values('"+manager.getAge()+"','"+manager.getIrum()+"','"+manager.getPart()+"')";
			  stmt = conn.createStatement();
		  }
		  public int studentExecute()throws SQLException {
			  cnt = stmt.executeUpdate(sql);
			  return cnt;
		  }
		  public int professorExecute()throws SQLException {
			  cnt = stmt.executeUpdate(sql);
			  return cnt;
		  }
		  public int managerExecute()throws SQLException{
			  cnt = stmt.executeUpdate(sql);
			  return cnt;
		  }
		  public void displayAll(String str,int cnt) {
			  if(str.equals("학생")) {
				System.out.println("학생이 등록되었습니다.");
				    if(cnt==0) {
					System.out.println("학생등록이실패되었습니다.");
				    }
				}else if(str.equals("교수")) {
					System.out.println("교수님이등록되었습니다.");
					if(cnt==0) {
					 System.out.println("교수님등록이실패되었습니다.");
					}
				}else if(str.equals("관리자")) {
					System.out.println("관리자님이 등록되었습니다.");
					if(cnt==0) {
						System.out.println("관리자님등록이실패되었습니다.");
					}
				}else {
					System.out.println("등록이실패되었습니다.");
				}
		  }
		  public void setAgeIrum(String gubun) {
			  if(gubun.equals("학생")) {
			     student.setAge();
			     student.setIrum();
			  }else if(gubun.equals("교수")) {
				 professor.setAge();
				 professor.setIrum();
			  }else if(gubun.equals("관리자")) {
				 manager.setAge();
				 manager.setIrum();
			  }
				
		  }
		  public void setHakbun() {
			  student.setHakbun();
		  }
		  public void setSubject() {
			  professor.setSubject();
		  }
		  public void setPart() {
			   
		  }
		  public void close()throws SQLException {
			  conn.close();
			  stmt.close();
		  }
		  
		//-----------------------------------------------------------------------------------
		  public void register() {
				System.out.println("=======메뉴 선택======");
				System.out.println("1.학생");
				System.out.println("2.교수");
				System.out.println("3.관리자");
				System.out.println("4.이전메뉴");
				System.out.println("번호를 선택해 주세요.."); 
				cnt = input.nextInt();
				if(cnt<0||cnt>4) {
					System.out.println("에러");
				}
				if(cnt==1) {//학생등록
					setAgeIrum("학생");		
					setHakbun();			
					try {
						conn=getConnection();
						setStudentSql();
						cnt=studentExecute();
						displayAll("학생",cnt);
						close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}//학생등록
				else if(cnt==2) {//교수등록
					setAgeIrum("교수");
					setSubject();
					try {
						conn=getConnection();
						setProfessorSql();
						cnt=professorExecute();
						displayAll("교수",cnt);
						close();
					} catch (SQLException e) {
						e.printStackTrace();
					}			    		            		
				}//교수등록
				else if(cnt==3) {//관리자
					setAgeIrum("관리자");
					setPart();
					try {
						conn=getConnection();
						setManagerSql();
						cnt=managerExecute();
						displayAll("관리자",cnt);
						close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}//관리자
			} 
		}