package 기초;
//문제 : 거듭제곱

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {

		System.out.println("========== 거듭 제곱 =========");
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 적어주세요 : ");
		int num = scan.nextInt();
		scan.close();
		int result = 1;
		for (int i = 0; i < 3; i++) {
			result *= num;
		}
		System.out.println(num + "의 거듭제곱은 : " + result);

	}
}
