package hello2;

public class Hello2Class {
	public static void main(String[] args) {
		
		int st; // 변수명은 숫자로 시작할 수 없다.
		int a;  // 변수명에 특수문자를 사용할 수 없다.
		int classa; // 키워드를 변수명으로 사용할 수 없다.
		
				
		// 안녕하세요
		// 나는 누구입니다
		// 잘 부탁드립니다
		String b ="1회"; // 문자열 변수 선언
		String c ="2회";
		
		int tree = 5; // 나무의 갯수
		
		//나무를 넘길 수 있는 횟수
		//1번 나무는 2번 
		//2번 나무는 3번
		//3번 나무는 1번
		//4번 나무는 5번
		//5번 나무는 10번
		
		System.out.println("나무가 " + tree + "그루가 있다");
		System.out.println("나무를 도끼로" + 1 + "회 찍었다");
		System.out.println("나무가 넘어가지 않는다");
		System.out.println("1번 나무를 도끼로"  + 2 + "회 찍었다");
		System.out.println("1번 나무가 넘어간다");
		System.out.print("남아있는 나무는? ");
		tree = tree - 1;
		System.out.println(tree); 
		
				
		for (int i = 0; i < 10; i++) {
			System.out.println("나무를 도끼로" + i + "회 찍었다");
			System.out.println("나무가 넘어가지 않는다");	
		    // 만약에 10번이 찍혔으면
			if (i == 9) {
			// 나무가 넘어간다를 출력
				System.out.println("나무가 넘어간다");	
			   // 10번이 아니면
			} else {
				// 나무가 넘어가지 않는다를 출력
				System.out.println("나무가 넘어가지 않는다");
			
			}
			
				
		}
		System.out.print("남아있는 나무는? ");
		System.out.println(tree); 

 }
	
}
