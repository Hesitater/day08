package super_basic;

public class MainClass {

	public static void main(String[] args) {
		
//		Person p = new Person("홍길동", 10);
////		System.out.println(p);   Person this 자기자신 확인
//		
//		
//		Person p2 = new Person("김태희");
//		
//		Person p3 = new Person();
//		
//		
//		System.out.println(p.info());
//		System.out.println(p2.info());
//		System.out.println(p3.info());
//		
		
		
		Student s = new Student("홍길동", 10, "20001212");
		System.out.println(s.info());
		
		Mother m = new Mother();
		System.out.println(m.info());
		
	}
}
