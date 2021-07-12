package kr.or.kh.obj7;

public interface IRegister {
	public abstract void registerStudent()throws StudentHakbunException;
	public abstract void registerProfessor()throws ProfessorSubjectException;
	public abstract void registerManager() throws ManagerPartException;
	public abstract void register();
}
