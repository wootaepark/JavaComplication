import java.util.Scanner;
class CurrencyConverter{
	private static double rate;
	public static double toDollar(double won) {
		return won/rate;
	}
	public static double toWon(double dollar) {
		return dollar*rate;
	}
	public static void setRate(double r) {
		rate = r; // 환율 설정 
	}
	
}
public class StaticMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Excahnge rate(1 dollar) >>");
		double rate = scanner.nextDouble();
		CurrencyConverter.setRate(rate);
		System.out.println("One million WON is $" + CurrencyConverter.toDollar(1000000));
		System.out.println("$100 is " + CurrencyConverter.toWon(100) + " WON");
		scanner.close();

	}

}
