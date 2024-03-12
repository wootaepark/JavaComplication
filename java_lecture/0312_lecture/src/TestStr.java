
public class TestStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String toolName = "JDK"; // 자동으로 new Sting 이 들어가는 것이다.
		//String toolName2 = new String("JDK");
		System.out.println(toolName);
		
		System.out.println(toolName + 2.1);
		System.out.println(toolName);
		
		System.out.println(toolName + "2.1");
		System.out.println(toolName);
		
		// toolName + "1.8"; // 이와 같이 일반적인 식에서는 사용이 불가능하다. (print, println에서만 사용 가능, 또는 앞에 변수 선언한 경우 가능)
		
		

	}

}
