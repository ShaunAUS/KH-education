
public class ParameterClass {

	public static void main(String[] args) {
		
		Data d= new Data();
		d.x=10;
		System.out.println("main():x="+d.x);
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main():x="+d.x);
		

	}
	public static void change(int x) {
		x=1000;						//x =1000으로 됀다
		System.out.println("chagne():x="+x);
		return;   					//다시 10번쨰줄로간다			//컴파일러가 자동으로 적어줌// 함수 시작으로감 change(d.x)
	}
}
