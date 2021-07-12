package biz;

public class BizTest {

	public static void main(String[] args) {
		BizService biz = new BizService();
		biz.bizMethod(5);
		try {
			biz.bizMethod(-5);
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
