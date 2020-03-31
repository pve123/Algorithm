package 기초;

import java.util.Scanner;

//x의 제곱이라면 x+1의 제곱을 리턴하고,
//n이 정수
//x의 제곱이 아니라면-1을 리턴
// ex) 121 144
// ex) 8    -1
public class Ex19 {

	public static void main(String[] args) {
		System.out.print("X의 값을 입력해주세요 : ");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		scan.close();
	
		switch (x) {
		case 1:
			System.out.println(x + "의 다음 제곱은 4입니다.");
			break;
		default:	
			for (int i = 2; i < x; i++) {
				if (x / i == i) {
					System.out.println(x + "의 다음 제곱은 " + (i + 1) * (i + 1) + "입니다.");
					break;
				}
			}
			break;
		}

	}
}
