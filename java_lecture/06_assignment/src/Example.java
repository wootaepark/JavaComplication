import java.util.StringTokenizer;
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer("a=3,b=5,c=6", "=,");
		int sum = 0;
		while(st.hasMoreElements()) {
			
			String data = st.nextToken();
			System.out.println(data);
			
			try {
				sum += Integer.parseInt(data);
			}
			catch(Exception e) {
				continue;
			}
			
			
			
		}
		System.out.println("합은 "+ sum);
	}

}
