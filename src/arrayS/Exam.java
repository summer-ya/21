package arrayS;

public class Exam {
	public static void main(String[] args) {
		String[] name = new String[3];
		int[] age = new int[3];
		int a = 0;

		name[0] = "lee";
		name[1] = "park";
		name[2] = "kim";

		age[0] = 17;
		age[1] = 35;
		age[2] = 13;

		for(int i=0; i<3; i++) {
			System.out.println(name[i] + "��" + age[i] + "�� �Դϴ�");
			if(age[i] <20 ) {
				a++;
			}
			
			






		}

	}
}