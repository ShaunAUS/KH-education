package kr.or.kh;

public class Test {
//471p
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("java");
		StringBuffer sb2 = sb.append("Fighting");
		System.out.println(sb==sb2);   //== 같은 공안 stringbuffer에 들어있다
		System.out.println(sb2);

	}

}
