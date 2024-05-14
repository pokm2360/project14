package main;

public class quiz4 {


	public static void main(String[] args) {
		
		
		try {
			
		String str = "1.23";
		int num = Integer.parseInt(str); // 실수를 정수로 변환하려고해서 에러
			
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		
		System.out.println("프로그램이 종료됩니디ㅏ.");

}
}