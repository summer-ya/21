package arrayS;

import java.util.Random;
import java.util.Scanner;

public class Araaa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int num;
		System.out.print("����� ���� �迭�� ũ��� ? ");
		num = sc.nextInt();
		int[] Arr = new int[num];
		
		for(int i=0; i<Arr.length; i++) {
			Arr[i] = rand.nextInt(100)+1;
			
			
			boolean isExist = false;
			
			for(int j=0; j<i; j++) {
				if(Arr[j]==num) {
					isExist = true;
					break;
				}
			}
			
			if(isExist) {
				
				i--;
				continue;
				
			}
			
			
			System.out.println(i + " = " + Arr[i]);
		}
	}

}
