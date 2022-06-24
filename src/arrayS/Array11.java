package arrayS;

import java.util.Random;
import java.util.Scanner;

//배열의 칸을 결정하고 배열을 역순으로 나열해 보세요.

public class Array11 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int num;

		System.out.print("베열의 크기를 입력하세요 >>");
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
		System.out.println("베열을 역순으로 교체했씁니다");
		
		for(int i=0; i<Arr.length; i++) {
			System.out.println("Arr["+ i + "] = " + Arr[i]);
		}
	}
}