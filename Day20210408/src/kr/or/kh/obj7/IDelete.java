package kr.or.kh.obj7;

public interface IDelete {
	public abstract void studentDelete(int i,StudentDTO student);
	public abstract void professorDelete(int i,ProfessorDTO professor);
	public abstract void managerDelete(int i,ManagerDTO manager);
	public abstract void delete();
}
