package 정렬;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		System.out.println("========== 삽입 정렬 ==========");
		int[] arr = { 5, 7, 8, 9, 4, 3, 1, 2, 6 }; // 정렬할 배열
		int tmp, j;
		System.out.println("정렬 하기 전 : " + Arrays.toString(arr)); // 정렬 하기전
		for (int i = 1; i < arr.length; i++) {
			tmp = arr[i];

			for (j = i - 1; j >= 0 && arr[j] > tmp; j--) {
				arr[j + 1] = arr[j];
			} // End inner FOR문
			arr[j + 1] = tmp;
		} // End Outer FOR문

		System.out.println("정렬 후 : " + Arrays.toString(arr)); // 정렬 후
		System.out.println("최선 : O(n)");
		System.out.println("최악 : O(n^2)");

	}
}
