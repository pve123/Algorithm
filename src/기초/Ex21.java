package 기초;

import java.util.Arrays;

//n의 각 자릿수를 큰것부터 작은 순으로 정렬
//예를들어 n이 118372 면 873211을 리턴
public class Ex21 {

	public static void main(String[] args) {

		int n = 118372;
		String result = "";
		char[] c = new char[String.valueOf(n).length()];

		int i;
		for (i = 0; i < c.length; i++) {
			c[i] = String.valueOf(n).charAt(i);
		}

		Arrays.sort(c);

		for (int j = i - 1; j >= 0; j--) {
			result += c[j];
		}
		System.out.println(Integer.parseInt(result));
	}

}
