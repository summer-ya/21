package study_if;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		String[] array = {"�׷���", "���׽ý�", "ĳ����", "���"};
		
		List<String> list = Arrays.asList(array);
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		// list.add("�ҳ�Ÿ"); �迭�� List�� �����ϸ� add()�� ���Ұ�
		list.set(0, "�ҳ�Ÿ");
		System.out.println(list.contains("�׷���"));
		//list.remove("���"); �迭�� List�� �����ϸ� remove()�� ��� �Ұ�
		
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.print(s + " ");
		}
	}

}
