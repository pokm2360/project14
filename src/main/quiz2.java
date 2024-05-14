package main;

public class quiz2 {

//	프로그램이 정상적으로 종료되도록 예외 처리
	public static void main(String[] args) {
		
		try {
			
			String s = null;
			System.out.println(s.length());
			
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		
		
		System.out.println("프로그램이 정상 종료됩니다.");
	}
	

}
