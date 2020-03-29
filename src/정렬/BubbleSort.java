package 정렬;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		System.out.println("========== 버블 정렬 ==========");
		int[] arr = { 5, 7, 8, 9, 4, 3, 1, 2, 6 }; // 정렬할 배열
		int tmp; 
		System.out.println("정렬 하기 전 : " + Arrays.toString(arr)); //정렬 하기전 
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length - 1 - i; j++) {

				if (arr[j] > arr[j + 1]) {
					tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}

			}// End inner FOR문
		}// End Outer FOR문

		System.out.println("정렬 후 : " + Arrays.toString(arr)); //정렬 후
		System.out.println("최악 / 최선 : O(n^2)");
		
	}
}
