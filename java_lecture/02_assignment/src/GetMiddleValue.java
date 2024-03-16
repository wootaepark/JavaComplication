import java.util.*;
public class GetMiddleValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2장 4번 문제
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 3개 입력 >> ");
		int i1 = scanner.nextInt();
		int i2 = scanner.nextInt();
		int i3 = scanner.nextInt();
		
		int mid = i1;
		if((i1 < i2 && i2 < i3)||(i3 < i2 && i2 < i1)) {
			mid = i2;
		}
		if((i1 < i3 && i3 < i2)||(i2 < i3 && i3 < i1)) {
			mid = i3;
		}
		if((i2 < i1 && i1 < i3)||(i3 < i1 && i1 < i2)) {
			mid = i1;
		}
	
		System.out.println(mid);
		scanner.close();
		
	}

}
