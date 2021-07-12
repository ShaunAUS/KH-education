package kh.obj5;

public class Search {
	public Haksa haksa;
	public Search() {
		haksa = new Haksa();
	}
		
	public void search() {//검색함수의시작		
			try {
				haksa.searchMenu();
			} catch (GubunException e) {
				e.printStackTrace();
			} catch (HaksaIrumException e) {
				e.printStackTrace();
			}
		
		if(haksa.gubun.equals("학생")) {
			for(int i=0;i<Haksa.studentList.size();i++) {
				StudentDTO student = Haksa.studentList.get(i);
				if(haksa.irumSearch.equals(student.getIrum())) {
					haksa.searchDisplay(student);
				}
			}
		}
		else if(haksa.gubun.equals("교수")) {
		   for(int i=0;i<Haksa.professorList.size();i++) {
			   ProfessorDTO professor = Haksa.professorList.get(i);
			   if(haksa.irumSearch.equals(professor.getIrum())) {
				   haksa.searchDisplay(professor);
			   }
		   }
		}
		else if(haksa.gubun.equals("관리자")) {
			for(int i=0;i<Haksa.managerList.size();i++) {
				ManagerDTO manager = Haksa.managerList.get(i);
				if(haksa.irumSearch.equals(manager.getIrum())) {
					haksa.searchDisplay(manager);
				}
			}
		}
    }//검색함수의끝
}
