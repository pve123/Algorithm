package 기초;
//문제 : 	2345
//		6789   ㅡ> 구구단출력	
public class Ex18 {

	public static void main(String[] args) {

		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\t",i,j,i*j);
				System.out.printf("%d * %d = %d\t",i+1,j,(i+1)*j);
				System.out.printf("%d * %d = %d\t",i+2,j,(i+2)*j);
				System.out.printf("%d * %d = %d\t",i+3,j,(i+3)*j);
				System.out.print("\n");
			}
			System.out.println();
			i+=3;
		}
		
	}
}
