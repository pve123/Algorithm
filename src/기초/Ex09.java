package 기초;

//문제 : 각자리수의 합
import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		System.out.println("========= 자리수의 합 =========");

		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 써주세요 : ");
		int num = scan.nextInt();
		scan.close();
		int result = 0;
		while (num > 0) {
			result += num % 10;
			num /= 10;
		}
		System.out.println("각 자리수 의 합 : " + result);
	}

}
