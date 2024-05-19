import java.util.*;
public class HashMapEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("나라 이름과 인구를 입력하세요. (예 : Korea 5000)");
		
		
		HashMap<String, Integer>nations = new HashMap<>();
		while(true) {
			System.out.print("나라 이름, 인구 >> ");
			String nation = scanner.next();
			if(nation.equals("그만"))break;
			int population = scanner.nextInt();
			
			nations.put(nation, population);
		
		}
		
		while(true) {
			System.out.print("인구 검색 >>");
			String nation = scanner.next();
			
			if(nation.equals("그만"))break;
			if(nations.get(nation) == null) System.out.println(nation + "나라는 없습니다.");
			else System.out.println(nation + "의 인구는 " + nations.get(nation));
			
		}
		
		
		
		scanner.close();

	}

}
