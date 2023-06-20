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
		
//		join�� ����� �����尡 ������ ���� ������ �����尡 ����ȴ�.
//		��, �̹� join()���� start()�� ������� ���� �� ����.
		
		try {t1.join();} catch (InterruptedException e) {;}
		
		
		System.out.println("���ξ����� ����");
		
//		Thread1 thread1 = new Thread1("��");
//		Thread1 thread2 = new Thread1("��");
//		
//		thread1.start();
//		thread2.start();
		
//		thread1.run();
//		thread2.run();
	}
}
