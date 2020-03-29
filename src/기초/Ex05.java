package 기초;


import java.util.Scanner;

//문제  : 10진수를 2진수로 변경
public class Ex05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("10진수를 입력해주세요 : ");
		int num = scan.nextInt();
		int n = num;
		scan.close();
		int[] arr = new int[100];
		int i = 0;
		while (n > 0) {
			arr[i] = n % 2;
			n /= 2;
			i++;
		}
		String str = "";
		i = i - 1;
		for (; i >= 0; i--) {
			str += arr[i];
		}
		System.out.println(num + "의 2진수 값은 : " + str);
	}
}
