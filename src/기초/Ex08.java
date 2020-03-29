package 기초;

import java.util.Scanner;

//문제  : 팩토리얼
public class Ex08 {

	
	public static void main(String[] args) {
		
		System.out.println("========== 팩토리얼 =========");
		Scanner scan = new Scanner(System.in);
		System.out.print("팩토리얼 숫자를 써주세요 : ");
		int num = scan.nextInt();
		System.out.print(num + "의 팩토리얼은 :");
		scan.close();
		int result = 1;
		while(num > 0) {
			result *=num;
			num--;
		}
		System.out.println( result);
		
	}
}
