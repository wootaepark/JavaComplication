
public class UsingOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape start , last, obj;
		
		start = new Line();
		last = start;
		
		obj = new Rect();
		last.next = obj;
		last = obj;
		
		/*obj = new Line();
		last.next = obj;
		last = obj;*/
		
		obj = new Circle();
		last.next = obj;
		last = obj;
		
		Shape p = start;
		while (p!=null) {
			p.draw();
			p = p.next;
		}

	}

}
