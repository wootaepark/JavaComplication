
public class GenericMethodExample {
	public static<T> GStack<T> reverse(GStack<T> a){
		GStack<T> s = new GStack<T>();
		while(true) {
			T tmp; 
			tmp = a.pop();
			if(tmp == null) { // 스택이 비어있음
				break;
			}
			else {
				s.push(tmp); // 새 스택에 요소 삽입
			}
		}
		
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GStack<Double> gs = new GStack<>();
		
		for(int i=0 ;i<5 ;i++) {
			gs.push(new Double(i));
			
		}
		gs = reverse(gs);
		for(int i=0;i<5 ;i++) {
			System.out.println(gs.pop());
		}

	}

}
