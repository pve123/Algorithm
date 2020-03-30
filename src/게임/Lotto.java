package 게임;
import java.util.Scanner;
public class Lotto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] lotto = new int[7];
		
		int matchCnt = 0;
		String result = "";
		int bonus;
		
		
		int[] mynum = new int[6];
		System.out.print("로또번호를 입력해주세요(1~45) : ");
		for (int i = 0; i < mynum.length; i++) {
			mynum[i]=sc.nextInt();
			if (mynum[i]>45) {

				System.out.print("로또번호를 입력해주세요(1~45) : ");
				i--;
				
			}
		}
		sc.close();
		
		System.out.print("랜덤 로또 번호 : ");
		for (int i = 0; i < lotto.length; i++) {
			lotto[i]=(int)((Math.random()*45)+1);
			if (i>0) {
				for (int j = 0; j < i; j++) {
						if (lotto[i]==lotto[j]){
						i--;
						break;
											   }	
											}
					 }
				System.out.printf(" %3d ",lotto[i]);
		}
				System.out.println();
				System.out.print("나의 로또 번호 : ");
		for (int i = 0; i < mynum.length; i++) {
				System.out.printf(" %3d ",mynum[i]);
		}
				System.out.println("\nㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				
		for (int i = 0; i < mynum.length; i++) {
			for (int j = 0; j < mynum.length; j++) {
				if (mynum[i]==lotto[j]) {
					matchCnt++;
					break;
				}
			}
		}
		System.out.println("당첨된 개수는 ?\t" + matchCnt + "개 입니다.");
		bonus = lotto[6];
		switch (matchCnt) {
		case 3: result="5등입니다."; break;
		case 4: result="4등입니다."; break;
		
		case 5: for (int i = 0; i < mynum.length; i++) {
					result="3등입니다.";
					if (mynum[i]==bonus) {
						result="2등입니다.";
						break;
										 }
			} break;
		case 6: result="1등입니다."; break;
		default : result="다음기회에....."; break;
		
		}
		System.out.println("등수는  : " + result);
		
	}	
}

