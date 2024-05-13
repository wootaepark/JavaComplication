import java.util.Scanner;
public class RockSisorPaperGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		
		int player = -1;
		
		while(player != 4) {
			System.out.print("철수[가위(1), 바위(2), 보(3), 끝내기(4)]>>");
			player = scanner.nextInt();
			if(player > 4 || player < 0	) {System.out.println("올바른 숫자 입력 해주세요"); continue;}
			

			
			int computer = (int)(Math.random()*3+1);
			
			if(computer == 1) {
				if(player == 1) {
					System.out.println("철수 (가위) : 컴퓨터 (가위)");
					System.out.println("비겼습니다.");
				}
				else if(player == 2) {
					System.out.println("철수 (바위) : 컴퓨터 (가위)");
					System.out.println("철수가 이겼습니다.");
				}
				else if(player == 3) {
					System.out.println("철수 (보) : 컴퓨터 (가위)");
					System.out.println("컴퓨터가 이겼습니다.");
				}
			}
		
			else if(computer == 2) {
				if(player == 1) {
					System.out.println("철수 (가위) : 컴퓨터 (바위)");
					System.out.println("컴퓨터가 이겼습니다.");
				}
				else if(player == 2) {
					System.out.println("철수 (바위) : 컴퓨터 (바위)");
					System.out.println("비겼습니다.");
				}
				else if(player == 3) {
					System.out.println("철수 (보) : 컴퓨터 (바위)");
					System.out.println("철수가 이겼습니다.");
				}
			}
			else if(computer == 3) {
				if(player == 1) {
					System.out.println("철수 (가위) : 컴퓨터 (보)");
					System.out.println("철수가 이겼습니다.");
				}
				else if(player == 2) {
					System.out.println("철수 (바위) : 컴퓨터 (보)");
					System.out.println("컵퓨터가 이겼습니다.");
				}
				else if(player == 3) {
					System.out.println("철수 (보) : 컴퓨터 (보)");
					System.out.println("비겼습니다.");
				}
			}
			
			
			
		}
		
		
		scanner.close();

	}

}
