package encap.good;

public class MainClass {
	public static void main(String[] args) {
		
		MyDate me = new MyDate();
		// me.year = 2021;	//이런 접근이  거의 없다
//		me.setYear(2022); //잘못된 값 입력입니다
		
		//getter, setter이용

		me.setYear(2021);
		System.out.println("년도:" + me.getYear() );
		
		me.setMonth(8);
		System.out.println("월 :" + me.getMonth() );
		
		me.setDay(30);
		System.out.println("일 :" + me.getDay() );
		
		me.setSsn("0202223451785");
		System.out.println("민번호" + me.getSsn());
	
//순서 차이 		
	}
	
}
