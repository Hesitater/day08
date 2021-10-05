package encap.good;

public class MyDate {

	private int year;
	private int month;
	private int day;
	private String ssn;

	/*
	 * 은닉된 변수에 값을 저장할 떄, 클래스 설계자가 미리 작성해놓은 getter,setter메서드를 사용 합니다.
	 * setter메서드의 선언
	 * 1. 값을 저장하기 위한 메서드 
	 * 2. 접근제어자 public으로, 이름은 set + 멤버변수명으로 지정
	 * 
	 */

	public void setYear(int year) {
		if( year < 1900 || year > 2021) { //검증하는 로직..?
			System.out.println("잘못된 값 입력입니다");
		} else {
			this.year = year;
		}
	}
	/*
	 * getter메서드의 선언
	 * 1. 값을 조회하기 위한 메서드
	 * 2. 접근제어자 public으로 이름을 get + 멤버변수명으로 지정
	 * 반환유형이있어야함 외부의값을 리턴해주기때문에
	 * 
	 */
	
	public int getYear() {
		return year;
	}
	
	/*
	 * #month , day, ssn 에 getter, setter를 생성
	 * month - 1~12월까지만 저장
	 * day - 1~31일 까지만 저장
	 * ssn - 13자리 까지만 저장 .length()
	 */
	
	
	public void setMonth(int month) {
		if( month > 12 || month < 1) {
			System.out.println("잘못된 값을 입력입니다");
		} else {
			this.month = month;
		}
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setDay(int day) {
		if( day < 1 || day > 31 ) {
			System.out.println("잘못된 값을 입력입니다");
		} else {
			this.day = day;
		}
	}
	
	public int getDay() {
		return day;
	}
	
	public void setSsn(String ssn) {
		if( ssn.length() != 13) {
			System.out.println("-를제외한 13자리수 을 입력입니다");
		} else {
			this.ssn = ssn;
		}
	}
	
	
	public String getSsn() {
		return ssn;
	}
	
	
}
