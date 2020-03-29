package 기초;


import java.util.Scanner;

//문제 : 각 숫자들의 개수
public class Ex13 {

	public static void main(String[] args) {

		System.out.println("========= 각 숫자들의 개수 =========");
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 써주세요 : ");
		int num = scan.nextInt();
		scan.close();
		int[] arr = new int[10];

		while (num > 0) {
			arr[num % 10]++;
			num /= 10;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + "의 개수는 : " + arr[i]);
		}

	}
}
