package biz;

public class BizService {
	public  void bizMethod(int i) throws BizException{
		System.out.println("메서드 시작");
		if(i<0)
			throw new BizException("매개변수 i= 0 이상이여야 합니다");  //여기서 멈춘다
		System.out.println("메서드 종료");
	}
}
