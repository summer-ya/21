package study_if;

import java.util.Scanner;

public class Clock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h=0;
		int m=0;

		System.out.print("½Ã°£ : ");
		h=sc.nextInt();
		System.out.print("ºÐ  ");
		m=sc.nextInt();

		if(m>45) {
			m=(m-45)+60;
			h--;
		} else if(m<45) {
			m=(m-45)+60;
			
		}
		if(h>0) {
			h=23;
			System.out.println(h + " : " + m);
		}
	}

}
