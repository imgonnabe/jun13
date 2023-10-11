package jun13;

import java.util.Scanner;

// 회사 엘레베이터
public class Switch04 {
	public static void main(String[] args) {
		int input;
		Scanner sc = new Scanner(System.in);

		System.out.println("직급을 선택하세요.");
		System.out.print("1. 인턴 \n 2. 대리 \n 3. 과장 \n 4. 부장 \n 5. 사장\n");


		boolean a = true;
		while (a) {
			input = sc.nextInt();
			System.out.print("당신이 올라갈 수 있는 층은 ");
			
			switch (input) {
			case 5:
				System.out.print("5층, ");
			case 4:
				System.out.print("4층, ");
			case 3:
				System.out.print("3층, ");
			case 2:
				System.out.print("2층, ");
			case 1:
				System.out.println("1층입니다.");
				a = !a;
				break;
			default:
				System.out.println("\n다시 입력하세요.");

			}
		}
		sc.close();
	}

}
