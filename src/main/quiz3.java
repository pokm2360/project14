package main;

public class quiz3 {

//	프로그램이 정상적으로 종료되도록 예외 처리
	public static void main(String[] args) {
		
		
		try {
			
			Object obj = new Integer(0);
			String str = (String) obj; // 형변환을 잘못해서 에러
			
		} catch (ClassCastException e) {
			System.out.println(e);
		}
		
		System.out.println("프로그램이 종료됩니디ㅏ.");

}
}