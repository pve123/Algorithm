package 프로그래머스_해시;

import java.util.HashMap;
import java.util.Set;

public class Programmers_third {

	public int solution(String[][] clothes) {
		int answer = 1;
		HashMap<String, Integer> map = new HashMap<>();
		Set<String> set = map.keySet();
		for (int i = 0; i < clothes.length; i++) {
			map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
		}
		for (String string : set) {
			answer *= map.get(string) + 1;
		}

		return answer - 1;
	}

	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		Programmers_third p = new Programmers_third();
		String[][] clothes = { { "yellow_hat", "headgear" }, { "blue_sunglasses", "eyewear" },
				{ "green_turban", "headgear" } };
		int result = p.solution(clothes);
		System.out.println("경우의 수 : " + result);
		long end = System.currentTimeMillis();
		System.out.println("수행시간  : " + (double) (end - start) / 1000 + "(초)");
	}
}

//  (종류+1) * (종류+1) ... -1
