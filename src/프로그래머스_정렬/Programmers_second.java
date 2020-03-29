package 프로그래머스_정렬;

import java.util.Arrays;
import java.util.Comparator;

public class Programmers_second {

	public String solution(int[] numbers) {
		String answer = "";

		String[] str = new String[numbers.length];
		for (int i = 0; i < str.length; i++) {
			str[i] = String.valueOf(numbers[i]);
		} // 결과타입이 스트링이니 int타입을 스트링 객체타입으로 변환후 배열에 담음

		Arrays.sort(str, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if (o1.length() == o2.length()) {
					return o2.compareTo(o1);
				} //길이같을때

				return (o2 + o1).compareTo(o1 + o2);
			}

		});
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < str.length; i++) {
			sb.append(str[i]);
		}
		answer = new String(sb);
		return answer;
	}

	public static void main(String[] args) {
		Programmers_second p = new Programmers_second();
		int[] numbers = { 3, 30, 34, 5, 9 };
		long start = System.currentTimeMillis();
		String result = p.solution(numbers);
		System.out.println(result);
		long end = System.currentTimeMillis();
		System.out.println("실행 시간: " + (double) (end - start) / 1000 + "초");
	}
}
