package exceptionTest;

import java.util.Scanner;

public class Chatting {
	public static void main(String[] args) {
		
//		System.out.println("��                   ��".replaceAll(" ", ""));
//		System.out.println("    ��    ��    ".trim().replaceAll(" ", ""));
		
		Scanner sc = new Scanner(System.in);
		String message = null;
		
		System.out.print("�޼���: ");
		message = sc.nextLine();
		
		if(message.equals("�ٺ�")) {
//			���� �߻�
			try {
				throw new BadWordException("��Ӿ�� ����� �� �����ϴ�");
			} catch (BadWordException e) {
				for (int i = 0; i < message.length(); i++) {
					System.out.print("*");
				} 
				System.out.println();
			}
		}
	}
}


















