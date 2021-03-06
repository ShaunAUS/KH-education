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
			  if(str.equals("??????")) {
				System.out.println("????????? ?????????????????????.");
				    if(cnt==0) {
					System.out.println("????????????????????????????????????.");
				    }
				}else if(str.equals("??????")) {
					System.out.println("?????????????????????????????????.");
					if(cnt==0) {
					 System.out.println("???????????????????????????????????????.");
					}
				}else if(str.equals("?????????")) {
					System.out.println("??????????????? ?????????????????????.");
					if(cnt==0) {
						System.out.println("??????????????????????????????????????????.");
					}
				}else {
					System.out.println("??????????????????????????????.");
				}
		  }
		  public void setAgeIrum(String gubun) {
			  if(gubun.equals("??????")) {
			     student.setAge();
			     student.setIrum();
			  }else if(gubun.equals("??????")) {
				 professor.setAge();
				 professor.setIrum();
			  }else if(gubun.equals("?????????")) {
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
				System.out.println("=======?????? ??????======");
				System.out.println("1.??????");
				System.out.println("2.??????");
				System.out.println("3.?????????");
				System.out.println("4.????????????");
				System.out.println("????????? ????????? ?????????.."); 
				cnt = input.nextInt();
				if(cnt<0||cnt>4) {
					System.out.println("??????");
				}
				if(cnt==1) {//????????????
					setAgeIrum("??????");		
					setHakbun();			
					try {
						conn=getConnection();
						setStudentSql();
						cnt=studentExecute();
						displayAll("??????",cnt);
						close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}//????????????
				else if(cnt==2) {//????????????
					setAgeIrum("??????");
					setSubject();
					try {
						conn=getConnection();
						setProfessorSql();
						cnt=professorExecute();
						displayAll("??????",cnt);
						close();
					} catch (SQLException e) {
						e.printStackTrace();
					}			    		            		
				}//????????????
				else if(cnt==3) {//?????????
					setAgeIrum("?????????");
					setPart();
					try {
						conn=getConnection();
						setManagerSql();
						cnt=managerExecute();
						displayAll("?????????",cnt);
						close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}//?????????
			} 
		}