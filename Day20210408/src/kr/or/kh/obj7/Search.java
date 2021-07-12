package kr.or.kh.obj7;

public class Search extends Haksa implements ISearch{
	
	public Search() {
		
	}
		
	@Override
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


}
