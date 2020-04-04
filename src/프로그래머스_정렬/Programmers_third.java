package 프로그래머스_정렬;

import java.util.Arrays;
import java.util.Comparator;

public class Programmers_third {

	public String solution(String[] str, int index) {

		Arrays.sort(str, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {

				return o1.charAt(index) - o2.charAt(index) == 0 ? o1.compareTo(o2)
						: o1.charAt(index) - o2.charAt(index);
			}
		});

		return Arrays.toString(str);
	}

	public static void main(String[] args) {

		Programmers_third p = new Programmers_third();
		String[] str = { "car", "sun", "bed" };
		System.out.println("정렬 전 : " + Arrays.toString(str));
		System.out.println("============================");
		long start = System.currentTimeMillis();
		String result = p.solution(str, 0);
		System.out.println("정렬 후 : " + result);
		long end = System.currentTimeMillis();
		System.out.println("수행시간 : " + (double) (end - start) / 1000 + "초(s)");

	}
}
