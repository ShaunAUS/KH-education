package kr.or.kh;

public class MyThreadMain {
	public static void main(String[] args) {
		MyThread3 myThread3 = new MyThread3();
		Thread myThread = new Thread(myThread3,"myThread");
		myThread.start();
		
		Thread my2 = new Thread(myThread2,"myThread2");
		my2.start();
	}
}
