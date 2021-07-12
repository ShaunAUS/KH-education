package kr.or.kh;


//thorw = 값이 잘못들어가 실행되 잘못된값이 나와 사전에 잘못된 값이 들어오면 오류를 발생시켜 멈추게 한다. 	throw new 오류("내용 sysout")
// throw 로 해도 예외처리해야됌 1. try -catch  or 2. thorws   -try -catch
public class ExceptionTest6 {
	
	public static void main(String[] args) {
		
		try {
			
			
		if(args.length!=2) {
			ArgsException ae= new ArgsException();  //문자열 2이상이하
			ae.setArgNumber(args.length);
			throw  new ArgsException("문자수 입력 오류");
			
			
		}else {
			    //문자열 2개
				int num1= Integer.parseInt(args[0]);
				int num2= Integer.parseInt(args[1]);
				System.out.println(num1+"+"+num2+"="+(num1+num2));
			
		}} catch (NumberFormatException e1) {
	
				e1.printStackTrace();
				
			}catch(ArgsException e2){
				System.out.println();
				System.out.println("당신이 입력한 수는 "+e2.getMessage());
			}}
			
		
	}

