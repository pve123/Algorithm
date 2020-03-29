package 기초;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//문제 : 소수, 소수의 개수 구하기
public class Ex03 {

	public static void main(String[] args) {

		System.out.print("몇번째 까지 소수들을 보고 싶으세요 ? ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		scan.close();
		for (int i = 2; i <= num; i++) {

			for (int j = 0; j < list.size(); j++) {

				if (i % list.get(j) == 0) {
					break;
				}
				if ((j + 1) == list.size()) {
					list.add(i);
				}
			}

		}
		int n = 1;
		for (Integer result : list) {
			System.out.println(n + "번째 소수 : " + result);
			n++;
		}
		System.out.println("=============================\n 소수의 개수는 : " + (n - 1));
	}
}
