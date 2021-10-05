package super_basic;

public class Employee extends Person {

	String department;

	Employee(String name, int age, String department) {
//		super(name, age); //빌려쓰기때문에
		this.name = name;
		this.age = age;
		this.department = department;

	}

	String info() {
		return "이름:" + name + ", 나이:" + age + ", 부서:" + department;
	}
}
