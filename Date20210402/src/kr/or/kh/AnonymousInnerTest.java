package kr.or.kh;

import java.util.Scanner;

public class AnonymousInnerTest {
 //무명클래스   //인터나 추상 구현 클래스 생성 x
	public static void main(String[] args) {
		while(true) {
		Scanner input= new Scanner(System.in);
		
		
		System.out.println("1.글쓰게2.전체목록");
		CommandProcess cp= new CommandProcess();
		
		int bunho = input.nextInt();
		
		if(bunnho==1) {
			
		cp.process(new Command() { 	// class annonymouse implements Command
			
			@Override
			public void execute() {
				System.out.println("글쓰기");
				
			}
		})}
		;
		else if(bunho==2) {
		cp.process(new Command() {
			
			@Override
			public void execute() {
				System.out.println("전체목록");
				
			}
		});
	}}
	}
}
