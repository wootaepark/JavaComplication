class Person{
	private int weight;
	int age;
	protected int height;
	public String name;
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}
}
class Student extends Person{
	public void set() {
		age = 30;
		name = "박태우";
		height = 175;
		//weight = 99;
		setWeight(99);
	}
}
public class InheritanceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student();
		s.set();
		System.out.println(s.getWeight());
		
		//System.out.println(s.toString());
		

	}

}
