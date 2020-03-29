package 프로그래머스_정렬;

import java.util.Arrays;

public class Programmers_first {

	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {
			int[] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
			Arrays.sort(temp);
			answer[i] = temp[commands[i][2] - 1];

		}

		return answer;

	}

	public static void main(String[] args) {

		Programmers_first p = new Programmers_first();
		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };

		long start = System.currentTimeMillis();
		int[] result = p.solution(array, commands);
		System.out.println(Arrays.toString(result));
		long end = System.currentTimeMillis();
		System.out.println("실행 시간: " + (double) (end - start) / 1000 + "초");
	}
}
