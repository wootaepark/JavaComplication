
public class OperatorEx23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abc";
		String str2 = new String("abc");
		
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");
		System.out.printf(" str1==\"abc\" ? %b%n", str1=="abc");
		System.out.printf(" str2==\"abc\" ? %b%n", str2=="abc");
		// 이 경우에는 false 이다. 선언 방식에 따라 차이가 있는 듯
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str1.equals("ABC"));
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n",
				str2.equalsIgnoreCase("ABC"));
		// 대소문자 무시
		

	}

}
