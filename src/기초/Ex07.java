package 기초;

import java.util.Scanner;

// 문제 : 두 수를 입력받고 최대공약수를 구하기
public class Ex07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("========== 최대공약수 ==========");
		System.out.print("A의 값을 입력 : ");
		int a = scan.nextInt();
		System.out.print("B의 값을 입력 : ");
		int b = scan.nextInt();
		scan.close();
		int min = a > b ? b : a;
		int result=1;
		for (int i = min; i >= 1; i--) {
			if (a % min == 0 && b % min == 0) {
				result = min;
				break;
			}
		}

		System.out.println(a + "와 " + b + "의 최대공약수 : " + result);
	}
}
