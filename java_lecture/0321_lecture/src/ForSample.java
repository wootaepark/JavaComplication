
public class ForSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 1;i<=10;i++)
		{
			sum+=i;
			
			if(i<10)System.out.print(i+"+");
			else System.out.print(i);
		}
		
		System.out.print("="+sum);
	}

}
