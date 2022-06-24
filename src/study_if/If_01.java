package study_if;

import java.util.Scanner;

public class If_01 {
	public static void main(String[] args) {
		int num;
		
		System.out.print("숫자를 하나 입력하세요 .>> ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		if(num == 0) {
			System.out.println("입력하신 숫자는 0입니다");
		}
		
		if(num != 0) {
			System.out.println("입력하신 숫자는 0이 아닙니다");
		}
		System.out.print("입력하신 숫자는" + num + "입니다");
				
	}
}