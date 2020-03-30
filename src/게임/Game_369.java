package 게임;

//문제 : 369 게임 만들어보자
public class Game_369 {

	public static int getCount(int i) {

		int j = 0;
		while (i > 0) {
			if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
				j++;
			}
			i /= 10;
		}
		return j;

	}

	public static void main(String[] args) {

		System.out.print("======= 3 6 9 게임 ======= ");
		for (int i = 1; i <= 100; i++) {
			int cnt = getCount(i);
			if (i % 10 == 1) {
				System.out.println();
			}
			if (cnt == 0) {
				System.out.printf("%3d", i);
			} else {
				for (int j = 0; j < cnt; j++) {
					System.out.printf("%2s", "짝");
				}
				System.out.printf("%s", "|");
			}
		}

	}
}
