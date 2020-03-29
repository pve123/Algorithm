package 기초;

import java.util.Arrays;
import java.util.Scanner;

//문제 : 팰린드롬 ( 팰린드롬 : 좌우대칭 )
//ex ) 12521

public class Ex15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("팰린드롬 숫자를 적어주세요 :");
		String str = scan.nextLine();
		scan.close();
		char[] c = new char[str.length()];

		boolean result = true;
		for (int i = 0; i < c.length; i++) {
			c[i] = str.charAt(i);
		}

		System.out.println(Arrays.toString(c));

		for (int i = 0; i < c.length / 2; i++) {

			if (c[i] != c[c.length - 1 - i]) {
				result = false;
			}
		}

		String s = result == true ? "팰린드롬 입니다." : "팰린드롬이 아닙니다";

		System.out.println(str + "은 " + s);
	}
}
