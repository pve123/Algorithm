package 기초;



// 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다
// ex ) 18 true
// ex ) 11 true
// ex ) 13 false
public class Ex20 {

	public static void main(String[] args) {
		int num = 31;
		int[] arr = new int[String.valueOf(num).length()];
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = String.valueOf(num).charAt(i);
			result += (arr[i]-48);
		}
		
		if (num % result ==0) {
			System.out.println("======= 하샤드 수 =======");
		} else {
			System.out.println("======= 하샤드 수  X=======");
		}

	}
}
