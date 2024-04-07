import java.util.Scanner;
class Circle{
	private double x,y;
	private int radius;
	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public void show() {
		System.out.println("("+ x + ", " + y + ")" + radius);
	}
	
	static double max = 0;
	static int index = 0;
	
	
	public static void showBig(Circle c[]) {
		for(int i=0;i<c.length;i++) {
			if(c[i].radius * c[i].radius * 3.14 > max) {
				max = c[i].radius * c[i].radius * 3.14;
				index = i;
			}
		}
		System.out.println("가장 면적이 큰 원은 (" + c[index].x + ", " + c[index].y + ")" + c[index].radius);
	}
}
public class CircleManager {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Circle[] c = new Circle[3];
		for(int i=0; i< c.length; i++) {
			System.out.print("x, y, radius >> ");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			c[i] =new  Circle(x,y,radius);
		}
		//for(int i=0; i<c.length; i++) c[i].show();
		Circle.showBig(c);
		scanner.close();

	}

}
