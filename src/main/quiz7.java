package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class quiz7 {

	public static void main(String[] args) {

		FileInputStream fis = null;

		try {

			fis = new FileInputStream("src/main/a.txt");
			System.out.println("a.txt 파일을 엽니다");

//		중간에 숫자를 나누는 코드를 삽입
			int i = 5 / 0;

			try {
				fis.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
			System.out.println("사용한 리소스를 닫았습니다");

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

	}

}
