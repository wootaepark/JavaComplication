
public class Student {
	
	String name;
	int kor, eng, sum;
	double ave;
	
	Student(){
		name = "noName";
		kor = eng = sum = 0;
		ave = 0.0;
	}
	Student(String n, int k, int e){
		name = n;
		kor =k;
		eng = e;
	}
	void getSum() {
		sum = kor + eng;
	}
	void getAve() {
		ave = sum / 2.0;
	}
	void printStd() {
		System.out.println(name + ", " + kor + ", " + eng);
		System.out.println(sum + ", " + ave);	
		System.out.println("-----------------------------");
	}
	
}
