package kr.or.oh;

public class Logic4 {

	public static void main(String[] args) {
		
		//Run configuaration 
		
		int age = Integer.parseInt(args[0]);    //문자열(스트링) 에서 기본 형으로 바꿈
		
		String result = "";
		
		if(age/10==0) {
			System.out.println("10대이하");
		}else if(age/10==1) {
			result="10대";
		}else if (age/10==2) {
			result="20대";
		
		}else if(age/10==3) {
			result="30대";
		}else if(age/10==4) {
			result="40대";
		}else if(age/10==5) {
			result="50대";
		}else if(age/10==6) {
			result="60대";
		}
		System.out.println("당신은"+result+"입니다.");
		

	}

}
