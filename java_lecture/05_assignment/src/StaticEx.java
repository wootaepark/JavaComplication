class ArrayUtil{
	public static int[] concat(int[] a, int[] b) {
		int[] tmp = new int[a.length+b.length];
		for(int i=0;i<tmp.length; i++) {
			if(i<a.length) {
				tmp[i] = a[i]; continue;
			}
			tmp[i]=b[i-a.length];
			
			
		}
		return tmp;
	}
	public static void print(int[] a) {
		System.out.print("[");
		for(int i=0;i<a.length;i++) {
			System.out.print(" " + a[i]);
		}
		System.out.println(" ]");
	}
}
public class StaticEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {1, 5, 7, 9};
		int[] array2 = {3, 6, -1, 100, 77};
		int[] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);

	}

}
