package modi.protec.pac1;

public class B {

	public B() {
		A a = new A();
		a.a = 1;
		a.method();
//		a.a  // clone() 안보임
//		super. // clone() 가보임
		
	}

}
