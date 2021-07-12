package kr.or.kh;

public class Valuable {

	public static void main(String[] args) {
		//int value=10;
		//int sum = value+20;
		//System.out.println(sum);
		
		int var1=1;
		{
			int var2=2;
			System.out.println(var1+":"+var2);
		}
		
		{
				int var3=3;
				System.out.println(var2);
				
			}
			//var1 사용가능
		   //var2와 var3은 사용못함
		}
		

	}

}
