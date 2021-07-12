package kr.or.oh;

import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {
		
		String names[] = new String[]{"김민재","김두한","도도도도"};
		Scanner input=new Scanner(System.in);
		
		int index=-1;
		
		do {
			System.out.println("접속 이름 입력");
			System.out.println("이름:");
			String name = input.next();								//입력
			
			
			for(int i = 0;i<names.length;i++) {
				if(name.equals(names[i])) {                       //0번쨰,1번쨰,2번쨰 방 다돌면서 검사
					index=i;
				}
			}
			
			
			
			
			if(index!=-1) {
				System.out.println(name+"은 배열의"+index+"인덱스방에서찾았습니다");  //for 문 참이면
				break;
			}
			System.out.println("해당 이름 존재 x");
		
		}while(true);												//do로다시가긴
		}
	}
	
	

