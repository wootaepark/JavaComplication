import java.util.*;

class Person implements Comparable<Person> {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 나이를 기준으로 정렬
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }
}

public class ComparableEx {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", 30));
        people.add(new Person("Sara", 20));
        people.add(new Person("Jane", 40));

        Collections.sort(people); // Comparable에 의한 정렬

        for (Person p : people) {
            System.out.println(p.name + " " + p.age);
        }
    }
}
