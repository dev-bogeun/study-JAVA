package exceptionTest;

public class ExceptionTest {
	public static void main(String[] args) {
		
//		int[] arData = new int[5];
//		
//		try {
//			arData[5] = 10;
//		} catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace(); // ���� �������� ����� ��� �ڵ�κ��� ���� ��ȣ�� ��µȴ�.
//			System.out.println(e.getMessage());
//			System.out.println("ĭ�� �Ѿ���ϴ�.");
//		}
		
		try {
			System.out.println(10 / 0);
		} catch (NumberFormatException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
//		} catch (Exception e) {
//			System.out.println("�� �� ���� ����");
		} finally {
			System.out.println("�ݵ�� ����Ǿ�� �ϴ� ����");
		}
		
	}
}













