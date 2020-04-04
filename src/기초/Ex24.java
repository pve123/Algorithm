package 기초;

import java.util.Arrays;

// 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열추력
public class Ex24 {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 4, 1, 8, 7, 9 };
		int result = Arrays.stream(arr).min().getAsInt();
		arr = Arrays.stream(arr).filter(data -> data != result).toArray();
		System.out.println(Arrays.toString(arr));

	}
}