package study_if;

import java.util.*;

public class Clooection01 {
	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<String>();  //<>�ȿ� ������ Ÿ�� �־��ִ°�����
		
		arrList.add("��");
		arrList.add("��");
		arrList.add("��");
		arrList.add("�ϳ�");
		
		for(int i=0; i<arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
	}

}
