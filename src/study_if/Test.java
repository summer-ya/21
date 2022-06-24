package study_if;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		String[] array = {"그랜저", "제네시스", "캐스퍼", "모닝"};
		
		List<String> list = Arrays.asList(array);
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		// list.add("소나타"); 배열을 List로 변경하면 add()는 사용불가
		list.set(0, "소나타");
		System.out.println(list.contains("그랜져"));
		//list.remove("모닝"); 배열을 List로 변경하면 remove()는 사용 불가
		
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.print(s + " ");
		}
	}

}
