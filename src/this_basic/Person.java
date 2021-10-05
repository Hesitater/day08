package this_basic;

public class Person {

	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;

		System.out.println("누구로 생성하던 이문장을 실행");
//		System.out.println(this);  this 확인용
	}

	Person(String name) { // 이름만 받아서 만드는 생성자
		this(name, 1);
//		this.name = name;
//		this.age = 1;
	}

	Person() {
		this("이름미정", 1);
//		this.name = "이름미정";
//		this.age = 1;		
	}

	String info() {
		return "이름:" + name + ", 나이:" + age;
	}

}
