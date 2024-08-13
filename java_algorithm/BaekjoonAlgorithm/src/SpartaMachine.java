import java.util.*;
public class SpartaMachine {
	
	
	static HashMap<String, Integer>beverage = new HashMap<>();
	public static void initial() {
		
		beverage.put("사이다", 1700);
		beverage.put("콜라", 1900);
		beverage.put("식혜", 2500);
		beverage.put("솔의눈", 3000);
	}
	
	public static void printMenu() {
		System.out.println("사이다 1,700원");
		System.out.println("콜라 1,900원");
		System.out.println("식혜 2,500원");
		System.out.println("솔의눈 3,000원");
		
	}

	public static void main(String[] args) {
		
		printMenu();
		initial();
		System.out.print("어느 음료 마시겠습니까? >>");
		
		Scanner scanner = new Scanner(System.in);
		String choice = scanner.next();
		
		try {
			
			while(true) {
				int price = beverage.get(choice); // 원가
				
				System.out.print("얼마를 넣으시겠습니까? >>");
				int inputMoney = scanner.nextInt(); // 사용자 지불 금액
				
				if(price > inputMoney) System.out.println("돈이 부족합니다.");
				else {
					int change = inputMoney - price;
					System.out.println("잔액 " + change + "원");
					break;
				}
				
				
			}
	
		}
		catch(NullPointerException e) {
			System.out.println(choice + "는 목록에 없습니다.");
		}
		
		
		
		
		
		
		scanner.close();
		
	}

}
