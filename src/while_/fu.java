package while_;

import java.util.Scanner;

public class fu {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int A,B,C,D,sum;
	A = input.nextInt();
	B = input.nextInt();
	sum = 0;
	for (int i = 0; i < B ; i++) {
		C = input.nextInt();
		D = input.nextInt();
		sum += (C*D);
	}
	if (A==sum) {
		System.out.println("Yes");
	}
	else {
		System.out.println("No");
	}
	
	
	}
	
}