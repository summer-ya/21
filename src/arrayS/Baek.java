package arrayS;

import java.util.Random;
import java.util.Scanner;

public class Baek {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int num;

		System.out.print("�迭�� ũ�⸦ �Է��ϼ��� >> ");
		num = sc.nextInt();
		int[] Arr = new int[num];

		for(int i=0; i<Arr.length; i++) {
			Arr[i] = rand.nextInt(100)+1;
			System.out.println("[" + i + "]" + Arr[i]);
		}
	}
}