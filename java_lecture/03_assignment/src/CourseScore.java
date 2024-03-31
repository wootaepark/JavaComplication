import java.util.Scanner;
public class CourseScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String[] course = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int[] score = {95, 88, 76, 62, 55};
		boolean isExist = false;
		
		while(true) {
			isExist = false;
			System.out.print("과목이름 >> ");
			String answer = scanner.next();
			if(answer.equals("그만")) break;
			
			for(int i=0; i<course.length; i++) {
				if(answer.equals(course[i])) {
					System.out.println(course[i] + "의 점수는 " + score[i]);
					isExist = true;
					break;
				}
				
				
			}
			if(!isExist) System.out.println("없는 과목입니다.");
			
		}
		scanner.close();
	}

}
