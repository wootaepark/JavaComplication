
public class Grade {
	
    static int makeAbs(int data) {
		if(data < 0) {
			data = data * -1;
			
		}
		return data;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result;
		result = makeAbs(-4);
		System.out.println("makeAbs: " + result);
		
		Student Park = new Student(); // 참조의 느낌
		Student Lee = new Student("이하나", 100, 81);
		
		Lee.getSum();
		Lee.getAve();
		
		/*System.out.println(Lee.name + ", " + Lee.kor + ", " + Lee.eng);
		System.out.println(Lee.sum + ", " + Lee.ave);
		System.out.println("-----------------------------------------");*/
		
		Lee.printStd();
		
		/*System.out.println(Park.name + ", " + Park.kor + ", " + Park.eng);
		System.out.println(Park.sum + ", " + Park.ave);*/
		Park.printStd();
		
		
		Park.name = "박태우";
		Park.kor = 93;
		Park.eng = 86;
		Park.sum = Park.kor + Park.eng;
		Park.ave = Park.sum / 2.0;
		
		/*System.out.print(Park.name + ", ");
		System.out.print(Park.kor + ", ");
		System.out.println(Park.eng + ", ");
		System.out.print(Park.sum + ", ");
		System.out.println(Park.ave);*/
		// + 는 연결 연산자 (덧셈이 아니다.)
		Park.printStd();
		
	}
	

}
