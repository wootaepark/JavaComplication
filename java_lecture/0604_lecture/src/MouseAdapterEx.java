import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseAdapterEx extends JFrame {
	private JLabel la = new JLabel("Hello"); 

	public MouseAdapterEx() {
		setTitle("Mouse Adapter 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();

		// 컨텐트 팬에 마우스 리스너 객체 등록
		c.addMouseListener(new MyMouseAdapter()); 

		c.setLayout(null); // 컨텐트 팬의 배치관리자 삭제
		la.setSize(50, 20); // label la 크기 설정
		la.setLocation(30, 30); // label la 출력 위치 설정
		c.add(la); // 컨텐트 팬 관리하는 참조 변수 c를 활용하여, 화면(컨텐트 팬)에 추가함!

		setSize(250, 250);
		setVisible(true);
	}
	
	
	class MyMouseAdapter extends MouseAdapter{
		public void mousePressed(MouseEvent e) { // 앞선 리스너와 달리 어댑터는 필요한 메서드만 오버라이딩 하면 됨
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x,y);
		}
	}
	
	public static void main(String[] args) {
		new MouseAdapterEx();
	}
	
	
}