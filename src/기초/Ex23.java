package 기초;

import java.util.Arrays;

//문제 :  s에는 공백으로 구분된 숫자들이 저장되어 있습니다. str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 (최소값) (최대값)형태의 문자열을 반환
public class Ex23 {

	public static void main(String[] args) {

		String str = "1 11 31 4 61 31 95";
		String[] temp = new String[str.split(" ").length];
		temp = str.split(" ");
		int[] temp2 = new int[temp.length];
		for (int i = 0; i < temp2.length; i++) {
			temp2[i] = Integer.parseInt(temp[i]);
		}
		Arrays.sort(temp2);
		for (int i = 0; i < temp2.length; i++) {
			temp[i] = String.valueOf(temp2[i]);
		}

		str = String.format("최솟값 : %3s , 최댓값 : %3s", temp[0], temp[temp.length - 1]);
		System.out.println(str);

	}
}
