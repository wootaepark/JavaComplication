
public class OperatorEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1_000_000;
		int b = 2_000_000;
		
		long c = a * b; // int 형 계산이므로 오버플로우 발생, 피연산자 중 하나가 long 이어야함
		System.out.println(c);

	}

}
