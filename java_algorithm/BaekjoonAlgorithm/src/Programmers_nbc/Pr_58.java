package Programmers_nbc;


public class Pr_58 {
	class Solution {
		public static int solution(int[] nums) {
			int answer = 0;

			int size = (nums.length) * (nums.length - 1) * (nums.length - 2) / 6;
			int[] arr = new int[size];

			int index = 0;
			for (int i = 0; i < nums.length - 2; i++) {
				for (int j = i + 1; j < nums.length - 1; j++) {
					for (int k = j + 1; k < nums.length; k++) {
						arr[index++] = nums[i] + nums[j] + nums[k];
					}
				}
			}

			for (int i = 0; i < arr.length; i++) {
				boolean flag = true;
				for (int j = 2; j < arr[i]; j++) {
					if (arr[i] % j == 0) {
						flag = false;
						break;
					}
				}
				if(flag) {
					answer ++;
				}
			}
			//System.out.println(Arrays.toString(arr));

			return answer;
		}
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3,4 };

		System.out.println(Solution.solution(nums));

	}

}
