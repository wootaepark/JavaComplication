import java.util.Scanner;
public class CoffeePrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("What kind of coffe d you wnat to order? ");
		String order = scanner.next();
		int price = 0;
		switch(order) {
		case "Espresso":
		case "Cappuccino":
		case "Cafe-latte":
			price = 5300;
			break;
		case "Americano" : 
			price = 3800;
			break;
		default:
			System.out.println("It's not on the menu!");
		}
		if(price !=0) {
			System.out.print("A/An " + order + " costs " + price + "Won");
		}
		scanner.close();

	}

}
