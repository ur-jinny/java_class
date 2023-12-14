package ch03_scanner;

//java.util 패키지에 소속된 Scanner 클래스를 가져옴.
import java.util.Scanner;

public class Ex01_scanner {

	public static void main(String[] args) {
		// // scanner 라는 이름의 Scanner 클래스 객체 선언
		Scanner scanner = new Scanner(System.in); // 입력을 받기 위해서 사용하는 클래스/ 이걸을 사용위해 객체 선언
		System.out.print("숫자를 입력하세요: "); //  "숫자를 입력하세요" 를 먼저 출력을 하고
		int num1 = scanner.nextInt();	// 그리고 정수를 입력 받을려면 nextInt();
		System.out.println(num1); // 내가 쓴 정수값이  출력 될것이다.
		
		System.out.print("이름을 입력하세요: "); // print 에는 ln이 빠져 띄어쓰기 되어서 가로 안에 글이 출력
		String name = scanner.next(); // 그리고 문자형을 입력 받을려면 next();
		System.out.println(name);
		
		scanner.nextLine(); // or nextline(); 로 작성
		
		System.out.print("주소를 입력하세요: "); // 띄어쓰고 그대로 추출되면은
		String address = scanner.nextLine(); // 입력하기 위한 문자형 주소 압력하기 위한  객체를 선언하다.
		System.out.println(address);

	}

	}


