package study_if;

import java.util.Scanner;

public class If_02 {
	public static void main(String[] args) {
		int num;
		
		System.out.print("���ڸ� �ϳ� �Է��ϼ��� >> ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		if(num !=0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�");
		} 
		else {
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");
			
		}
		
	}

}
