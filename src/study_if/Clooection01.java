package study_if;

import java.util.*;

public class Clooection01 {
	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<String>();  //<>안에 데이터 타입 넣어주는게좋음
		
		arrList.add("넷");
		arrList.add("둘");
		arrList.add("셋");
		arrList.add("하나");
		
		for(int i=0; i<arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
	}

}
