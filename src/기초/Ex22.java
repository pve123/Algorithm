package 기초;

//JadenCase 문자열 만들기
//문제 설명
//JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다.
public class Ex22 {

	public static void main(String[] args) {

		String str = "for the last week";
		StringBuffer sb = new StringBuffer();
		System.out.println("변환 전 : " + str);
		System.out.println("=========================");
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (i == 0) {
				sb.append(Character.toUpperCase(c));
			} else if (c == ' ') {
				sb.append(" ");
				sb.append(Character.toUpperCase(str.charAt(i + 1)));
				i++;
			} else {
				sb.append(c);
			}

		}
		System.out.println("변환 후 : " + sb);
	}
}
