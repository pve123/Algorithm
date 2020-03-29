package 기초;

import java.util.Scanner;

//문제 입력한 숫자만큼 행,열 
//ex) 3이면
//123
//456
//789
public class Ex10 {

	public static void main(String[] args) {

		System.out.println("========= 직사각형 =========");
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 적어주세요 : ");
		int num = scan.nextInt();
		scan.close();

		for (int i = 0; i < num; i++) {

			for (int j = 0; j < num; j++) {
				System.out.printf("%3d", (i * num) + j + 1);
			}
			System.out.println("");
		}

	}
}
