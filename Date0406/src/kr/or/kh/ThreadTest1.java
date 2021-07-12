package kr.or.kh;

public class ThreadTest1 {

	public static void main(String[] args) {
		MyThread2 myThread= new MyThread2("khThread2");
		MyThread2.start();
		MyThread2 myThread2 = new MyThread1("khThread2");
		MyThread2.start();

	}

}
