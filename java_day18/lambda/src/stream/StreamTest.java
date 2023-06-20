package stream;

import java.util.ArrayList;
import java.util.Arrays;

public class StreamTest {
	public Integer getTwoTimes(Integer number) {
		return number * 2;
	}
	
	public static void main(String[] args) {
//		Arrays.asList()
//		배열을 List로 변경가능
//		Integer[] arData = {10, 20, 30, 40, 50};
//		여러 개의 값을 List로 변경가능
//		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50));
//		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(arData));
//		System.out.println(datas.toArray()[0]);
//		System.out.println(datas);
		
		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50));
		StreamTest streamTest = new StreamTest();
		
//		forEach() : 반복
//		여러 값을 가지고 있는 컬렉션 객체에서 forEach 메소드를 사용할 수 있다.
//		forEach() 메소드에는 Consumer 인터페이스 타입의 값을 전달해야 한다.
//		Consumer는 함수형 인터페이스이기 때문에 람다식을 사용할 수 있다.
//		매개변수에는 컬렉션 객체 안에 있는 값들이 순서대로 담기고,
//		화살표 뒤에서는 실행하고 싶은 문장을 작성한다.
		datas.stream().forEach(data -> System.out.println(data));
		datas.forEach(data -> System.out.println(data));
		datas.forEach(System.out::println);
		
//		map() : 기존 값 변경
//		datas.stream().map(data -> data * 2).forEach(System.out::println);
		datas.stream().map(streamTest::getTwoTimes).forEach(System.out::println);
	}
}


















