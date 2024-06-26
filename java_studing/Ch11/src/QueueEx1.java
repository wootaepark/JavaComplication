import java.util.*;
public class QueueEx1 {
	
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5; // 최대 5개 까지만 저장되도록
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		
		while(true) {
			System.out.print(">>");
			try {
			
			Scanner s = new Scanner(System.in);
			String input = s.nextLine().trim();
			
			if("".equals(input)) continue;// 아무것도 입력 되지 않은 경우 처음부터 다시 시작
			
			if(input.equalsIgnoreCase("q")) { // 대소문자 미구분
				System.exit(0); // q 가 입력된 경우 종료
			}
			else if(input.equalsIgnoreCase("help")) {
				System.out.println(" help - 도움말을 보여줍니다.");
				System.out.println(" q 또는 Q - 프로그램을 종료합니다.");
				System.out.println(" history - 최근에 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");
			}
			
			else if(input.equalsIgnoreCase("history")) {
				int i=0;
				save(input);
				
				LinkedList tmp = (LinkedList)q;
				ListIterator it = tmp.listIterator();
				
				while(it.hasNext()) {
					System.out.println(++i+"."+it.next());
				}
				
				
			}
			else {
				save(input);
				System.out.println(input);
			}
			}
			catch(Exception e) {
				System.out.println("입력 오류 입니다.");
			}
		}

	}
	public static void save(String input) {
		if(!"".equals(input)) {
			q.offer(input);
		}
		if(q.size() > MAX_SIZE) { //size() 메서드는 Collection 인터페이스에 정의
			q.remove(); 
		}
	}

}
