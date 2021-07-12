package kr.or.kh;
public class InstanceOFTest {

	public static void main(String[] args) {
		President president1=new President();
		
		Persoon persoon1= president1;//up  //new president();
		
		
		//Persoon persoon1= new president();
		if(persoon1 instanceof President) {
			President president2= (President)persoon1;
			System.out.println("형변환 성공");
		}else {
			System.out.println("persoon1을 캐스팅 할수 없다");
		}
		
		
		
		Persoon persoon2=new Persoon();
		if(persoon2 instanceof President) {
			President president3=(President)persoon2;
			System.out.println("캐스팅 성공");
		}else {
			System.out.println("캐스팅불가");
		}
		

}
	}
