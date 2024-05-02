import java.util.*;
public class MyStack extends Vector{
	public Object push(Object item) {
		addElement(item);
		return item;
	}
	public Object pop() {
		
		Object obj = peek();
		removeElementAt(size()-1); // peek 과 동일한 원리 (삭제도 한다.)
		return obj;
	}
	
	public Object peek() {
		int len = size();
		
		if(len == 0){
			throw new EmptyStackException();
		}
		return elementAt(len-1); // 제일 마지막에 들어온 element 반환 (index 가 0부터 시작이므로 1 뻬줌) 
	}
	
	public boolean empty() {
		return size() == 0;
	}
	
	public int search(Object o) {
		int i = lastIndexOf(o);
		
		if(i>=0) {
			return size()-i;
		}
		return -1;
	}
}
