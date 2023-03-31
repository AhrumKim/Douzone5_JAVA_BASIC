package kr.or.kosa.dto;

import java.util.Scanner;

public class Lotto {
	private Scanner scanner;
	private int[] numbers = new int[6];	

	public Lotto() {
		scanner= new Scanner(System.in);
	}
	private String Menu() {
		
		System.out.println("=====================================");
		System.out.println("==========1.로또 번호 추첨하기=============");
		System.out.println("===========2. 종료하기=================");
		System.out.println("========로또 번호를 추첨하시겠습니까?========");
		System.out.println("1.YES  2. NO (원하는 메뉴 번호를 입력하세요^_^");
		 int num = scanner.nextInt();
		 
		 
	}
		
		
		private void Select_Menu() {		
						
		do {
		// 1. 1~45 까지의 난수를 발생시켜서 6개의 정수값을 배열에 담기
		for (int i = 0; i < numbers.length; i++) {
			//Math.ramdom()의 값이 0과 1사이이기 때문에 45를 곱하면 0~44 사이가 나오게 됩니다.
			//0~45 의 전체 범위에 +1을 하게 되면 범위가 1~45로 변
			int number = (int) (Math.random() * 45) + 1;
			// 2. 배열에 담긴 6개의 배열값은 중복값이 나오면 안됨 (중복값 검증)
			// 중복값 검증을 for문으로 수행
			boolean checking = false;
			//배열의 처음부터 값을 설정한 곳 까지 같은 값을 가지는지 비교
			for (int j = 0; j < i; j++) {]					
					
			}
			//같은 값을 가진다면 반복문 실행 전으로 돌아가 난수 재생성 및 재검증
			if (checking) {
				i--;
			} else {	//같은 값을 가지지 않는다면 난수값 설정
				numbers[i] = number;
			}
		}
		
		// 3. 배열에 있는 6개의 값은 낮은 순으로 정렬 시키기 (정렬 : 자리바꿈(swap))
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}

		// 4. 결과를 담고있는 배열을 출력하기
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}while(num=1);
		
}
		public void start() {
			Select_Menu();
			
		}
}