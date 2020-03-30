package 게임;

import java.util.Scanner;

public class GaBaBo {

	public int setting(String str) {
		int num = str.equals("가위") ? 0 : str.equals("바위") ? 1 : str.equals("보자기") ? 2 : 3;
		return num;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		GaBaBo babo = new GaBaBo();
		System.out.println("========== 가위바위보 게임 ==========");
		System.out.print("가위, 바위 ,보자기  중에서 하나를 내주세요 : ");
		String user = scan.nextLine();
		int result = babo.setting(user);
		while (result == 3) {
			System.out.print("가위, 바위 ,보자기  중에서 하나를 내주세요 : ");
			user = scan.nextLine();
			result = babo.setting(user);
		}
		scan.close();
		int com = (int) (Math.random() * 3);
		String c_result = (com == 0) ? "가위" : (com == 1) ? "바위" : "보자기";
		System.out.println("유저 : " + user);
		System.out.println("컴퓨터 : " + c_result);
		System.out.println("============== 결    과 ==============");
		String f_result = "";
		switch (result - com) {
		case -1:
			f_result = "당신이 졌습니다.";
			break;
		case 2:
			f_result = "당신이 졌습니다.";
			break;
		case -2:
			f_result = "당신이 이겼습니다.";
			break;
		case 1:
			f_result = "당신이 이겼습니다.";
			break;
		case 0:
			f_result = "당신은 비겼습니다.";
			break;
		}
		System.out.println(">>>>>> " + f_result + " <<<<<<");
	}
}
