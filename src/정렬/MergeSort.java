package 정렬;

import java.util.Arrays;

public class MergeSort {

	private int[] mergesort;

	public void mergesecond(int[] arr, int l, int middle, int r) {

		mergesort = new int[arr.length];
		int i = l;
		int j = middle + 1;
		int k = l;

		while (i <= middle && j <= r) {

			if (arr[i] < arr[j]) {
				mergesort[k] = arr[i];
				i++;
			} else {
				mergesort[k] = arr[j];
				j++;
			}
			k++;
		}

		if (i > middle) {
			for (int t = j; t <= r; k++, t++) {
				mergesort[k] = arr[t];
			}
		} else {
			for (int t = i; t <= middle; k++, t++) {
				mergesort[k] = arr[t];
			}
		}

		for (int t = l; t <= r; t++) {
			arr[t] = mergesort[t];
		}
	}

	public void mergefirst(int[] arr, int l, int r) {

		if (l < r) {
			int middle = (l + r) / 2;
			mergefirst(arr, l, middle);
			mergefirst(arr, middle + 1, r);
			mergesecond(arr, l, middle, r);
		}
	}

	public static void main(String[] args) {

		MergeSort merge = new MergeSort();
		System.out.println("========== 합병 정렬 ==========");
		int[] arr = { 5, 7, 8, 9, 4, 3, 1, 2, 6 }; // 정렬할 배열
		System.out.println("정렬 하기 전 : " + Arrays.toString(arr)); // 정렬 하기전
		merge.mergefirst(arr, 0, arr.length - 1);
		System.out.println("정렬 후 : " + Arrays.toString(arr)); // 정렬 후
		System.out.println("최선 / 최악 : O(nlogn)");

	}
}
