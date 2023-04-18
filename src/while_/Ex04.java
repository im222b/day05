package while_;

import java.util.Scanner;

public class Ex04 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int num;
	while(true) {
		System.out.println("점수를 입력하시오");
		num = input.nextInt();
		if (num < 0 || num > 100) {
			System.out.println("점수를 다시 입력해주세요");
			continue;
		}
		else if( num >=80) {
			System.out.println("축하합니다. 합격입니다");
		}
		else {
			System.out.println("아쉽지만 불합격입니다");
		}
		break;
		
}
}
}
