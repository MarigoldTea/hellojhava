import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// 랜덤 점심 프로그램
		System.out.println("머 먹지 프로그램 시작");
		// 메뉴 추가(프로그램 자체에서 메뉴 설정)
		// 메뉴 추가(이 프로그램 사용자가 직접 입력)
		// 메뉴들을 담을수 있는 공간을 만들기
		 ArrayList<String> MenuList = new ArrayList<String>(); // 이 객체의 이름은 메뉴리스트이다
		 
	    // 사용자로 부터 입력을 받기 위한 준비
		Scanner sc =new Scanner(System.in);
		System.out.println();
		// 메뉴를 입력
	//	System.out.println("숫자를 입력하시오");
	//	int a =sc.nextInt();
	//	System.out.println("당신이 입력한 숫자는? " +a );
		
		// 여기서 부터 반복
		while(true) {
		 System.out.println("메뉴를 입력하세요 ");
		 System.out.print("메뉴입력: ");
	//	String Menu = sc.nextLine(); // 숫자 입력 받고 난뒤 엔터키값(개행문자) 처리하기 위해
		String Menu = sc.nextLine(); // 메뉴를 입력 받기
		System.out.println("입력값: "   + Menu);
		// 만약에 입력값이 0이면 반복문을 나가자
		if (Menu.equals("0")) {   // 문자열을 비교 할 때 equals 메소드를 사용
			break;
		}
	    // 메뉴 리스트에 담기
		MenuList.add(Menu);
		// 여기까지 반복
		}
//		System.out.println("당신이 입력한 메뉴의, 갯수는? "+ MenuList.size());
//		System.out.println("당신이 입력한 메뉴는? "+ MenuList.get(0));
		
		// 사용자가 여러개 입력을 한 메뉴를 한번에 출력하기 위해
		for (String m : MenuList) {
			System.out.println("당신이 입력한 메뉴는? "+ m);
		}
		// 메뉴들을 입력하고 저장된 
		// 메뉴들 중에 하나를 추천
		// 추천 결과를 출력
	    
		Random rnd = new Random();
		int rnum = rnd.nextInt(MenuList.size());
		System.out.println("이 메뉴들 중에서 엄청난 알고리즘으로 ");
		System.out.println("선택된 메뉴는~~ 두구두구두구두구 ");
		System.out.println(MenuList.get(rnum) + " 입니다. " );
		System.out.println("맛있게 드세요. 감사합니다.");
	}

}
