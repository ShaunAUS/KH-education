package kr.or.kh;
//스레드 514P
public class MyThread extends Thread {
	public MyThread(String name) {
		
		super(name);
		
	}

	@Override
	public void run() {
		System.out.println("실행 중 프로그램 1");
	}
	/*@Override
	public void start() {
		run();
	}
	*/
	public static void main(String[] args) {
		MyThread myThread= new MyThread("첫번쨰프로그램");
		myThread.start();
		
		
	}
}
