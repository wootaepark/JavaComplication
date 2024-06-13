import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class GraphicsDrawLineMouseEx extends JFrame {
	private MyPanel panel = new MyPanel();
	public GraphicsDrawLineMouseEx() {
		setTitle("drawing Line by Mouse 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(300, 300);
		setVisible(true);
	}
	
	
	class MyPanel extends JPanel{
		private Vector<Point>vStart = new Vector<Point>();
		private Vector<Point>vEnd = new Vector<Point>();
		public MyPanel() {
			addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					Point startP = e.getPoint();
					vStart.add(startP);
				}
				public void mouseReleased(MouseEvent e) {
					Point endP = e.getPoint();
					vEnd.add(endP);
					repaint(); // 주석 해보기, 새로고침 안되어서 수정 결과가 보이지 않는다.
				}
			});
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			for(int i=0; i<vStart.size(); i++) {
				Point s = vStart.elementAt(i);
				Point e = vEnd.elementAt(i);
				g.drawLine((int)s.getX(), (int)s.getY(), (int)e.getX(), (int)e.getY());
				
			}
		}
	}

	public static void main(String [] args) {
		new GraphicsDrawLineMouseEx();
	}
}