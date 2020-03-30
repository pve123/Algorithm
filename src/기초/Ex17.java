package 기초;

import java.util.Scanner;

//문제 : 직사각형 달팽이
// 1  2  3  4  5
// 16 17 18 19 6
// 15 24 25 20 7
// 14 23 22 21 8
// 13 12 11 10 9

public class Ex17 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("몇행 몇열의 달팽이 직사각형을 그리고싶으세요  : ");
		int num = scan.nextInt();
		scan.close();
		int[][] arr = new int[num][num];
		int n = 1;
		int x = 0;
		int y = 0;
		int f = num;

		for (int i = 0; i < 2 * num - 1; i++) {

			switch (i % 4) {
			case 0:// right away
				for (int k = 0; k < f; k++) {
					arr[x][y] = n;
					n++;
					y++;
				}
				x++;
				y--;
				f--;
				break;

			case 1: // under away
				for (int k = 0; k < f; k++) {
					arr[x][y] = n;
					x++;
					n++;
				}
				y--;
				x--;
				break;

			case 2: // left away

				for (int k = 0; k < f; k++) {
					arr[x][y] = n;
					y--;
					n++;
				}
				y++;
				x--;
				f--;
				break;
			case 3: // upper away

				for (int k = 0; k < f; k++) {
					arr[x][y] = n;
					x--;
					n++;
				}
				x++;
				y++;
				break;
			}
		}

		for (int m = 0; m < num; m++) {

			for (int j = 0; j < num; j++) {
				System.out.printf("%3d", arr[m][j]);
			}
			System.out.println(" ");
		}
	}
}
