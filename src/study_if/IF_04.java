package study_if;

import java.util.Scanner;

public class IF_04 {
	public static void main(String[] args) {
		int score ;
		String grade = " ";

		System.out.print("점수를 입력하세요 >>");
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
			System.out.println("당신의 점수는 " + score +"입니다.");
		}
		System.out.println("당신의 학점은 " + grade+ "입니다.");
	}

}

