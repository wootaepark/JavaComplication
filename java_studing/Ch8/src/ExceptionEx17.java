
public class ExceptionEx17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method1();
		}
		catch(Exception e) {
			System.out.println("main 메서드에서 예외가 처리됨");
		}

	}
	static void method1() throws Exception{
		try {
			throw new Exception(" >> 예외 발생");
		}
		catch(Exception e) {
			System.out.println("method1 메섣에서 예외가 처리됨" + e.getMessage());
			
			throw e;
		}
	}

}
