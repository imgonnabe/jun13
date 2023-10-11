package jun13;

import java.util.Arrays;

// String 사용법
/*
 * 문자열, "값", 값 불변, 주소, 참조타입
 * 
 */
public class String01 {
	public static void main(String[] args) {
		int num = 10;
		int num2 = 10;
		String str = new String("Hi");
		String str2 = new String("Hi");

		if (str.equals(str2)) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}

		// 문자열 = 문자 + 문자 + 문자 ...
		char[] ch = { '가', '&', 'A', '1' };
		String str3 = new String(ch);// 생성자는 메소드
		System.out.println(str3);// 가&A1

		byte[] by = new byte[] { 65, 66, 67, 68, 69, 70 };
		String str4 = new String(by);
		System.out.println(str4);// ABCDEF

		String str5 = new String(by, 0, 2);// src, 시작위치, length
		System.out.println(str5);// AB

		str2 = "안녕하세요.";
		System.out.println(str2.length());// 6
		char ch2 = str2.charAt(5);
		System.out.println(ch2);// .

		for (int i = 0; i < str2.length(); i++) {
			System.out.print(str2.charAt(i));// 안녕하세요.
		}

		str2 = "가나다라마바사";
		System.out.println(str2.length());// 7
		System.out.println(str2.charAt(str2.length() - 1));// 사
		
		String str6 = "vehnlgweohiiwaeejkweahgijgvbajkehfkagwghawjklghawejk";
		// 여기에서 e가 몇 개 있는지 개수를 출력
		int count = 0;
		for (int i = 0; i < str6.length(); i++) {
			if (str6.charAt(i) == 'e') {
				count++;
			}
		}
		System.out.println(count);
		
		String str7 = str2.concat("님");// "가나다라마바사" + 님
		System.out.println(str7);// 가나다라마바사님
		
		// 해당 글자를 포함하고 있는지 물어보기
		System.out.println(str2.contains("님"));// false
		System.out.println(str7.contains("님"));// true
		System.out.println(str7.contains("가나다"));// true
		
		// indexOf
		System.out.println(str7.indexOf("나"));// 1
		System.out.println(str7.indexOf("라마바"));// 3
		System.out.println(str7.indexOf("타"));// -1
		
		// replaceAll
		String apple = "apple";
		apple = apple.replaceAll("p", "피");
		System.out.println(apple);// a피피le
		
		// substring
		String result = str2.substring(str2.indexOf("라"));// 가나다라마바사
		System.out.println(result);// 라마바사
		
		result = str2.substring(3, 4);
		System.out.println(result);// 라
		
		// equalsIgnoreCase()
		apple = "apple";
		System.out.println(apple.equalsIgnoreCase("apple"));// true
		System.out.println(apple.equalsIgnoreCase("APPLE"));// true
		System.out.println(apple.equals("apple"));// true
		System.out.println(apple.equals("APPLE"));// false
		
		// getByte()
		byte[] appleByte = apple.getBytes();
		System.out.println(Arrays.toString(appleByte));// [97, 112, 112, 108, 101]
	}

}
