package 게임;

import java.util.Scanner;

public class Game_baseball {
	// 자바야구게임
	// 컴퓨터와 사람이 각각 1 ~9 사이에 중복되지 않는
	// 임의의 숫자 3개를 선택

	// strike : 컴터와 사람의 숫자와 위치가 일치하는경우
	// ball : 컴터와 사람의 숫자만 일치하는경우
	// out : 숫자가 하나도 일치하지 않는 경우
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] user = new int[3];
		int[] com = new int[3];
		String str = "";
		System.out.println("========== JAVA Baseball Game ==========");

		for (int i = 0; i < user.length; i++) {
			System.out.print("임의의 숫자 3개를 선택하세요(1~9) : ");
			user[i] = sc.nextInt();
		}
		sc.close();
		System.out.print("유저가 선택한 숫자는 : ");
		for (int i = 0; i < com.length; i++) {
			System.out.print(user[i] + " ");
		}

		System.out.print("\n컴퓨터가 선택한 숫자는 : ");
		for (int i = 0; i < com.length; i++) {
			com[i] = (int) ((Math.random() * 9) + 1);
			if (i > 0) {
				for (int j = 0; j < i; j++) {
					if (com[i] == com[j]) {
						i--;
						break;
					}
				}

			}

			System.out.print(com[i] + " ");

		}
		System.out.println("");

		for (int i = 0; i < com.length; i++) {
			for (int j = 0; j < com.length; j++) {
				if (user[i] == com[j]) {
					if (user[i] - com[j] == 0) {
						str = "Strike";
					}
					str = "ball";
					break;
				}
				str = "out";
			}
			System.out.print(str + " ");
		}

	}
}
