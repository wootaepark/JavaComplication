import java.util.*;
public class CmdEx {

	
	// 백준 1032번 명령 프롬포트
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt(); 
		scanner.nextLine(); // 문자 제외 다른 형식을 받고 문자 받으려면 써야함 (항상 기억하기)
		
		
		ArrayList<String> sList = new ArrayList<>();
		String s1 = scanner.nextLine();
		sList.add(s1);
		

		
		for(int i=0; i<N-1; i++) {
			String sTmp=scanner.nextLine();
			sList.add(sTmp);
		}
		
		Iterator<String> it = sList.iterator();
		
		while(it.hasNext()) {
			String tmp = it.next();
			if(s1.equals(tmp))continue;
			else {
				for(int i=0;i<s1.length();i++) {
					if(s1.charAt(i) == tmp.charAt(i)) {
						continue;
						
					}
					else {
						StringBuilder sb = new StringBuilder(s1);
						sb.setCharAt(i, '?');
						s1 = sb.toString();
					}
				}
			}
		}
		
		System.out.println(s1);
		
		scanner.close();
	}

}
