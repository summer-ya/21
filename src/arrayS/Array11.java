package arrayS;

import java.util.Random;
import java.util.Scanner;

//�迭�� ĭ�� �����ϰ� �迭�� �������� ������ ������.

public class Array11 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int num;

		System.out.print("������ ũ�⸦ �Է��ϼ��� >>");
		num = sc.nextInt();
		int[] Arr = new int[num];

		for(int i=0; i<Arr.length; i++) {
			Arr[i] = rand.nextInt(100)+1;
			System.out.println("[" + i + "]" + " = " +Arr[i]);
		}
		
		for(int j=0; j<Arr.length/2; j++) {
			int change = Arr[j];
			Arr[j] = Arr[Arr.length-j-1];
			
			Arr[Arr.length-j-1] = change;
		}
		System.out.println("������ �������� ��ü�߾��ϴ�");
		
		for(int i=0; i<Arr.length; i++) {
			System.out.println("Arr["+ i + "] = " + Arr[i]);
		}
	}
}