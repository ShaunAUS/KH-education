package kr.or.oh;

public class InfinityAndNanCheckExample {

	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		double z = x/y;
		
		System.out.println(Double.isInfinite(z));  //---------------------------------
		System.out.println(Double.isNaN(z));
		System.out.println(z+2);
		
		if(Double.isFinite(z)||Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		}else {}
		System.out.println(z+2);
	}
	
	
	//  5/.0.0 ====infinity(무한대)
    //   5%0.0 === Nan  (숫자가아니다)
}
