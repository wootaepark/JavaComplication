
public class CastingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;
		car.drive();
		fe2 = (FireEngine)car;
		fe2.stop();
		fe2.water();
		

	}

}
class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrr~");
		
	}
	void stop() {
		System.out.println("stop!!");
	}
	
}
class FireEngine extends Car{
	void water() {
		System.out.println("water!!");
	}
}