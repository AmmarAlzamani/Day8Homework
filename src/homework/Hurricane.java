package homework;

public class Hurricane {
	public static void main(String[] args) {
		
		for (int i = 20; i <= 200; i++) {
			
			if(i >= 74 && i <= 95) {
				System.out.println(i + " category 1");
				
			}else if(i >= 105 && i <= 110){
				System.out.println(i +" category 2");
			}else if(i >= 120 && i <= 130) {
				System.out.println(i + " category 3");
			}else if(i >= 140 && i <= 155) {
				System.out.println(i + " category 4");
			}else if(i >= 165 && i <= 194) {
				System.out.println(i + " category 5");
			}
			
			

			
		}
	}

}
