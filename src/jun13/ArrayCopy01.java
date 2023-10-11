package jun13;

import java.util.Arrays;

// 배열 복사
// 깊은 복사: '실제 값'을 새로운 메모리 공간에 복사하는 것을 의미
// 얕은 복사: '주소 값'을 복사한다는 의미
public class ArrayCopy01 {
	public static void main(String[] args) {
		int num01 = 100;// P타입은 깊은 복사
		int num02 = num01;

		num01 = 2;
		num02 = 4;

		System.out.println(num01);// 2
		System.out.println(num02);// 4

		int[] arr01 = { 50, 100, 150 };
		int[] arr02 = arr01;
		int[] arr03 = new int[3];
		System.arraycopy(arr01, 0, arr03, 0, 3);

		/*
		 * src: 원본대상
		 * srcPos: 원본의 어느 위치부터 읽어올 것인지
		 * dest: 값을 담을 배열
		 * destPos: 어느 위치에 저장할 것인지
		 * length: 어느 길이만큼 읽어올 것인지 = 배열의 길이
		 */

		arr01[0] = 9;

		System.out.println(Arrays.toString(arr01));// [9, 100, 150]
		System.out.println(Arrays.toString(arr02));// [9, 100, 150]
		System.out.println(Arrays.toString(arr03));// [50, 100, 150]

		int[] arr04 = new int[5];
		System.arraycopy(arr03, 0, arr04, 2, 3);
		System.out.println(Arrays.toString(arr04));// [0, 0, 50, 100, 150]

		int[] arr05 = { 10, 20, 30, 40, 50 };
		int[] arr06 = new int[5];
		System.arraycopy(arr05, 1, arr06, 1, 3);
		System.out.println(Arrays.toString(arr06));// [0, 20, 30, 40, 0]

	}

}
