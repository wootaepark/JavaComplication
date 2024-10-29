package Programmers_nbc;
import java.util.*;
//https://school.programmers.co.kr/learn/courses/30/lessons/92334

public class Pr_74 {
	


	class Solution {
	    public int[] solution(String[] idList, String[] report, int k){

	        int[] answer = new int[idList.length];
	        HashMap<String, HashSet<String>> reporterInfoMap = new HashMap<>();
	        HashMap<String, Integer> reportedCountInfoMap = new HashMap<>();
	        HashSet<String> reportSet = new HashSet<>(Arrays.asList(report));
	        
	        for(String reportInfo : reportSet){
	            String reporter = reportInfo.split(" ")[0];  
	            String reported = reportInfo.split(" ")[1];  
	            reporterInfoMap.putIfAbsent(reporter, new HashSet<String>(){{
	                add(reported);
	            }});
	            reporterInfoMap.get(reporter).add(reported);
	            reportedCountInfoMap.put(reported, reportedCountInfoMap.getOrDefault(reported, 0)+1);
	        }

	        for (String reported : reportedCountInfoMap.keySet()){
	            int reportedCount = reportedCountInfoMap.get(reported);
	            if(reportedCount >= k){
	                
	                for(int i=0; i<idList.length; i++){
	                    if(reporterInfoMap.containsKey(idList[i]) && reporterInfoMap.get(idList[i]).contains(reported)) {
	                        answer[i]++;
	                    }
	                }
	            }
	        }
	        return answer;
	   }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
