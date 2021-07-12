
public class Test5 {
	//오버라이딩 = 파라미터 타입 or 개수 메서드 //이름은 같고
	//개발관점= 오버로드  //유지보수관점=오버라이드  ==다형성
	//오버로드 계산값은 같고 파라미터 다르다?
	
	int add(int a, int b) {
		return a+b;
	}
	
	long add(long a, long b) {
		return a+b;
	}
	
	
	int add(int[] a) {
	int result=0;
	for(int i =-0;i<a.length;i++) {
		result +=a[i];
	}
	}
	
	
	public static void main(String[] args) {
		Test5 test5=new Test5();
		int result=test5.add(10,20); //int형

		
		System.out.println(result);
		long result2=test5.add(10L,10L);  //long형
		System.out.println(result2);
		
		int result3=int[] arr=new int[3]; //배열형
		System.out.println(result3);
		
		
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		test5.add(arr);
	}
	/*
	long add(int a, int b) {
		return a+b;
	}
	
	long add(long a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
		Test5 test5= new Test5();
		long result1=test5.add(10,20);
		System.out.println(result1);
		long result2=test5.add(5L,6);
		System.out.println(result2);
	}
	*/
	/*
	int add(int a, int b) {
		return a+b;
	}
	
	long add(int a, int b) {
		return (long)(a+b);
	}
	*/
	/*
	//오버라디잉 = 파라미터 타입 or 개수 메서드 이름은 같고
	int add(int a,int b) {
		return a+b;
	}
	
	int add(int x,int y) {
		return x+y;
	}
   */
}
