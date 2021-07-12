package kr.or.obj;

public class InterfacePolyTest {

	public static void main(String[] args) {
		
		CommandProcess cp=new CommandProcess();   //추상메서드 객체생성 x니까 하나 만들어준다
		
		WriteCommand wc= new WriteCommand();
		ListCommand lc= new ListCommand();
		cp.process(wc);			//Command command = new WriteCommand();
		cp.process(lc);			//Command command = new ListCommand();
	}

}
