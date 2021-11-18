package hello2;

public class icecream {

	public static void main(String[] args) {

	// ** 반복, 출력 ,배열	
		
		//아이스크림 판매
		
// 아이스크림의 갯수
		int icecream = 5;
		// 아이스크림 판매갯수
		int[] odds = { 1, 2, 3, 4, 5 };
// 아이스크림 갯수
		int iceNum = 0;

// 여기 부터 반복
		while (true) {

			for (int i = 1; i <= odds[iceNum]; i++) {
				

// 만약에 1개가 팔렸으면
				if (i == odds[iceNum]) {
// 아이스크림이 팔리고 남은갯수
					icecream = icecream - 1; // 아이스크림 갯수 줄임
// 
				} else {
				}
			}
			System.out.println("아이스크림을" + (iceNum + 1) + "개 판매하였다.");
			iceNum++;
			System.out.print("남아있는 아이스크림은? ");
			System.out.println(icecream);
			System.out.println(); // 한칸 내리기
// 반복 멈추기
			if (icecream == 0) {
				break;
			}
		}
// 여기까지 반복
		System.out.println("완판");

	}

