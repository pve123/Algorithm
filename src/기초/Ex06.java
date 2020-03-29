package 기초;


import java.util.Scanner;

//문제 : 알파벳 소문자는 대문자로 대문자는 소문자로 변경
public class Ex06 {

	public static void main(String[] args) {

		System.out.print("알파벳 문자열을 입력해주세요 : ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println("입력한 문자열은 : " + str);
		scan.close();
		char[] c = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				c[i] += (char) (str.charAt(i) + 32);
			} else {
				c[i] += (char) (str.charAt(i) - 32);
			}
		}
		str = "";
		for (char result : c) {
			str += result;
		}
		System.out.println("변경 후 : " + str);

	}
}
