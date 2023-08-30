import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayout extends JFrame{
	
	private JButton bnA, btnB, btnC, btnD, btnE;
	
	public GridLayout() {
		setTitle("Janela da Miranda");
		setSize(400, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cont = getContentPane();
		GridLayout layout = new GridLayout(3, 3, 5, 5);
		cont.setLayout(layout);
		btnA = new JButton("A");
		btnB = new JButton("B");
		btnC = new JButton("C");
		btnD = new JButton("D");
		btnE = new JButton("E");
		cont.add(btnA);
		cont.add(btnB);
		cont.add(btnC);
		cont.add(btnD);
		cont.add(btnE);
		
	}

	public static void main(String[] args) {
		GridLayout layout = new GridLayout();
		layout.setVisible(true);

	}
}
