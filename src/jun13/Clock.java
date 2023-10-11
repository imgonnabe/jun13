package jun13;

import java.time.LocalDate;
import java.time.LocalDateTime;

// 사용하지 않는 import 지우기: ctrl + shift + O
// 아스키 코드 시계
public class Clock {
	public static void main(String[] args) {
		// 1 1
		// 3 11
		// 10 1010

		System.out.println(Integer.toBinaryString(60));// 111100

		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		System.out.println(ld.getYear());
		System.out.println(ld.getMonth());// 영어식
		System.out.println(ld.getMonthValue());// 숫자
		System.out.println(ld.getDayOfMonth());

		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt.getHour());
		System.out.println(ldt.getMinute());
		System.out.println(ldt.getSecond());

		int[] hour = new int[8];
		int h = ldt.getHour();
		for (int i = 0; i < hour.length; i++) {
			int a = h % 2;
			h = h / 2;
			hour[7 - i] = a;	
		}
		for (int i = 0; i < hour.length; i++) {
			System.out.print(hour[i]);
		}
	}

}
