
public class EqualsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point a = new Point(2,3);
		Point b = new Point(2,3);
		Point c = new Point(3,4);
		
		if(a==b) {
			System.out.println("a==b"); // a 와 b 가 관리하는 객체가 다르다. (참조값이 다르다.)
		}
		if(a.equals(b)) { // equals 메서드를 오버라이딩 해주지 않으면 출력 x ,아래도 마찬가지 
			System.out.println("a is equal to b");
		}
		if(a.equals(c)) {
			System.out.println("a is equal to c");
		}
	}

}
