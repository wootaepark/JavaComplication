import java.util.*;

class Student{
	int id;
	String tel;
	public Student(int id, String tel) {
		this.id = id;
		this.tel = tel;
	}
	
	public int getId() {
		return id;
	}
	public String getTel() {
		return tel;
	}
	
}



public class HashMapStudentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Student>map = new HashMap<>();
		
		map.put("황기태", new Student(1, "010-1111-1111"));
		map.put("이재문", new Student(2, "010-2222-2222"));
		map.put("김남윤", new Student(3, "010-3333-3333"));
		
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("검색할 이름?");
			String name = scanner.nextLine();
			if(name.equals("exit")) break;
			
			Student student = map.get(name);
			if(student == null) {
				System.out.println(name + "은 없는 사람입니다.");
				
			}
			else {
				System.out.println("id:" + student.getId() + ", 전화:" + student.getTel());
			}
			
		}
		System.out.println("프로그램 종료");
		scanner.close();

	}

}
