
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;

public class MinhaJanela extends JFrame{

	public MinhaJanela() {
		setTitle("Minha Janela");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			Container container = getContentPane();
			container.setLayout(new FlowLayout());
			
			JToggleButton botao1 = new JToggleButton("play");
			JToggleButton botao2 = new JToggleButton("stop");
			ButtonGroup grupo = new ButtonGroup();
		
			JCheckBox chEconomia = new JCheckBox("Economia");
			JCheckBox chEducacao = new JCheckBox("Educação");
			JCheckBox chEsporte = new JCheckBox("Esporte");
			JCheckBox chTecnologia = new JCheckBox("Tecnologia");
			
			JRadioButton rbMas = new JRadioButton("Gay");
		    JRadioButton rbFem = new JRadioButton("Normal");
		    ButtonGroup grupo2 = new ButtonGroup();
		    
		    String[] lista = new String [] {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};
		    JComboBox cblista = new JComboBox(lista);
		    cblista.setMaximumRowCount(3);
		    
		    
		    JList list = new JList(lista);
		    list.setVisibleRowCount(3);
		    
		    JScrollPane scroll = new JScrollPane(list);
		    
		   JLabel label = new JLabel("Insira seu nome");
		   JTextField textField = new JTextField(15);
		   JTextArea textArea = new JTextArea("Texto de Teste", 10, 30);
		   JScrollPane scroll2 = new JScrollPane(textArea);
		   
		   JSpinner spinner = new JSpinner(new SpinnerNumberModel(0, 0, 50, 1));
		   
		   JSlider slider1 = new JSlider(SwingConstants.VERTICAL, 0, 100, 50);
		   slider1.setMajorTickSpacing(10);
		   slider1.setPaintTicks(true);
		   slider1.setPaintLabels(true);
		   slider1.setPaintTrack(false);
		   slider1.setSnapToTicks(true);
		   
		   JProgressBar barra = new JProgressBar(SwingConstants.HORIZONTAL, 0, 100);
		   barra.setValue(30);

		   JPanel painel = new JPanel();
		   painel.setLayout(new FlowLayout());
		   painel.add(botao1);
		   painel.add(botao2);
		   painel.setBackground(Color.BLUE);
		   container.add(painel);
			
			container.add(chEconomia);
			container.add(chEducacao);
			container.add(chEsporte); 
			container.add(chTecnologia);
			
			container.add(rbMas);
			container.add(rbFem);
			
			container.add(cblista);
			
			container.add(scroll);

			container.add(label);
			container.add(textField);
			container.add(scroll2);
			
			container.add(spinner);
			
			container.add(slider1);
			
			container.add(barra);
	}
}
