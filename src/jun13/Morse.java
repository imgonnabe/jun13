package jun13;

import java.util.Arrays;

// 모스부호
// 문자열 형식으로 입력 받은 모스코드(dot: . dash:-)를 해독하여 영어 문장으로 출력하는 프로그램을 작성하시오.
// 글자와 글자 사이는 공백 하나, 단어와 단어 사이는 공백 두개로 구분한다.
// 예를 들어, 다음 모스부호는 "he sleeps early"로 해석해야 한다.
// .... .  ... .-.. . . .--. ...  . .- .-. .-.. -.--
public class Morse {
	public static void main(String[] args) {
		String str01 = ".... .  ... .-.. . . .--. ...  . .- .-. .-.. -.--";
		String[] str01Split = str01.split(" ");
		System.out.println(Arrays.toString(str01Split));
		String[] str = new String[] { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
				".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--",
				"--.." };
		System.out.println(Arrays.toString(str));

		for (int i = 0; i < str01Split.length; i++) {
			for (int j = 0; j < str.length; j++) {

				if (str01Split[i].equals(str[j])) {
					System.out.print((char) (j + 65));
				} else if (str01Split[i].equals("")) {
					System.out.print(" ");
				}
			}
		}
	}
}
