package sub1;

/*
 * 날짜 : 2020/05/20
 * 이름 : 최정한
 * 내용 : 제네릭 실습하기 교재 p654
 */
public class GenericTest {
	public static void main(String[] args) {
		
		Apple  a = new Apple("한국", 3000);
		Banana b = new Banana("대만", 2000);
		
		FruitBox<Apple> applebox = new FruitBox<>();
		applebox.setFruit(a);
		
		FruitBox<Banana> bananabox = new FruitBox<>();
		bananabox.setFruit(b);
		
	}
}
