import java.util.*;
import java.io.*;

// 백준 4949번
public class BalancedWorld {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			try {
				String content = scanner.nextLine();
				if(content.equals(".")) {
					scanner.close();
					break;
					
				}
				System.out.println(input(content)?"yes":"no");

				
				
			}
			catch(Exception e) {
				System.out.println("오류 발생");
				System.exit(0);
			}
			
		}
		
		
		
		

	}
	
	
	public static boolean input(String string) {
		
		 Stack<Character> st = new Stack<>();
		
		for(int i=0;i<string.length();i++) {
			char ch = string.charAt(i);
			if(ch == '(' || ch=='[') {
				st.push(ch);
			}
			else if(ch == ')') {
				if(st.isEmpty() || st.pop() != '(') {
					return false;
				}
				
			}
			else if(ch == ']') {
				if(st.isEmpty() || st.pop() !='[') {
					return false;
				}
			}
			
		}
		
		return st.isEmpty();
	}
	

	 

}
