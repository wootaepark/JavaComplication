
public class ReturnTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnTest r = new ReturnTest();
		
		int result = r.add(3,5);
		System.out.println(result);
		
		int[] result2 = {0};
		r.add(3, 5, result2);
		System.out.println(result2[0]);
		
	}
	int add(int a, int b) {
		return a+b;
	}
	void add(int a, int b, int[] result) {
		result[0] = a+b; // 여러개 리턴하고 싶을때 이렇게 사용하면 좋다.
	}

}
