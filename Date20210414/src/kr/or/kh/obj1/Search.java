	package kr.or.kh.obj1;
	
	import java.sql.SQLException;
	
	public class Search extends Haksa{
		private String irumSearch;
		private String gubun;	
		private StudentDTO student;
		private ProfessorDTO professor;
		private ManagerDTO manager;
		public Search() {		
				student=new StudentDTO();
				professor=new ProfessorDTO();
				manager=new ManagerDTO();		
		}
		@Override
		public void irumSearch() {
			System.out.println("찾을이름을 입력:");
			irumSearch = Register.input.next();
			if(irumSearch==null||irumSearch=="") {
				System.out.println("에러");
			}
		}
		@Override
		public void gubunSearch() {
			System.out.println("학생,교수,관리자중입력");
			gubun = Register.input.next();
			if(irumSearch==null||irumSearch=="") {
				System.out.println("에러");
			}
		}
		@Override
		public void searchStudent() throws SQLException {
			  sql = "select no,age,irum,hakbun from student where irum='"+irumSearch+"'";
			  stmt = conn.createStatement();
		}
		@Override
		public void searchProfessor() throws SQLException{
			sql = "select no,age,irum,subject from professor where irum='"+irumSearch+"'";
			stmt = conn.createStatement();
		}
		@Override
		public void searchManager() throws SQLException{
			sql = "select no,age,irum,part from manager where irum='"+irumSearch+"'";
			stmt = conn.createStatement();
		}
		@Override
		public void studentSearchExecute()throws SQLException {
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				no = rs.getInt("no");
				student.age=rs.getString("age");
				student.irum=rs.getString("irum");
				student.hakbun=rs.getString("hakbun");
			}
		}
		
		@Override
		public void professorSearchExecuter()throws SQLException {
			rs=stmt.executeQuery(sql); //insert,update,delete executeUpdate(), select executeQuery();
			while(rs.next()) {
				no = rs.getInt("no");
				professor.age = rs.getString("age");
				professor.irum= rs.getString("irum");
				professor.subject = rs.getString("subject");
			}
		}
		@Override
		public void managerSearchExecuter()throws SQLException {
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				no = rs.getInt("no");
				manager.age= rs.getString("age");
				manager.irum= rs.getString("irum");
				manager.part= rs.getString("part");
			}
		}
		@Override
		public void studentDisplay() {
			System.out.print("나이:"+student.getAge()+"\t"+"이름:"+student.getIrum()+"\t학번:"+student.getHakbun()+"\n");
		}
		@Override
		public void professorDisplay() {
			System.out.print("나이:"+professor.getAge()+"\t"+"이름:"+professor.getIrum()+"\t과목:"+professor.getSubject()+"\n");
		}
		@Override
		public void managerDisplay() {
			System.out.print("나이:"+manager.getAge()+"\t"+"이름:"+manager.getIrum()+"\t부서:"+manager.getPart()+"\n");
		}
		@Override
	    public void search() {	
		    irumSearch();
		    gubunSearch();
			if(gubun.equals("학생")) {//학생찾기
				try {
					conn = Register.getConnection();
					searchStudent();
					studentSearchExecute();
					studentDisplay();
					close("검색");
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
						close("검색");
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
						close("검색");
					} catch (SQLException e) {
						e.printStackTrace();
					}								    
			}		
	}
	@Override
	public void setStudentSql() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setProfessorSql() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setManagerSql() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setAgeIrum(String gubun) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setHakbun() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setSubject() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setPart() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void register() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteStudent() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteProfessor() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteManager() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void listStudent() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void listProfessor() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void listManager() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void list() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void studentSearchUpdate() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void studentUpdateView() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void studentUpdateExecuter() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void studentExecuterView() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void studentViewDisplay() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void studentFinal() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateReAge(String str) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateReIrum(String str) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateReHakbun() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateStudentFinal() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void professorUpdate() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void professorUpdateExecuter() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void professorUpdateView() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void professorExecuterView() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateProfessorFinal() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int updateProfessorExecuter() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void professorViewDisplay() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void professorFinal() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateReSubject() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateProfessorDisplay(int cnt) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void managerUpdate() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void managerUpdateExecuter() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void managerUpdateView() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void managerExecuterView() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void managaerViewDisplay() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void managerFinal() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateRePart() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateManagerFinal() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String update() {
		// TODO Auto-generated method stub
		return null;
	}
	
	}
		