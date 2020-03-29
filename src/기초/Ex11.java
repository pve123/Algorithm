package 기초;

import java.util.Scanner;

//문제 입력한 숫자만큼 행,열 
//ex) 4이면
//1 2 3 4
//8 7 6 5
//9 10 11 12
//16 15 14 13
public class Ex11 {

	public static void main(String[] args) {

		System.out.println("========= 직사각형 =========");
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 적어주세요 : ");
		int num = scan.nextInt();
		scan.close();
		int[][] result = new int[num][num];

		for (int i = 0; i < result.length; i++) {

			for (int j = 0; j < result.length; j++) {
				if (i % 2 == 0) {
					System.out.printf("%3d", (num * i) + j + 1);
				} else {
					System.out.printf("%3d", (num * i) + num - j);
				}
			}
			System.out.println("");
		}
	}
}
