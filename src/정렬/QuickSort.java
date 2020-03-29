package 정렬;

import java.util.Arrays;

public class QuickSort {

	public void quick(int[] arr, int l, int r) {

		int left = l;
		int right = r;
		int pivot = arr[(l + r) / 2];

		do {
			while (arr[left] < pivot)
				left++;
			while (arr[right] > pivot)
				right--;

			if (left <= right) {
				int tmp = arr[left];
				arr[left] = arr[right];
				arr[right] = tmp;
				left++;
				right--;
			}

		} while (left <= right);
		
		if(l < right) quick(arr, l, right);
		if(r > left) quick(arr, left, r);
	}

	public static void main(String[] args) {

		QuickSort quick = new QuickSort();
		System.out.println("========== 퀵 정렬 ==========");
		int[] arr = { 5, 7, 8, 9, 4, 3, 1, 2, 6 }; // 정렬할 배열
		System.out.println("정렬 하기 전 : " + Arrays.toString(arr)); // 정렬 하기전
		quick.quick(arr, 0, arr.length - 1);
		System.out.println("정렬 후 : " + Arrays.toString(arr)); // 정렬 하기전
		System.out.println("최선 : O(nlogn)");
		System.out.println("최악 : O(n^2)");

	}

}
