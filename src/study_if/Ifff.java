package study_if;

import java.util.Scanner;

public class Ifff {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h=0;
		int m=0;
		System.out.println("�ð��� �Է��ϼ���");
		h=sc.nextInt();
		System.out.println("���� �Է��ϼ���");
		m=sc.nextInt();

		if(m>45) {
			m = (m-45)+60;
		} else if (m <45) {
			m = 60+(m-45);
			h--;
		}
		if(h<0) {
			h=23;
		}
		System.out.println(h + " " +m);

	}
}
