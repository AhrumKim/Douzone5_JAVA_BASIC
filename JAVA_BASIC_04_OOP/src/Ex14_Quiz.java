class System{
	//System 이라흔 클래스 생성
	public static final print out;
	static {
		out = new print();
		
	}
}

//생성자 막기 private, public, static, 현재 클래스 타입으로 
//
class print{
	void add(int i) {System.out.println(i);}
	void add(String s) {System.out.println(s);}
}	
	

public class Ex14_Quiz {

	public static void main(String[] args) {
//		System.out.println("이건 어떻게 구현된 함수 일까요");
		
		//System
		//out
		//println
		//을 구현해 보세요
		//먼저 구현하신 조에게 커피 드릴게요 ^^(불금이니까요)
	}
}
