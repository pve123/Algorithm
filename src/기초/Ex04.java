package 기초;



//문제 : 최빈수 ( 최빈수 개수가 동일한 경우 값이 큰게 출력 )
public class Ex04 {

	public static void main(String[] args) {

		int[] arr = { 4, 4, 4, 4, 4, 2, 2, 2, 3, 3, 1, 1, 1, 1 };
		int[] result = new int[arr.length];
		int cnt = 0;
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			result[arr[i]]++;
		}
		for (int i = 0; i < arr.length; i++) {

			if (cnt <= result[i]) {
				cnt = result[i];
				num = i;
			}
		}
		System.out.println("최빈수 : " + num);
		System.out.println("개수 : " + cnt);

	}
}
