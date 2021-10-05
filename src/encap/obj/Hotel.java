package encap.obj;

public class Hotel {

	// 타입  이름 ;  스트링   name;
	private Chef chef;  //  == 접근자 타입  이름;
 	private Employee emp;
	
	
	public Hotel() { //초기값을 지정하려면...?
		this.chef = new Chef();
		this.emp = new Employee();
	}
	
	//chef의  getter, setter
	
	public void setChef(Chef chef) {
		this.chef = chef;  
	}
	// 위에 꺼 클래스를 매개변수로 받아주는 모형
	
	
	public Chef getChef() {
		return chef;
	}
	
	
	//emp에 getter, setter
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
	public Employee getEmp() {
		return emp;
	}
	
	
	
}
