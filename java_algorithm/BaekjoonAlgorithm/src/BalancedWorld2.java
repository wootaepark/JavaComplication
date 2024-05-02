import java.util.*;

public class BalancedWorld2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String content = scanner.nextLine();
            if(content.equals(".")) {
                break;
            }
            System.out.println(isBalanced(content) ? "yes" : "no");
        }

        scanner.close();
    }
    
    public static boolean isBalanced(String string) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            switch (ch) {
                case '(':
                case '[':
                    stack.push(ch);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
            }
        }
        
        return stack.isEmpty();
    }
}
