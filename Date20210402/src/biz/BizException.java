package biz;

public class BizException extends RuntimeException {
	
	public BizException(String msg) {        		//thorw 오류(메세지)ㄴ
		super(msg);
	}
	public BizException(Exception ex) {
		super(ex);
	}
	
}
