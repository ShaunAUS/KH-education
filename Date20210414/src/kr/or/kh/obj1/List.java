	package kr.or.kh.obj1;
	
	import java.sql.SQLException;
	
	public class List extends Haksa{   
	   private StudentDTO student;
	   private ProfessorDTO professor;
	   private ManagerDTO manager;
	
	   public List() {	   
			student = new StudentDTO();
			professor = new ProfessorDTO();
			manager = new ManagerDTO();	
	   }
	   @Override
	   public void listStudent()throws SQLException {
		    sql = "select no,age,irum,hakbun from student";
			stmt = conn.createStatement();   
	   }
	   
	   
	   @Override
	   public void listProfessor() throws SQLException {
		    sql = "select no,age,irum,subject from professor";
			stmt = conn.createStatement();
	   }
	   
	   public void professorListExecuter()throws SQLException{
		   rs=stmt.executeQuery(sql);
			while(rs.next()) {
				no = rs.getInt("no");
				professor.age = rs.getString("age");
				professor.irum = rs.getString("irum");
				professor.subject = rs.getString("subject");
				System.out.print("나이:"+professor.getAge()+"\t"+"이름:"+professor.getIrum()+"\t과목:"+professor.getSubject()+"\n");
			}
	   }
	   @Override
	   public void listManager()throws SQLException {
		    sql = "select no,age,irum,part from manager";
			stmt = conn.createStatement();
	   }
	   
	   public void managerListExecuter() throws SQLException {
		   rs = stmt.executeQuery(sql);
			while(rs.next()) {
				no = rs.getInt("no");
				manager.age = rs.getString("age");
				manager.irum = rs.getString("irum");
				manager.part = rs.getString("part");
				System.out.print("나이:"+manager.getAge()+"\t"+"이름:"+manager.getIrum()+"\t부서:"+manager.getPart()+"\n");
			}
	   }
	   
	    @Override  
	   public void list() {	   
				try {
					conn = Register.getConnection();
					listStudent();
					studentExecuter();							
					listProfessor();			
					professorExecuter();
					listManager();
					managerExecuter();		
					close("전체출력");
				} catch (SQLException e) {
					e.printStackTrace();
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
	public void irumSearch() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void gubunSearch() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void searchStudent() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void searchProfessor() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void searchManager() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void studentSearchExecute() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void professorSearchExecuter() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void managerSearchExecuter() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void search() {
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
