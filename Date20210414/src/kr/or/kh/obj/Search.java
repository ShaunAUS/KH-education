	package kr.or.kh.obj;
	
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.Scanner;
	
	public class Search {
		private Connection conn;
		private Statement stmt;
		private ResultSet rs;
		private int cnt;
		private int no;
		private String irumSearch;
		private String gubun;
		private String sql;
		private StudentDTO student;
		private ProfessorDTO professor;
		private ManagerDTO manager;
		public Search() {
			try {
				student=new StudentDTO();
				professor=new ProfessorDTO();
				manager=new ManagerDTO();
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		public void irumSearch() {
			System.out.println("찾을이름을 입력:");
			irumSearch = Register.input.next();
			if(irumSearch==null||irumSearch=="") {
				System.out.println("에러");
			}
		}
		public void gubunSearch() {
			System.out.println("학생,교수,관리자중입력");
			gubun = Register.input.next();
			if(irumSearch==null||irumSearch=="") {
				System.out.println("에러");
			}
		}
		public void searchStudent() throws SQLException {
			  sql = "select no,age,irum,hakbun from student where irum='"+irumSearch+"'";
			  stmt = conn.createStatement();
		}
		public void searchProfessor() throws SQLException{
			sql = "select no,age,irum,subject from professor where irum='"+irumSearch+"'";
			stmt = conn.createStatement();
		}
		public void searchManager() throws SQLException{
			sql = "select no,age,irum,part from manager where irum='"+irumSearch+"'";
			stmt = conn.createStatement();
		}
		public void studentExecute()throws SQLException {
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				no = rs.getInt("no");
				student.age=rs.getString("age");
				student.irum=rs.getString("irum");
				student.hakbun=rs.getString("hakbun");
			}
		}
		public void professorExecuter()throws SQLException {
			rs=stmt.executeQuery(sql); //insert,update,delete executeUpdate(), select executeQuery();
			while(rs.next()) {
				no = rs.getInt("no");
				professor.age = rs.getString("age");
				professor.irum= rs.getString("irum");
				professor.subject = rs.getString("subject");
			}
		}
		public void managerExecuter()throws SQLException {
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				no = rs.getInt("no");
				manager.age= rs.getString("age");
				manager.irum= rs.getString("irum");
				manager.part= rs.getString("part");
			}
		}
		public void studentDisplay() {
			System.out.print("나이:"+student.getAge()+"\t"+"이름:"+student.getIrum()+"\t학번:"+student.getHakbun()+"\n");
		}
		public void professorDisplay() {
			System.out.print("나이:"+professor.getAge()+"\t"+"이름:"+professor.getIrum()+"\t과목:"+professor.getSubject()+"\n");
		}
		public void managerDisplay() {
			System.out.print("나이:"+manager.getAge()+"\t"+"이름:"+manager.getIrum()+"\t부서:"+manager.getPart()+"\n");
		}
		public void close()throws SQLException {
			stmt.close();
			conn.close();
			rs.close();		
		}
		
		//-----------------------------------------------------------------------------------
	public void search() {	
		irumSearch();
		gubunSearch();
			if(gubun.equals("학생")) {//학생찾기
				try {
					conn = Register.getConnection();
					searchStudent();
					studentExecute();
					studentDisplay();
					close();
				} catch (SQLException e) {
					e.printStackTrace();
				}		
			}//학생찾기
			else if(gubun.equals("교수")) {//교수찾기					
					try {
						conn = Register.getConnection();
						searchProfessor();
						professorExecuter();
						professorDisplay();
						close();
					} catch (SQLException e) {
						e.printStackTrace();
					}				
			}//교수찾기
			else if(gubun.equals("관리자")) {				
					try {
						conn = Register.getConnection();
						searchManager();
						managerExecuter();
						managerDisplay();
						close();
					} catch (SQLException e) {
						e.printStackTrace();
					}								    
			}		
	}
	public static void main(String[] args) {
		Search searchObj = new Search();
		searchObj.search();
	}
	
	}
