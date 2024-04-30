interface PhoneInterface{
	final int TIMEOUT = 10000;
	void sendCall();
	void receiveCall();
	public default void printLogo() {
		System.out.println("**Phone**");
	}
}
class SamsungPhone implements PhoneInterface{
	
	@Override
	public void sendCall() {
		System.out.println("Rrrrrr~~");
	}
	@Override
	public void receiveCall() {
		System.out.println("You get a phone call.");
	}
	public void flash() {
		System.out.println("The phone lights up.");
	}
	
}
public class InterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();

	}

}
