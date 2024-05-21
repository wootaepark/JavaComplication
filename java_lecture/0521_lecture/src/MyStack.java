class GStack<T>{
	int tos;
	Object[] stck;
	public GStack() {
		tos = 0;
		stck = new Object[10];
	}
	public void push(T item) {
		if(tos == 10) {
			System.out.println("Stack is full! Unable to save [" + item + "]");
			return;
		}
		stck[tos++] = item;
			
	}
	public T pop() {
		if(tos == 0) {
			System.out.println("Stack is empty");
			return null;
		}
		
		return (T)stck[--tos]; // <T>형태가 아닌 해시코드가 반환되며 그 이후 <T> 형태로 변환된다.
	}
}
public class MyStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		
		GStack<String> stringStack = new GStack<String>();
		stringStack.push("seoul");
		stringStack.push("busan");
		stringStack.push("LA");
		
		
		System.out.println("--- 1. Content stored in the stack ---");
		for(int i=0; i<2; i++)
			System.out.println(stringStack.pop());
		
		System.out.println();
		
		
		GStack<Integer> intStack = new GStack<Integer>();
		intStack.push(1);
		intStack.push(3);
		intStack.push(5);
		
		
		System.out.println("--- 2. Content stored in the stack ---");
		for(int i=0;i<2;i++) {
			System.out.println(intStack.pop());
		}

	}

}
