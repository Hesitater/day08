package encap.bad;

public class MainClass {
	public static void main(String[] args) {
		// 멤버변수가 public이라면 잘못된 값이 저장 될 수도 있다는 뜻
		
		MyDate me = new MyDate();
		me.year = 2021;
		me.month =12;
		me.day = 100;
		me.ssn = "이거 뭔데요?";
		
		
		 me.info();
		 
				
		
		
	}
}
