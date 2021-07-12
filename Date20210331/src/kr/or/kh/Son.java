package kr.or.kh;

public class Son extends Father {
	protected double gudu;
	//400p
	public void display() {
		System.out.println("아들구두:"+gudu);
		//super.gudu=250.5;    //super 부모꺼 재사용   //강제로 넣어야한다  //변수의 다형성
		System.out.println("아버지구두"+super.gudu);
	}
	public static void main(String[] args) {
		Son son=new Son();
		son.gudu=250.5;
		
		
		Father father= new Father();    //불가능
		father.gudu=270.5;				//불가능
		son.display();
		
		
	}
}
