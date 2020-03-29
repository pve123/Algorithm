package 프로그래머스_해시;

import java.util.Arrays;

public class Programmers_first {

	public String solution(String[] participant, String[] completion) {
		String answer = "";

		int i;
		Arrays.sort(participant);
		Arrays.sort(completion);
		for (i = 0; i < completion.length; i++) {
			if (!participant[i].equals(completion[i])) {
				return participant[i];
			}
		}
		answer = participant[i];
		return answer;
	}

	public static void main(String[] args) {
		Programmers_first p = new Programmers_first();
		String[] participant = { "leo", "kiki", "eden" };
		String[] completion = { "eden", "kiki" };
		long start = System.currentTimeMillis();
		String result = p.solution(participant, completion);
		System.out.println(result);
		long end = System.currentTimeMillis();
		System.out.println("실행 시간: " + (double) (end - start) / 1000 + "초");
	}
}
