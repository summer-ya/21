package study_if;

import java.util.Scanner;

public class FlowEx1 {
	public static void main(String[] args) {
		int input;
		
		System.out.print("���ڸ� �ϳ� �Է��ϼ���. >> ");
		
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();           //ȭ���� ���� �Է¹��� ������ tmp����
		input = Integer.parseInt(tmp);        // �Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ
		
		if(input==0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");
		}
		
		if(input != 0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�.");
			System.out.printf("�Է��Ͻ� ���ڴ� %d�Դϴ�.", input);
		}
	}
	}