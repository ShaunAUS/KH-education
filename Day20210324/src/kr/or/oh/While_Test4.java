package kr.or.oh;

public class While_Test4 {
	public static void main(String[] args) {
		
		
		
		int number=0;
		char c = 'A';
		
		aaa:while(true) {//바깥쪽반복분   x축
			while(true) {//안쪽반복문     y축
					number++;                  //다음행 부터 number+1이다.
					System.out.print(c++ +"");   //println 으로 하면 한줄로 나옴
					if(number%5==0) {
						break;
					}
					if(number==26) {
						break aaa;
					}
			}//안쪽 반복문  y축
			System.out.println();
		}//바깥쪽 반복문  x축
	}

}
