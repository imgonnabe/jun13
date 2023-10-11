package jun13;

// 1부터 10,000까지 8이라는 숫자가 총 몇번 나오는가?
// 8이 포함되어 있는 숫자의 개수를 카운팅 하는 것이 아니라 8이라는 숫자를 모두 카운팅 해야 한다.
// 예를 들어 8808은 3, 8888은 4로 카운팅 해야 함
public class Eight {
	public static void main(String[] args) {

		int count = 0;
		for (int i = 1; i <= 10000; i++) {
			if (i % 10 == 8) {
				count++;
			}
			if ((i / 10) % 10 == 8) {
				count++;
			}
			if ((i / 100) % 10 == 8) {
				count++;
			}
			if ((i / 1000) % 10 == 8) {
				count++;
			}
		}
		System.out.println(count);
	}
}
