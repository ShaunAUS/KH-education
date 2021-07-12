package kr.or.kh;

public class MyThread2 extends Thread {
	
	
	
	
	
	public void Mythread2(String name) {
		super(name);
	};
	@Override
	public void run() {
		for(int i =0;i<20;i++) {
			try {
				System.out.println(/*thread.*/currentThread().getName());
				/*thread.*/sleep(10);
				for(int j=1;j<=i;j++) {
					System.out.println("$");
				}
				System.out.println();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
