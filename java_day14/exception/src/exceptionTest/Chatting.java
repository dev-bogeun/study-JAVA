package exceptionTest;

import java.util.Scanner;

public class Chatting {
	public static void main(String[] args) {
		
//		System.out.println("안                   녕".replaceAll(" ", ""));
//		System.out.println("    안    녕    ".trim().replaceAll(" ", ""));
		
		Scanner sc = new Scanner(System.in);
		String message = null;
		
		System.out.print("메세지: ");
		message = sc.nextLine();
		
		if(message.equals("바보")) {
//			예외 발생
			try {
				throw new BadWordException("비속어는 사용할 수 없습니다");
			} catch (BadWordException e) {
				for (int i = 0; i < message.length(); i++) {
					System.out.print("*");
				} 
				System.out.println();
			}
		}
	}
}


















