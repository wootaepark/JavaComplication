import java.util.*;
public class HashMapDicEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> dic = new HashMap<>();
		
		dic.put("apple", "사과");
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		
		
		Set<String> keys = dic.keySet();
		
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			String value = dic.get(key);
			System.out.println("(" + key + ", " + value + ")");
			
			
		}
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("찾고 싶은 단어는? >> ");
			String eng = scanner.next();
			
			if(eng.equals("exit")) {
				System.out.println("종료합니다...");
				break;
			}
			scanner.nextLine();
			
			String kor = dic.get(eng);
			if(kor == null) {
				System.out.println(eng + "는 없는 단어입니다.");
			}
			else {
				System.out.println(kor);
			}
		}
		
		
		scanner.close();
		
		
		

	}

}
