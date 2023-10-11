package jun13;

// 스위치
/*
 * switch(검색변수){
 * 		case (조건):
 * 			조건이 참일때 실행할 문장;
 * 			break;
 * 		case (조건2):
 * 			조건2가 참일때 실행할 문장;
 * 			break;
 * 		default:
 * 			위 case에 모두 거짓일때 실행할 문장;
 * }
 * 
 * 주의: 검색변수는 수치형일 경우 int타입 이하만 가능하다.
 * 			long, 실수형은 불가능
 */
public class Switch01 {
	public static void main(String[] args) {
		int num = 45;
		switch (num) {
		case 20:
			System.out.println("num은 20입니다.");
//			break;
		case 45:
			System.out.println("num은 45입니다.");
//			break;
		default:
			System.out.println("num은 10, 20이 아닙니다.");
			break;
		}
	}

}
