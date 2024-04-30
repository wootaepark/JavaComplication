/*interface PhoneInterface { // 인터페이스 선언
	final int TIMEOUT = 10000; // 상수 필드 선언
	void sendCall(); // 추상 메소드
	void receiveCall(); // 추상 메소드
	default void printLogo( ) { // default 메소드
		System.out.println("** Phone **");
	}
}
// 이미 정의 되어 있음 (다른 코드)
*/
interface MobilePhoneInterface extends PhoneInterface { // 인터페이스 상속
		void sendSMS();
		void receiveSMS();
	}
interface MP3Interface { // 인터페이스 선언
		public void play();
		public void stop();
	}
class PDA { // 클래스 작성
		public int calculate(int x, int y) { 
			return x + y;
	}
}

class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface{
	
	@Override
	public void sendCall() {
		System.out.println("Rrrrrr~");
	}
	@Override
	public void receiveCall() {
		System.out.println("You get a Phone call");
	}
	@Override
	public void sendSMS() {
		System.out.println("Send a cell phone text");
	}
	@Override
	public void receiveSMS() {
		System.out.println("I got a cell phone text");
	}
	
	// mp3 추상 메서드 구현
	
	@Override
	public void play() {
		System.out.println("Play music");
	}
	
	@Override
	public void stop() {
		System.out.println("Stop the music");
	}
	
	// 추가 작성 메서드
	
	public void schedule() {
		System.out.println("Manage you calendar");
	}
}
	
	

public class InterfaceExSnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		phone.play();
		System.out.println("If you add 3 and 5 : " + phone.calculate(3, 5));
		phone.schedule();

	}

}
