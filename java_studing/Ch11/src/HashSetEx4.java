import java.util.*;
public class HashSetEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new LinkedHashSet();
		
		set.add("abc");
		set.add("abc");
		set.add(new Persons2("David", 10));
		set.add(new Persons2("David", 10));
		
		System.out.println(set);

	}


}
class Persons2{
	String name;
	int age;
	
	Persons2(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Persons2) {
			Persons2 tmp = (Persons2)obj;
			return name.equals(tmp.name) && age == tmp.age;
		}
		
		return false;
	}
	public int hashCode() {
		return (name+age).hashCode();
	}
	public String toString() {
		return name + ":" + age;
	}
}


