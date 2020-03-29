package 기초;

import java.util.*;
// 문제 : 배열 중복 제거 후 출력값, 오름차순, 내림차순 출력
public class Ex01 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 2, 2, 5, 4, 6, 7, 9, 8, 4, 6, 6, 8 };
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {

			if (!list.contains(arr[i])) {
				list.add(arr[i]);
			}
		} // 중복아닌거만 추가
		System.out.print("정렬 하기 전               : ");
		for (Integer result : list) {
			System.out.print(result + " ");
		}
		Collections.sort(list);
		System.out.print("\n정렬 후 ( 오름차순 ) : ");
		for (Integer result : list) {
			System.out.print(result + " ");
		}
		Collections.reverse(list);
		System.out.print("\n정렬 후 ( 내림차순 ) : ");
		for (Integer result : list) {
			System.out.print(result + " ");

		}
	}
}
