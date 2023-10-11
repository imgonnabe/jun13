package jun13;

// 문자열을 입력받아서, 같은 문자가 연속적으로 반복되는 경우에 그 반복 횟수를 표시하여 문자열을 압축하기.
// 입력 예시: aaabbcccccca
// 출력 예시: a3b2c6a1
public class String03 {
	public static void main(String[] args) {
		String[] str = new String[] { "a", "a", "a", "b", "b", "c", "c", "c", "c", "c", "c", "a" };
		int sum = 0;
		int sum2 = 0;
		int sum3 = 0;
		for (int i = 0; i < str.length; i++) {
			if (str[i] == "a") {
				sum++;
			} else if (str[i] == "b") {
				sum2++;
			} else {
				sum3++;
			}
		}
		System.out.println(sum + "a" + sum2 + "b" + sum3 + "c");
	}
}
