import javax.swing.*;
import java.awt.*;

public class GraphicsDrawImageEx1 extends JFrame {
	private MyPanel panel = new MyPanel();

	public GraphicsDrawImageEx1() {
		setTitle("원본 크기로 원하는 위치에 이미지 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(280, 400);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("images/image0.jpg");
		private Image img = icon.getImage();
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			//g.drawImage(img, 20, 20, this);
			//g.drawImage(img, 0, 0,getWidth(),getHeight(), this); // EX2
			g.drawImage(img, 20,20,250,100,100,50,200,200,this);// EX3
		}
		
	}

	public static void main(String [] args) {
		new GraphicsDrawImageEx1();
	}
}
