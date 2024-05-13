import java.util.Scanner;

public class SubStringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("문자열을 입력하세요. 빈칸이나 있어도 되고 영어 한글 모두 됩니다.");
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		String str1 = str;
		
		
		while(true) {
			
			
			String tmp1 = str.substring(1);
			char tmp2 = str.charAt(0);
			
			str = tmp1 + tmp2;
			System.out.println(str);
			
			if(str.equals(str1)) break;
			
		}
		
		
		
		
		scanner.close();

	}

}
