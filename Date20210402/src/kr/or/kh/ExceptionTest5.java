package kr.or.kh;


//1.  	9번쨰 줄 (컴파일 에러) 발생
//2.  	11번쨰줄 thorws
//3.  	밑에서try catch 로 잡는다


//익명 클래스=  추상클래스를 상속 받는 클래스 굳이 만들 필요 없을떄
//   Action ac = new action(){
//       (오버라이드 메서드)
//           }           ac.메서드    (컨트룰 스페이스)



//throws = 메서드 내에서 처리 안하고/ 메서드 호출한쪽(try-catch)해서 처리

public class ExceptionTest5 {
	public void exceptionMehtod() throws ClassNotFoundException{
		
		//new NullPointerException();
		//객체 생성 안했다// 실행 오류// 컴파일떄는 오류 ㄴㄴ//상속관계계에 런타임 익셉션이 있다
		//
		
		//throw new ClassNotFoundException();
		//컴파일 에러 // 상속관계계에 런타임 익셉션이 없다 //api에서 오류상속관계보기
	}
	public static void main(String[] args) {
		
		ExceptionTest5 et5=new ExceptionTest5();
		try {
			et5.exceptionMehtod();						//throws  니까 매서드 호출한쪾에서 try-catch로 처리
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}  
	}
}
