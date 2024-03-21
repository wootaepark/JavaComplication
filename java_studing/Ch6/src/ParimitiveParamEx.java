class Data {int x;}
public class ParimitiveParamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = "+d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
		// d.x 값이 변하지 않는 예시이다.

	}
	static void change(int x) {
		x = 1000;
		System.out.println("change() : x = " + x);
	}

}
