package study_if;

import java.util.Scanner;

public class B2753 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요. >>");
		int year;
		year=sc.nextInt();
		
		
		if(0==year%4 && 0==year%400) {
			System.out.println(1);
		}else if(0==year%4 && 0 != year%100) {
			System.out.println(1);
		}
		else
		System.out.println(0);
	}

}
