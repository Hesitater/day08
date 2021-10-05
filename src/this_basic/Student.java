package this_basic;

public class Student extends Person {

	String studentId;
	
	Student(String name, int age, String studentId) {
//		super(); //문법
//		this.name = name;
//		this.age = age;
		super(name,age);   //super사용한ㄱㅇ우
		this.studentId = studentId;
	}
	
	
	String info() {
		return super.info() + ", 학번:" + studentId;
//		return "이름:" + name + ", 나이:" + age + ", 학번:" + studentId;
	}
}
