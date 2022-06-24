package study_if;

import java.util.Scanner;

public class IF_alram {
	public static void main(String[] args) {

		int h=0;
		int m=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("시간을 입력하세요");
		h=sc.nextInt();
		System.out.println("분을 입력하세요");
		m=sc.nextInt();

		if(m<45) {
			h--;
			m = (m-45)+60;

			if(h<0) {
				h=23;
			}
			System.out.println(h+ " " +m);
		} else {
		System.out.println(h + " " +(m-45));


//00시 40분인 경우 -45분을 하면 23시 55분이 나와야함
//00시 보다 


	}

}
}

