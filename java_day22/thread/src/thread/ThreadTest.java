package thread;

public class ThreadTest{
	public static void main(String[] args) {
		Runnable mineral = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName());
				try {Thread.sleep(1000);} catch (InterruptedException e) {;}
			}
		};
		
		Thread t1 = new Thread(mineral, "?");
		Thread t2 = new Thread(mineral, "!");
		t1.start();
		t2.start();
		
//		join을 사용한 쓰레드가 끝나고 나서 나머지 쓰레드가 실행된다.
//		단, 이미 join()전에 start()된 쓰레드는 멈출 수 없다.
		
		try {t1.join();} catch (InterruptedException e) {;}
		
		
		System.out.println("메인쓰레드 종료");
		
//		Thread1 thread1 = new Thread1("★");
//		Thread1 thread2 = new Thread1("♥");
//		
//		thread1.start();
//		thread2.start();
		
//		thread1.run();
//		thread2.run();
	}
}
