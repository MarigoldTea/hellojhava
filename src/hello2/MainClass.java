package hello2;

public class MainClass {

	public static void main(String[] args) {
		// 반복문을 해보자
//		int i = 0;   //초기 값
//		while (i < 5) { // 조건이 참일때 거짓인가
//		    System.out.println("while 문이 " + (i + 1) + "번째 반복 실행중입니다.");
//		    i++; // 1씩 증가
//
//		} // While 
//        System.out.println("while 문이 종료된 후 변수 i의 값은 " + i + "입니다.");
        
		int tree = 1000; 
		
		
		for (int i = 0; i < 0; i++) {
			System.out.println(" 나무를 도끼로 " + i + "회 찍었다");
			
			if (i == 9) {     // 만약에 10번이 찍혔으면
				
				System.out.println("나무가 넘어간다"); // 나무가 넘어간다를 출력
			
			} else {   // 10번이 아니면
				
				System.out.println("나무가 넘어가지 않는다");  // 나무가 넘어가지 않는다를 출력
			}
		}
		System.out.print("남아있는 나무는? : ");
		System.out.println(tree);
        
		System.out.println("...");
		
		for (int i = 0; i < 10; i++) {
			System.out.println(" 100원 짜리 과자를  " + (i+1) + "개 사먹었다.");
			
			if (i == 9) {     // 만약에 10번이 찍혔으면
				
				System.out.println("수중에 돈이없다."); 
			
			} else {   // 10번이 아니면
				
				System.out.println("돈이 남아있다. ");  			
				tree = tree - 100;
			
			System.out.print("남아있는 돈은? : ");
			System.out.println(tree);
		}
	} // main
  // class 
	}
}