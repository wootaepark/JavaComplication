import java.util.*;
public class HashSetEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new LinkedHashSet();
		
		set.add("abc");
		set.add("abc");
		set.add(new Persons("David", 10));
		set.add(new Persons("David", 10));
		
		System.out.println(set);

	}


}
class Persons{
	String name;
	int age;
	
	Persons(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + ":" + age;
	}
}
