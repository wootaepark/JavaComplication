import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class FlyingTextEx extends JFrame {
	private final int FLYING_UNIT = 10; // 10픽셀 단위 이동
	private JLabel la = new JLabel("HELLO"); // 레이블 컴포넌트

	public FlyingTextEx() {
		setTitle("상,하,좌,우 키를 이용하여 텍스트 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null); // 컨텐트팬의 배치관리자 삭제
		// 컨텐트팬에 Key 리스너 달기
		c.addKeyListener(new MyKeyListener());
		la.setLocation(50,50); // la의 초기 위치는 (50,50)
		la.setSize(100,20);
		c.add(la);
		setSize(300,300);
		setVisible(true);

		c.setFocusable(true); //컨텐트팬이 키 입력을 받을 수 있도록 포커스 강제 지정
		c.requestFocus();  // 컨텐트팬에 포커스를 잃은 경우 마우스를 						// 클릭하면 다시 포커스를 얻게 함
		c.addMouseListener( new MouseAdapter( ) { 
			public void mouseClicked(MouseEvent e) {
				// 마우스가 클릭된 컴포넌트
				Component c = (Component)e.getSource(); 									c.setFocusable(true);
				c.requestFocus(); // 컴포넌트에게 포커스 설정
			}	
		} );
	}
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			
			switch(keyCode) {
			case KeyEvent.VK_UP:
				la.setLocation(la.getX(), la.getY() - FLYING_UNIT);
				break;
			case KeyEvent.VK_DOWN:
				la.setLocation(la.getX(), la.getY() + FLYING_UNIT);
				break;
			case KeyEvent.VK_LEFT:
				la.setLocation(la.getX()- FLYING_UNIT, la.getY());
				break;
			case KeyEvent.VK_RIGHT:
				la.setLocation(la.getX()+FLYING_UNIT, la.getY());
				break;
			}
		}
		
		
	}
	
	public static void main(String[] args) {
			new FlyingTextEx();
		}
	
	
	
	
	
	
}
