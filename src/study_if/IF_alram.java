package study_if;

import java.util.Scanner;

public class IF_alram {
	public static void main(String[] args) {

		int h=0;
		int m=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("�ð��� �Է��ϼ���");
		h=sc.nextInt();
		System.out.println("���� �Է��ϼ���");
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


//00�� 40���� ��� -45���� �ϸ� 23�� 55���� ���;���
//00�� ���� 


	}

}
}

