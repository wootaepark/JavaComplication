import java.util.*;
public class CalendarEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar today = Calendar.getInstance();
		System.out.println("이 해의 년도 : " + today.get(Calendar.YEAR));
		System.out.println("이 해의 월 : " + today.get(Calendar.MONTH));
		// 월의 경우 +1 을 더한 값이 실제 월이다. 결과 3 -> 4월
		
		System.out.println("이 해의 몇 째 주 : " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이 달의 몇 째 주 : " + today.get(Calendar.WEEK_OF_MONTH));
		
		System.out.println("이 달의 몇 일 : " + today.get(Calendar.DATE));
		
	}

}
