package 기초;

import java.util.Scanner;
//문제 입력한 숫자만큼 행,열 
//ex) 4이면
//1 5 9 13
//2 6 10 14 
//3 7 11 15 
//4 8 12 16
public class Ex12 {

	public static void main(String[] args) {
		System.out.println("========= 직사각형 =========");
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 적어주세요 : ");
		int num = scan.nextInt();
		scan.close();
		int[][] result = new int[num][num];
		int n = 1;

		for (int i = 0; i < result.length; i++) {

			for (int j = 0; j < result.length; j++) {
				result[j][i] = n;
				n++;
			}
		}
		
		for (int i = 0; i < result.length; i++) {
			
			for (int j = 0; j < result.length; j++) {
				System.out.printf("%3d",result[i][j]);
			}
			System.out.println("");
		}
	}
}
