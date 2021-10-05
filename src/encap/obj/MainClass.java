package encap.obj;

public class MainClass {
	public static void main(String[] args) {
		
	
		//Hotel안에 있는 chef와 emp의 사용
		Hotel h = new Hotel();
		
//		h.getChef();
		Chef chef = h.getChef();
		chef.cooking();
		
		h.getEmp();
//		Employee emp = h.getEmp();
//		emp.working();
		h.getEmp().working();

		//setter의 사용
		//메인에서 만든걸  private Chef chef에 집어넣어볼까?
		 
//		Chef c = new Chef(); //c Chef를 만들어 넣는다
//		h.setChef(c);    //아래와 같은것
		
		h.setChef(new Chef());
		// 위에 Hotel에 new Chef를 넣은것?
		
		
		
	}
}
