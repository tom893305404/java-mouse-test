package lichmore.desktop;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.Date;
import static java.lang.System.out;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class Main extends JFrame implements MouseListener, MouseWheelListener{
	JLabel MouseLeft;
	JLabel MouseRight;
	JLabel MouseMiddle;
	JLabel MouseSideA;
	JLabel MouseSideB;
	JLabel MouseWheel;
	Main()
	{
		ImageIcon image = new ImageIcon(this.getClass().getResource("picture/mouse.png"));
		JLabel img = new JLabel(image);
		img.setBackground(Color.WHITE);
		img.setOpaque(true);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420, 460);
		this.setTitle("Keyboard Tracting");
		this.setLocationRelativeTo(null);
		this.setLayout(new FlowLayout());
		this.setResizable(false);
		
		
		JLayeredPane panel = new JLayeredPane();
		panel.setLayout(new FlowLayout());

		MouseLeft = new JLabel("Left");
		MouseRight = new JLabel("Right");
		MouseMiddle = new JLabel("Middle");
		MouseSideA = new JLabel("A");
		MouseSideB = new JLabel("B");
		MouseWheel = new JLabel("Wheel");
		
		MouseLeft.setBounds(130, 30, 40, 18);
		MouseLeft.setBackground(Color.GREEN);
		MouseLeft.setOpaque(true);
		
		MouseRight.setBounds(250, 30, 40, 18);
		MouseRight.setBackground(Color.GREEN);
		MouseRight.setOpaque(true);
		
		MouseMiddle.setBounds(200, 140, 40, 18);
		MouseMiddle.setBackground(Color.GREEN);
		MouseMiddle.setOpaque(true);
		
		MouseSideA.setBounds(70, 160, 40, 18);
		MouseSideA.setBackground(Color.GREEN);
		MouseSideA.setOpaque(true);
		
		MouseSideB.setBounds(70, 240, 40, 18);
		MouseSideB.setBackground(Color.GREEN);
		MouseSideB.setOpaque(true);
		
		MouseWheel.setBounds(200, 100, 40, 18);
		MouseWheel.setBackground(Color.GREEN);
		MouseWheel.setOpaque(true);
		
		img.add(MouseLeft);
		img.add(MouseRight);
		img.add(MouseMiddle);
		img.add(MouseSideA);
		img.add(MouseSideB);
		img.add(MouseWheel);
		panel.add(img);
		
		this.add(panel);
		this.addMouseListener(this);
		this.addMouseWheelListener(this);
		this.setVisible(true);

	}
	public static void main(String[] args) {
		new Main();
	}
	


	@Override
	public void mouseClicked(MouseEvent e) {
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		switch(e.getButton()) {
		case MouseEvent.BUTTON1: //Left
			MouseLeft.setBackground(Color.RED);
			//out.println("Left");
			break;
		case 2: //Middle
			MouseMiddle.setBackground(Color.RED);
			//out.println("Middle");
			break;
		case 3: //Right
			MouseRight.setBackground(Color.RED);
			//out.println("Right");
			break;
		case 5: //SideA
			MouseSideA.setBackground(Color.RED);
			//out.println("SideA");
			break;
		case 4: //SideB
			MouseSideB.setBackground(Color.RED);
			//out.println("SideB");
			break;
		}
		//out.println(e.getButton());
		//MouseLeft.setVisible(true);
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		switch(e.getButton()) {
		case MouseEvent.BUTTON1: //Left
			MouseLeft.setBackground(Color.GREEN);
			//out.println("Left");
			break;
		case 2: //Middle
			MouseMiddle.setBackground(Color.GREEN);
			//out.println("Middle");
			break;
		case 3: //Right
			MouseRight.setBackground(Color.GREEN);
			//out.println("Right");
			break;
		case 5: //SideA
			MouseSideA.setBackground(Color.GREEN);
			//out.println("SideA");
			break;
		case 4: //SideB
			MouseSideB.setBackground(Color.GREEN);
			//out.println("SideB");
			break;
		}
	}
	@Override
	public void mouseEntered(MouseEvent e) {
	}
	@Override
	public void mouseExited(MouseEvent e) {	
	}
	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		MouseWheel.setBackground(Color.RED);
		Thread thread = new Thread(()->{
		try {
			Thread.sleep(50);
			MouseWheel.setBackground(Color.GREEN);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		});
		thread.start();
		
	}


}