package jun13;

public class Switch03 {
	public static void main(String[] args) {
		int num = (int) (Math.random() * 101);// 0~100
		// 90~100 A
		// 80~89 B
		// 70~79 C
		// 0~69 F
		switch (num / 10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default:
			System.out.println("F");
			break;
		}
	}

}
