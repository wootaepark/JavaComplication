
public class WrapperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Character.toLowerCase('A'));
		char c1 = '4', c2 = 'F';
		if(Character.isDigit(c1))
			System.out.println(c1 + "is a number.");
		if(Character.isAlphabetic(c2))
			System.out.println(c2 + "is an alpahabet");
		
		System.out.println(Integer.parseInt("-123"));
		System.out.println(Integer.toHexString(28));
		System.out.println(Integer.toBinaryString(28));
		System.out.println(Integer.bitCount(28));
		
		Double d = Double.valueOf(3.14);
		System.out.println(d.toString());
		System.out.println(Double.parseDouble("3.14"));
		
		boolean b= (4>3);
		System.out.println(Boolean.toString(b));
		System.out.println(Boolean.parseBoolean("false"));  
		// 위 "false"의 경우 해당 문자열이 아닌 다른 문자열로도 변경해도 ("true" 제외) false 가 나온다.
				

	}

}
