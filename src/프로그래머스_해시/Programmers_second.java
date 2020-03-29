package 프로그래머스_해시;

public class Programmers_second {

	public boolean solution(String[] phone_book) {
		boolean answer = true;

		for (int i = 0; i < phone_book.length - 1; i++) {

			for (int j = i + 1; j < phone_book.length; j++) {

				if (phone_book[i].startsWith(phone_book[j])) {
					return false;
				}
				if (phone_book[j].startsWith(phone_book[i])) {
					return false;
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		Programmers_second p = new Programmers_second();
		String[] phone_book = { "119", "97674223", "1195524421" };
		boolean result = p.solution(phone_book);
		System.out.println(result);
		long end = System.currentTimeMillis();
		System.out.println("수행시간  : " + (double) (end - start) / 1000 + "(초)");
	}
}
