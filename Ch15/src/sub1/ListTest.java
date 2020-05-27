package sub1;

import java.util.ArrayList;
import java.util.List;

/*
 * 날짜 : 2020/05/20
 * 이름 : 최정한
 * 내용 : 컬렉션 프레임워크  실습하기 교재 p724
 */
public class ListTest {
	public static void main(String[] args) {
		
		// 리스트 생성 및 숫자 데이터 저장
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.remove(2);
		list1.add(0, 3); // 인덱스 번호 0번에 3을 집어넣는다.
		
		for(int i=0; i<list1.size(); i++) {
			System.out.printf("list1의 %d번째 원소 : %d\n", i+1, list1.get(i));
		}
		
		// 리스트 생성 및 문자열 데이터 저장
		List<String> list2 = new ArrayList<>();
		list2.add("김유신");
		list2.add("김춘추");
		list2.add("장보고");
		list2.add("강감찬");
		list2.add("이순신");
		
		for(String name : list2) {
			System.out.println("name : "+name);
		}
		
		// 리스트 생성 및 사과 데이터를 저장
		List<Apple> list3 = new ArrayList<>();
		list3.add(new Apple("한국", 3000));
		list3.add(new Apple("미국", 2000));
		list3.add(new Apple("일본", 2500));
		
		// 한국 사과 출력
		Apple a1 = list3.get(0);
		a1.show();
		
		// 미국 사과 출력
		list3.get(1).show();
	}
}
