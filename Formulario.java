import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;


public class Formulario  extends JFrame{
	public Formulario() {
		setTitle("Formulário de Cadastro do Usuário");
		setSize(600, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			Container container = getContentPane();
			//container.setLayout(new FlowLayout());
			container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
			
			//nome
			JLabel nome = new JLabel("Nome");
			JTextField textField = new JTextField("Fulano de Tal", 15);
			
			
			//idade
			JLabel idade = new JLabel("Idade:");
			 String[] lista = new String [] {"18", "19", "20", "21", "22", "23", "24", "25", "26"};
			 JComboBox cblista = new JComboBox(lista);
			 cblista.setMaximumRowCount(0);
			
			 //sexo
			 JLabel sx = new JLabel("Sexo:");
			 JRadioButton btnF = new JRadioButton("Feminino");
			 JRadioButton btnM = new JRadioButton("Masculino");
			
			 //endereço
			 JLabel end = new JLabel("Endereço:");
			 JTextField textField2 = new JTextField("Rua Quintino Bocaiuva 122", 15);
			
			 //interesse
			 JLabel not = new JLabel("Noticias de Interesse:");
			 JCheckBox chEconomia = new JCheckBox("Economia");
				JCheckBox chEducacao = new JCheckBox("Educação");
				JCheckBox chEsporte = new JCheckBox("Esporte");
				JCheckBox chTecnologia = new JCheckBox("Tecnologia");
				
				//nivel de conhecimento
				JLabel nivel = new JLabel("Nível de Conhecimento em Informatica:");
				JSlider slider1 = new JSlider(SwingConstants.HORIZONTAL, 0, 100, 50);
				slider1.setMajorTickSpacing(10);
				slider1.setPaintTicks(true);
				slider1.setPaintLabels(true);
				slider1.setPaintTrack(false);
				slider1.setSnapToTicks(true);
				
				//informações adicionais
				JLabel inf = new JLabel("Informações adicionais:");
				JTextArea texto = new JTextArea("", 3, 30);
				
				//senha
				JLabel senhaa = new JLabel("Senha:");
				JPasswordField passwordField = new JPasswordField(20);
				
				JToggleButton botao1 = new JToggleButton("Cadastrar");
				JToggleButton botao2 = new JToggleButton("Cancelar");
				JPanel painel = new JPanel();
				painel.setLayout(new FlowLayout());
		
		 container.add(nome);
		 container.add(textField);
			
			container.add(idade);
			container.add(cblista);
			
			container.add(sx);
			container.add(btnM);
			container.add(btnF);
			
			container.add(end);
			container.add(textField2);
			
			container.add(not);
			container.add(chEconomia);
			container.add(chEducacao);
			container.add(chEsporte);
			container.add(chTecnologia);
			
			container.add(nivel);
			container.add(slider1);
			
			container.add(inf);
			container.add(texto);
			
			container.add(senhaa);
			container.add(passwordField);
			
			container.add(botao1);
			container.add(botao2);
			
			pack();
	 setLocationRelativeTo(null);
	}
//método main
public static void main(String[] args) {
		Formulario formulario = new Formulario();
		formulario.setVisible(true);
	}


}
