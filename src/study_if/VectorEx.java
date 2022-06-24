package study_if;

import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		Vector<Language> list = new Vector<Language>();
		
		list.add(new Language("java",100));
		list.add(new Language("pyhyon",90));
		list.add(new Language("dart", 80));
		list.add(new Language("kotln", 70));
		list.add(new Language("C++", 60));
		
		list.set(4,  new Language("c#", 60));
		list.remove(2);
		
		for(Language a : list) {
			System.out.println(a.name + "\t" + a.score);
		}
		
		
	}



}
