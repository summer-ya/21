package study_if;

import java.util.Scanner;

public class IF_04 {
	public static void main(String[] args) {
		int score ;
		String grade = " ";

		System.out.print("������ �Է��ϼ��� >>");
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		if(score>=90) {
			grade = "A";
			if(score>=95) {
				grade += "+";
			} else {
				grade += "-";
			}
		}else if(score>=80) {
			grade = "B";
			if(score >=85) {
				grade += "+";
			} else {
				grade += "-";
			}
			System.out.println("����� ������ " + score +"�Դϴ�.");
		}
		System.out.println("����� ������ " + grade+ "�Դϴ�.");
	}

}

