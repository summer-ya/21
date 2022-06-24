package arrayS;


public class RArray {
	public static void main(String[] args) {
		String[] name = {"kim", "lee" , "park" };
		int[] age = {17, 35,13};

		name[0] = "kim";
		name[1] = "lee";
		name[2] = "park";


		age[0] = 17;
		age[1]=35;
		age[2]=13;


		for(int i=0; i<3; i++) {
			System.out.println(name[i] +"는" + age[i]+"살 입니다.");
		}


	}
}
