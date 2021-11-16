package hello2;

public class Hello2Class {
	public static void main(String[] args) {
		
		int st; // 변수명은 숫자로 시작할 수 없다.
		int a;  // 변수명에 특수문자를 사용할 수 없다.
		int classa; // 키워드를 변수명으로 사용할 수 없다.
		
		
		
		
		// 안녕하세요
		// 나는 누구입니다
		// 잘 부탁드립니다
		String b ="조재웅"; // 문자열 변수 선언
		a = 100; // 위에 미리 선언됨 중복 불가		
		System.out.println("안녕하세요");
		System.out.println("나는" + b + "입니다");
		System.out.println("잘 부탁드립니다");
		System.out.println(b+"인사드립니다");
		System.out.println(b+"가 집에 갑니다");
		System.out.print(b+"체력은 "); // println 은 출력하고 줄바꿈도 포함 
		System.out.println(a);
		

 }
	
}
