package Programmers_nbc;


public class Pr_43 {
	
	//링크 : https://school.programmers.co.kr/learn/courses/30/lessons/147355
	
	static class Solution{
		public  static int solution(String t, String p) {
	        int answer = 0;
	        int size = t.length() - p.length() + 1;
	        
	        String[] str = new String[size];
	        for(int i=0 ;i<size;i++) {
	        	str[i] = t.substring(i,i+p.length());
	        	long n = Long.parseLong(str[i]);
	        	
	        	if(n <= Long.parseLong(p)) {
	        		answer ++;
	        	}
	        }
	        
	        
	        
	        
	        
	        return answer;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t = "500220839878";
		String p = "7";
		System.out.println(Solution.solution(t,p));

	}

}
