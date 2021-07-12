package kr.or.kh.obj7;

public interface IUpdate {
	public abstract void updateStudent(StudentDTO student,int i);
	public abstract void updateProfessor(ProfessorDTO professor,int i);
	public abstract void updateManager(ManagerDTO manager,int i);
	public abstract void update();
}
