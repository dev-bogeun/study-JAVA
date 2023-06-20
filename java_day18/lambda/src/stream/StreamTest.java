package stream;

import java.util.ArrayList;
import java.util.Arrays;

public class StreamTest {
	public Integer getTwoTimes(Integer number) {
		return number * 2;
	}
	
	public static void main(String[] args) {
//		Arrays.asList()
//		�迭�� List�� ���氡��
//		Integer[] arData = {10, 20, 30, 40, 50};
//		���� ���� ���� List�� ���氡��
//		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50));
//		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(arData));
//		System.out.println(datas.toArray()[0]);
//		System.out.println(datas);
		
		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50));
		StreamTest streamTest = new StreamTest();
		
//		forEach() : �ݺ�
//		���� ���� ������ �ִ� �÷��� ��ü���� forEach �޼ҵ带 ����� �� �ִ�.
//		forEach() �޼ҵ忡�� Consumer �������̽� Ÿ���� ���� �����ؾ� �Ѵ�.
//		Consumer�� �Լ��� �������̽��̱� ������ ���ٽ��� ����� �� �ִ�.
//		�Ű��������� �÷��� ��ü �ȿ� �ִ� ������ ������� ����,
//		ȭ��ǥ �ڿ����� �����ϰ� ���� ������ �ۼ��Ѵ�.
		datas.stream().forEach(data -> System.out.println(data));
		datas.forEach(data -> System.out.println(data));
		datas.forEach(System.out::println);
		
//		map() : ���� �� ����
//		datas.stream().map(data -> data * 2).forEach(System.out::println);
		datas.stream().map(streamTest::getTwoTimes).forEach(System.out::println);
	}
}


















