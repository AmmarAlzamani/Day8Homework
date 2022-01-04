package homework;

public class HomeworkQ4 {
	public static void main(String[] args) {
		
		int evenTotal = 0;
		
		int oddTotal = 0;
		
		for(int i = 1; i <=20; i++) {
			
			if(i % 2 == 0) {
				evenTotal = evenTotal +i;
			}else {
				oddTotal = oddTotal +i;
			}
		}
		System.out.println(evenTotal);
		System.out.println(oddTotal);
		
	}

}
