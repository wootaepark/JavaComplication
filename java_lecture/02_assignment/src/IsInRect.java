import java.util.*;
public class IsInRect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2장 7번 실습 문제
		Scanner scanner = new Scanner(System.in);
		System.out.print("점 (x,y)의 좌표를 입력하시오>>");
		
		int width = scanner.nextInt();
		int height = scanner.nextInt();
		
		if(width <= 200 && width >= 100 && height <= 200 && height >=100) {
			
			System.out.println("("+width+","+height+")"+"는 사각형 안에 있습니다.");
			
		}
		else {
			System.out.println("("+width+","+height+")"+"는 사각형 안에 없습니다.");
		}
				
				
		
		scanner.close();
	}

}
