public class Quiz1 {
 
	/*
	 23-03-17
	 금요일 쿼즈 

우리는 백화점 경품 시스템을 만들려고 한다
경품 시스템은 나오는 점수에 따라 경품을 지급하는 시스템이다
경품 추첨시 1000 점수가 나오면
경품으로 TV , NoteBook , 냉장고 , 한우세트 , 휴지
경품 추첨시 900 점수가 나오면
경품으로 NoteBook , 냉장고 , 한우세트 , 휴지
경품 추첨시 800 점수가 나오면
경품으로 냉장고 , 한우세트 , 휴지
경품 추첨시 700 점수가 나오면
경품으로 한우세트 , 휴지
경품 추첨시 600 점수가 나오면
경품으로 휴지
그외 점수는 100 ~ 500 까지는 칫솔 
경품시스템의 점수 범위는 100 ~ 1000 점까지 한정되어 있다
사용자가 경품 시스템을 사용시 랜덤하게 100 ~ 1000까지의 값이 나오게 되어 있습니다.
프로그램을 한번 실행하면 그 때 랜덤값이 나오고 그 랜덤값에 의해서 경품을 출력하면 되요
	 */
	
	
	public static void main(String[] args) {
		
		int score = (int)(Math.random()*10 +1)*100;//1~100 까지 난수(중복값 나와요)
		
		System.out.println("경품 랜덤 함수: " + score);//0~9
		System.out.println("경품 상품: ");
		
		switch(score) {
		case 1000: System.out.println(" TV ");
		case 900: System.out.println("NoteBook");
		case 800: System.out.println("냉장고");	            
		case 700: System.out.println("한우세트");
		case 600: System.out.println("휴지");
		break;
		default: System.out.println("칫솔 ");		
	}
  }
}

