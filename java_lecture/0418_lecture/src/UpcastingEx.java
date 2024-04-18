class Person{
	String name;
	String id;
	
	public Person(String name) {
		this.name = name;
	}
}
class Student extends Person{
	String grade;
	String department;
	public Student(String name) {
		super(name);
	}
}
public class UpcastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Student("박태우");
		
		Student s = (Student)p;// 다운 캐스팅
		
		
		
		//Student s = new Student("Lee HI");
		//p = s; // 업캐스팅
		
		System.out.println(s.id); // null 
		System.out.println(s.name);
		
		
		
		
		// 아래 영역 접근 불가
		//p.grade = "A"; // 컴파일 오류
		//p.department = "Com"; //컴파일 오류

	}

}
