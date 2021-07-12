	package kr.or.kh.obj1;
	
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.Scanner;
	
	public abstract class Haksa {
		  protected int cnt;
		  protected Statement stmt;  
		  protected String sql;
		  protected ResultSet rs;
		  protected int no;
		  public static Connection conn;
		  public static Scanner input;
		  public Haksa() {
			  try {
				Class.forName("com.mysql.jdbc.Driver");
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
		  public void studentDisplay() {
			   if(cnt==1) {
					System.out.println(cnt+"건 학생이삭제되었습니다.");
				}else {
					System.out.println(cnt+"건 학생삭제가실패되었습니다.");
				}   
		   }
		   public void managerDisplay() {
			   if(cnt==1) {
					System.out.println(cnt+"건 관리자님이삭제되었습니다.");
				}else {
					System.out.println(cnt+"건 관리자님이삭제가안되었습니다.");
				}
		   }
		   public void professorDisplay() {
			   if(cnt==1) {
					System.out.println(cnt+"건 교수님이삭제되었습니다.");
				}else {
					System.out.println(cnt+"건 교수님이삭제가안되었습니다.");
				}
		   
		   public int studentExecuter()throws SQLException {
				  cnt = stmt.executeUpdate(sql);
				  return cnt;
			  }
			  public int professorExecuter()throws SQLException {
				  cnt = stmt.executeUpdate(sql);
				  return cnt;
			  }
			  public int managerExecuter()throws SQLException{
				  cnt = stmt.executeUpdate(sql);
				  return cnt;
			  }
		  public void close(String str)throws SQLException {
			  if(str.equals("등록")||str.equals("삭제")) {
				stmt.close();
				conn.close();
			  }else if(str.equals("검색")||str.equals("전체출력")) {
				  stmt.close();
				  conn.close();
				  rs.close();		
			  }
			}
		  public void updateManagerDisplay(int cnt) {
		    	if(cnt==1) {
						System.out.println(cnt+"건 관리자님이 수정되었습니다.");
					}else {
						System.out.println(cnt+"건 관리자님이 수정되지않았습니다.");
					}
		    }
		  public int updateManagerExecuter() throws SQLException {
		    	cnt=stmt.executeUpdate(sql);
		    	return cnt;
		    }
		  public void updateStudentDisplay(int cnt) {
		    	if(cnt==1) {
						System.out.println(cnt+"건 학생이 수정되었습니다.");
					}else {
						System.out.println(cnt+"건 학생이 수정되지않았습니다.");
					}
		    }
		  public int updateStudentExecuter()throws SQLException {
		    	cnt=stmt.executeUpdate(sql);
		    	return cnt;
		    }
		  
		  public abstract void setStudentSql()throws SQLException;
		  public abstract void setProfessorSql() throws SQLException;
		  public abstract void setManagerSql() throws SQLException;
		  public abstract void setAgeIrum(String gubun);
		  public abstract void setHakbun();
		  public abstract void setSubject();
		  public abstract void setPart();
		  public abstract void register();
		  public abstract void irumSearch();
		  public abstract void gubunSearch();
		  public abstract void searchStudent() throws SQLException;
		  public abstract void searchProfessor() throws SQLException;
		  public abstract void searchManager() throws SQLException;
		  public abstract void studentSearchExecute()throws SQLException;
		  public abstract void professorSearchExecuter()throws SQLException;
		  public abstract void managerSearchExecuter()throws SQLException;	  	
		  public abstract void search();
		  public abstract void deleteStudent() throws SQLException;
		  public abstract void deleteProfessor() throws SQLException;
		  public abstract void deleteManager() throws SQLException;	   
		  public abstract void delete();
		  public abstract void listStudent()throws SQLException; 	  
		  public abstract void listProfessor() throws SQLException;
		  public abstract void listManager()throws SQLException;	  
		  public abstract void list();
		  public abstract void studentSearchUpdate()throws SQLException;
	      public abstract void studentUpdateView() throws SQLException;
	      public abstract void studentUpdateExecuter() throws SQLException;
	      public abstract void studentExecuterView() throws SQLException;
	      public abstract void studentViewDisplay(); 
	      public abstract void studentFinal();
	      public abstract void updateReAge(String str);
	      public abstract void updateReIrum(String str);
	      public abstract void updateReHakbun();
	      public abstract void updateStudentFinal() throws SQLException;
	      public abstract void professorUpdate() throws SQLException;
	      public abstract void professorUpdateExecuter() throws SQLException;
	      public abstract void professorUpdateView() throws SQLException;
	      public abstract void professorExecuterView() throws SQLException;  
	      public abstract void updateProfessorFinal() throws SQLException;
	      public abstract int updateProfessorExecuter()throws SQLException;
	      public abstract void professorViewDisplay();
	      public abstract void professorFinal();
	      public abstract void updateReSubject();
	      public abstract void updateProfessorDisplay(int cnt);
	      public abstract void managerUpdate() throws SQLException;
	      public abstract void managerUpdateExecuter() throws SQLException; 
	      public abstract void managerUpdateView() throws SQLException;
	      public abstract void managerExecuterView() throws SQLException;
	      public abstract void managaerViewDisplay();
	      public abstract void managerFinal();
	      public abstract void updateRePart();
	      public abstract void updateManagerFinal() throws SQLException; 
	      public abstract  String update();
	}