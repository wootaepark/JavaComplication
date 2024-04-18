class Shape2{
	protected String name;
	public void paint() {
		draw();
	}
	public void draw() {
		System.out.println(name);
	}
}

public class MakeCircle extends Shape2{
	
	protected String name;
	
	@Override
	public void draw() {
		name = "Circle";
		super.name = "Shape";
		super.draw();
		System.out.println(name); // 이것도 실행 된다
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape2 b = new MakeCircle();
		b.paint();
	}

}
