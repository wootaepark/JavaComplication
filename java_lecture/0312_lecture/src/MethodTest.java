
public class MethodTest {
	
	public int getPlus(int x) {
		int y;
		y = 3 * x + 2;
		return y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int test;
		MethodTest ob = new MethodTest();
	
		test = ob.getPlus(3);
		
		
		int staticTest = StaticTest.getPlus(3);
		
		System.out.println("Method Test : " + test);
		System.out.println("Static Test : " + staticTest);

	}

}
