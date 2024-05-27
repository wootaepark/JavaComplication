import java.util.*;
public class PointManage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> data = new HashMap<>();
		
		System.out.println("** 포인트 관리 프로그램 입니다.");
		
		
		while(true) {
			System.out.print("\n이름과 포인트 입력 >>");
			String name = scanner.next();
			if(name.equals("그만"))break;
			int point = scanner.nextInt();
			
			if(data.containsKey(name)){
				int totalPoint = data.get(name);
				totalPoint += point;
				data.put(name, totalPoint);
				
			}
			else data.put(name, point);
			
			Set<String> keys = data.keySet();
			Iterator<String> it = keys.iterator();

			while(it.hasNext()) {
				String key = it.next();
				int value = data.get(key);
				System.out.print("(" + key + ", " + value + ") ");
			}
			
			
			
		}
		
		scanner.close();

	}

}
