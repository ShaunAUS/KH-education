package kh.obj6;

public class Search extends Haksa{
	
	public Search() {
		
	}
		
	public void search() {//검색함수의시작		
			try {
				searchMenu();
			} catch (GubunException e) {
				e.printStackTrace();
			} catch (HaksaIrumException e) {
				e.printStackTrace();
			}
		
		if(gubun.equals("학생")) {
			for(int i=0;i<Register.studentList.size();i++) {
				StudentDTO student = Register.studentList.get(i);
				if(irumSearch.equals(student.getIrum())) {
					searchDisplay(student);
				}
			}
		}
		else if(gubun.equals("교수")) {
		   for(int i=0;i<Register.professorList.size();i++) {
			   ProfessorDTO professor = Register.professorList.get(i);
			   if(irumSearch.equals(professor.getIrum())) {
				   searchDisplay(professor);
			   }
		   }
		}
		else if(gubun.equals("관리자")) {
			for(int i=0;i<Register.managerList.size();i++) {
				ManagerDTO manager = Register.managerList.get(i);
				if(irumSearch.equals(manager.getIrum())) {
					searchDisplay(manager);
				}
			}
		}
    }//검색함수의끝

	@Override
	public void registerStudent() throws StudentHakbunException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerProfessor() throws ProfessorSubjectException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerManager() throws ManagerPartException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void register() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void studentDelete(int i, StudentDTO student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void professorDelete(int i, ProfessorDTO professor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void managerDelete(int i, ManagerDTO manager) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStudent(StudentDTO student, int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateProfessor(ProfessorDTO professor, int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateManager(ManagerDTO manager, int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
}
