package 기초;

import java.util.Scanner;

// 문제 : 피보나치
public class Ex02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("피보나치 인덱스 값  : ");
		int num = scan.nextInt();
		scan.close();
		int first = 0;
		int second = 1;
		int sum = 0;
		if (num <= 2) {
			sum = 1;
		}
		for (int i = 2; i <= num; i++) {

			sum = first + second;
			first = second;
			second = sum;

		}

		System.out.println(num + "번째 피보나치 수는 : " + sum);
		
	}

}
