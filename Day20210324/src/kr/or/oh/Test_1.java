package kr.or.oh;

public class Test_1 {
	public static void main(String[] args) {
		int score = 95;
		char grade = (score>90)? 'A':'B';
		System.out.println(grade);
		
		
		
		int score2= 95;
		char grade2=' '; 			//char  스페이스바 공백   //or if문에 sysout으로 해도댐
		
		
		if(score2>90) {
			grade2='A';
		}else {
			grade2='B';
		}
		System.out.println(grade2);
		}
}
