import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal2 extends JFrame implements ActionListener{
	
	private JButton button, button2;
	
	public Principal2() {
		setTitle("Minha Janela");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		button = new JButton("Clique aqui");
		button.addActionListener(this);
		container.add(button);
		
		button2 = new JButton("Clique aqui tambem");
		button2.addActionListener(this);
		container.add(button2);
		
		
		}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			JOptionPane.showMessageDialog(null, "ola");
		}
		if(e.getSource() == button2) {
			JOptionPane.showMessageDialog(null, "tchau");
		}
	}
		
	
	public static void main(String []args) {
		Principal2 janela = new Principal2();
		janela.setVisible(true);
	}

	

}
