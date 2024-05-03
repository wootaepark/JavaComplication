import java.util.*;
public class MyVector2 extends MyVector implements Iterator{

	// Iterator 인터페이스를 구현해보면서 동작 원리 알아보기
	int cursor = 0;
	int lastRet = -1;
	
	public MyVector2(int capacity) {
		super(capacity);
	}
	public MyVector2() {
		this(10);
	}
	public String toString() {
		String tmp = "";
		Iterator it = iterator();
		for(int i=0; it.hasNext();i++) {
			if(i!=0)tmp += ", ";
			tmp += it.next();
		}
		return "["+tmp+"]";
	}

	public Iterator iterator() {
		cursor = 0; // cursor 와 lastRet 초기화
		lastRet = -1;
		return this;
	}
	
	public boolean hasNext() {
		return cursor != size();
	}
	public Object next() {
		Object next = get(cursor); // MyVector 클래스에 존재함
		lastRet = cursor++;
		return next;
	}
	public void remove() {
		// 더이상 삭제 할 것이 없으면 IllegalStateException 발생
		if(lastRet == -1) {
			throw new IllegalStateException();
			
		}else {
			remove(lastRet);
			cursor--;
			lastRet = -1;
		}
	}
}
