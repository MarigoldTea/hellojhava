package hello2;

public class MainClass {

	public static void main(String[] args) {
			
		int snacks =1000;
		
		for (int i = 0; i < 10; i++) {
			System.out.println(" 100원 짜리 과자를  " + (i + 1) + "개 사먹었다.");

			if (i == 9) { // 만약에 10번이 찍혔으면

				System.out.println("수중에 돈이없다.");

			} else { // 10번이 아니면

				System.out.println("돈이 남아있다. ");
				snacks = snacks - 100;

				System.out.print("남아있는 돈은? : ");
				System.out.println(snacks);
			}
		}
		
		

	}
}

// mann
// class
