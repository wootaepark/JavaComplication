
public class ForeachEx {
	enum Week{Mon, Tue, Wed, Thu, Fri, Sat, Sun};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = {1,2,3,4,5};
		String[] names = {"apple", "pear", "banana", "mangosteen", "strawberry", "grape"};
		
		int sum = 0;
		
		for(int k : n) {
			System.out.print(k + " ");
			sum += k;
		}
		System.out.println(", The sum is " + sum);

		for(String s : names) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		for(Week day : Week.values()) { // 좀 특이한 케이스이
			System.out.print(day+ " ");
			
		}
		System.out.println();
	}

}
