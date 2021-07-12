package kr.or.oh;

import javax.sound.midi.SysexMessage;

public class WhileKeyControlExample {

	public static void main(String[] args) {
		boolean run = true;
		int speed = 0;
		int keyCode=0;
		while(run) {
			if(keyCode!=13&&keyCode!=10) {
				System.out.println("------");
				System.out.println("1.중속|2.감속3.중지");
				System.out.println("------");
				System.out.println("선택:");
				break;
			}
		}try {
			keyCode = System.in.read();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		if(keyCode==49) {
			speed++;
			System.out.println("현재속도="+speed);
		}else if (keyCode==50) {
			speed--;
			System.out.println("현재속도="+speed);
		}else if(keyCode==51){
		System.out.println("현재속도="+speed);
		}else if (keyCode==51) {
			run=false;
		}
		
	}
	}
			

