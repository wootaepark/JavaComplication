import java.util.*;
public class ArrayListEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character> ls = new ArrayList<>(6);
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)");
		for(int i=0;i<6;i++) {
			char input = scanner.next().charAt(0);
			ls.add(input);
			
		}
		Iterator<Character> it = ls.iterator();
		double sum = 0;
		while(it.hasNext()) {
			
			char grade = it.next();
			switch(grade) {
			
			case 'A': sum += 4.0;break;
			case 'B': sum += 3.0;break;
			case 'C': sum += 2.0;break;
			case 'D': sum += 1.0;break;
			case 'F': sum += 0.0;break;
			default : continue;
						
			}
		}
		
		System.out.println(sum/6);
	
		scanner.close();
		

	}

}
