package kr.or.oh;

public class AccuracyExample {

	public static void main(String[] args) {
		
		
		
		int apple= 1;
		int totalPrices = apple*10;
		
		int number = 7;
		int temp= totalPrices-number;
		double result = temp/10.0;                    //double형으로 해서 3/10된다. int x
		
		//int apple= 1;
		//double priceUnit = 0.1;
		//int number = 7;
		//double result = apple-number *priceUnit;
		System.out.println("사과한개에서");
		System.out.println("0.7조각을 뺴면");
		System.out.println(result+"조각이 남는다.");
	

	}

}
