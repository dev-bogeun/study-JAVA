package exceptionTest;

import java.util.Scanner;

public class ExceptionTask {
	public static void main(String[] args) {
//		5���� ������ �Է� �ޱ�
//		- ���� �Է� ���·� ����
//		- q �Է� �� ������
//		- �� ������ �迭�� ���
//		- if���� �� �� ���� ����ϱ�
		
		Scanner sc = new Scanner(System.in);
		int[] arData = new int[5];
		String temp = null;
		
		for(int i=0;;) {
			System.out.print(i + 1 + "��° ����[q: ������]: ");
			temp = sc.next();
			if(temp.toLowerCase().equals("q")) {break;}
			
			try {
				arData[i] = Integer.parseInt(temp);
				i++;
			} catch (NumberFormatException e) {
				System.out.println("������ �Է����ּ���.");
				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("5���� ������ �Է��� �����մϴ�.");
				
				for (int j = 0; j < arData.length; j++) {
					System.out.print(arData[j] + " ");
				}
				
				break;
				
			} catch (Exception e) {
				System.out.println("�ٽ� �õ����ּ���.");
			}
		}
	}
}













