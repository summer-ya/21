package study_if;

public class WrapperTest {
	public static void main(String[] args) {


		int num = 5;
		// int -> Integer
		Integer i = Integer.valueOf(num);
		System.out.println(i);

		// Integer -> int
		int value = i.intValue();
		System.out.println(value);
	}

}


