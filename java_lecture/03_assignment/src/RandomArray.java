
public class RandomArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		int sum = 0;
		System.out.print("랜덤한 정수들 : ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*10 + 1 );
			System.out.print(arr[i] + " ");
			sum += arr[i];
			
		}

		System.out.println("\n"+(double)sum/arr.length);

	}

}
