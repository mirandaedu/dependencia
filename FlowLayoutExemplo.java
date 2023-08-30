import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class FLExemplo extends JFrame implements ItemListener {
	private JRadioButton rb1, rb2, rb3;
	private FlowLayout layout;
	
	public FLExemplo() {
	
	setTitle("Janela da Miranda");
	setSize(400, 150);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	Container cont = getContentPane();
	layout = new FlowLayout (FlowLayout.CENTER, 10, 5);
	cont.setLayout(layout);
	
	 rb1 = new JRadioButton("LEFT");
	 rb2 = new JRadioButton("CENTER");
	 rb2.setSelected(true);
	 rb3 = new JRadioButton("RIGHT");
	 
	 rb1.addItemListener(this);
	 rb2.addItemListener(this);
	 rb3.addItemListener(this);
	 
	 cont.add(rb1);
	 cont.add(rb2);
	 cont.add(rb3);
	 
	 ButtonGroup grupo = new ButtonGroup();
	 grupo.add(rb1);
	 grupo.add(rb2);
	 grupo.add(rb3);
	 
	}
	
	public static void main(String args[]) {
		FLExemplo exemplo = new FLExemplo();
		exemplo.setVisible(true);
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(rb1.isSelected()) {
			layout.setAlignment(FlowLayout.LEFT);
			layout.layoutContainer(getContentPane());
		}else if(rb2.isSelected()) {
			layout.setAlignment(FlowLayout.CENTER);
			layout.layoutContainer(getContentPane());
		}else if(rb3.isSelected()) {
			layout.setAlignment(FlowLayout.RIGHT);
			layout.layoutContainer(getContentPane());
		}
		
		e.getSource();
		
	}
}
