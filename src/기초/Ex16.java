package 기초;


import java.util.Scanner;

//문제 :  두 수를 입력받고 두수를 거꾸로 만들어서 비교후 큰수 출력
public class Ex16 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("A를 입력해주세요 : ");
		int A = scan.nextInt();
		System.out.print("B를 입력해주세요 : ");
		int B = scan.nextInt();
		scan.close();
		int[] Arr = new int[10];
		int[] Brr = new int[10];
		int i = 0;
		while (true) {
			Arr[i] = A % 10;
			Brr[i] = B % 10;
			A /= 10;
			B /= 10;
			i++;
			if (A < 1 && B < 1) {
				break;
			}
		}
		String Astr = "";
		String Bstr = "";
		for (int j = 0; j < i; j++) {
			Astr += Arr[j];
			Bstr += Brr[j];
		}
		Astr = Astr.replace("0", "");
		Bstr = Bstr.replace("0", "");
		System.out.println("A의 거꾸로된 숫자는 : " + Astr);
		System.out.println("B의 거꾸로된 숫자는 : " + Bstr);
		int max = Integer.parseInt(Astr) > Integer.parseInt(Bstr) ? Integer.parseInt(Astr) : Integer.parseInt(Bstr);

		System.out.println("큰 수는 : " + max + "입니다.");

	}
}
