package Exercicio3bim;

import java.awt.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Calculadora implements ActionListener{
	
    double n1 = 0, n2 = 0, result;
    int calculo;
	
    JFrame frame = new JFrame("Calculadora");
    JLabel label = new JLabel();
    Color MinhaCor = new Color(60,179,113);
    Color MinhaCor1 = new Color(220,20,60);
        
    JTextField textField = new JTextField();
    JRadioButton radioButton = new JRadioButton("on");
        
    JButton btnFechar = new JButton("Fechar");
    JButton btnCe = new JButton("CE");
    JButton btnC = new JButton("C");
    JButton btnDiv = new JButton("/");
    JButton btn7 = new JButton("7");
    JButton btn8 = new JButton("8");
    JButton btn9 = new JButton("9");
    JButton btnMult = new JButton("*");
    JButton btn4 = new JButton("4");
    JButton btn5 = new JButton("5");
    JButton btn6 = new JButton("6");
    JButton btnSub = new JButton("-");
    JButton btn1 = new JButton("1");
    JButton btn2 = new JButton("2");
    JButton btn3 = new JButton("3");
    JButton btnSoma = new JButton("+");
    JButton btnVirgula = new JButton(".");
    JButton btn0 = new JButton("0");
    JButton btnMaisMenos = new JButton("+/-");
    JButton btnIgual = new JButton("=");
    
    Calculadora(){
        Calc();
        addComponentes();
        addActionEvent();
    }
	
    public void Calc() {
        frame.setSize(290,400);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.black);
        frame.setLocationRelativeTo(null);
        frame.setUndecorated(true);
        frame.setVisible(true);
        frame.getContentPane().setBackground(MinhaCor);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
	
    public void addComponentes() {
	label.setBounds(250,0,50,50);
	label.setForeground(Color.white);
	frame.add(label);
		
	textField.setBounds(10,40,270,40);
	textField.setFont(new Font("Arial", Font.BOLD,20));
	textField.setEditable(false);
	textField.setHorizontalAlignment(SwingConstants.RIGHT);
	frame.add(textField);
		
        btnFechar.setBounds(10,110,60, 40);
	btnFechar.setFont(new Font("Arial", Font.BOLD,8));
	btnFechar.setBackground(MinhaCor1);
	frame.add(btnFechar);
                
        btnCe.setBounds(80,110,60, 40);
	btnCe.setFont(new Font("Arial", Font.BOLD,17));
	frame.add(btnCe);
		
	btnC.setBounds(150,110,60, 40);
	btnC.setFont(new Font("Arial", Font.BOLD,17));
	frame.add(btnC);
                
        btnDiv.setBounds(220,110,60, 40);
	btnDiv.setFont(new Font("Arial", Font.BOLD,20));
	frame.add(btnDiv);
        
	btn7.setBounds(10,170,60, 40);
	btn7.setFont(new Font("Arial", Font.BOLD,20));
	frame.add(btn7);
		
	btn8.setBounds(80,170,60, 40);
	btn8.setFont(new Font("Arial", Font.BOLD,20));
	frame.add(btn8);
		
	btn9.setBounds(150,170,60, 40);
	btn9.setFont(new Font("Arial", Font.BOLD,20));
	frame.add(btn9);
	
        btnMult.setBounds(220,170,60, 40);
	btnMult.setFont(new Font("Arial", Font.BOLD,20));
	frame.add(btnMult);
                
	btn4.setBounds(10,230,60, 40);
	btn4.setFont(new Font("Arial", Font.BOLD,20));
	frame.add(btn4);
		
	btn5.setBounds(80,230,60, 40);
	btn5.setFont(new Font("Arial", Font.BOLD,20));
	frame.add(btn5);
		
	btn6.setBounds(150,230,60, 40);
	btn6.setFont(new Font("Arial", Font.BOLD,20));
	frame.add(btn6);
		
        btnSub.setBounds(220,230,60, 40);
	btnSub.setFont(new Font("Arial", Font.BOLD,20));
	frame.add(btnSub);
		
	btn1.setBounds(10,290,60, 40);
	btn1.setFont(new Font("Arial", Font.BOLD,20));
	frame.add(btn1);
		
	btn2.setBounds(80,290,60, 40);
	btn2.setFont(new Font("Arial", Font.BOLD,20));
	frame.add(btn2);
		
	btn3.setBounds(150,290,60, 40);
	btn3.setFont(new Font("Arial", Font.BOLD,20));
	frame.add(btn3);
        
        btnSoma.setBounds(220,290,60, 40);
	btnSoma.setFont(new Font("Arial", Font.BOLD,20));
	frame.add(btnSoma);
        
        btnVirgula.setBounds(10,350,60, 40);
	btnVirgula.setFont(new Font("Arial", Font.BOLD,20));
	frame.add(btnVirgula);
		
        btn0.setBounds(80,350,60, 40);
	btn0.setFont(new Font("Arial", Font.BOLD,20));
	frame.add(btn0);
		
	btnMaisMenos.setBounds(150,350,60, 40);
	btnMaisMenos.setFont(new Font("Arial", Font.BOLD,20));
	frame.add(btnMaisMenos);
		
	btnIgual.setBounds(220,350,60, 40);
	btnIgual.setFont(new Font("Arial", Font.BOLD,20));
	frame.add(btnIgual);	
	}
	
    public void addActionEvent() {
	
        btnFechar.addActionListener(this);
        btnCe.addActionListener(this);
        btnC.addActionListener(this);
        btnDiv.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btnMult.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btnSub.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btnSoma.addActionListener(this);
        btnVirgula.addActionListener(this);
        btn0.addActionListener(this);
        btnMaisMenos.addActionListener(this);
        btnIgual.addActionListener(this);
        
    }

    public static void main(String[]args) {
	Calculadora calculadora = new Calculadora();
		
    }

    public void actionPerformed(ActionEvent e) {
	Object source = e.getSource();
		
	enable();
		
        if (source == btnFechar){
            frame.dispose();
        }else if(source == btnC) {
            label.setText("");
            textField.setText("");
	}
        else if(source == btnCe) {
            int lenght = textField.getText().length();
            int num = lenght-1;
            if(lenght>0) {
				
		StringBuilder back = new StringBuilder(textField.getText());
		back.deleteCharAt(num);
		textField.setText(back.toString());
	}if(textField.getText().endsWith(""));
            label.setText("");
	}else if(source == btn1) {
            textField.setText(textField.getText()+ "1");
	}else if(source == btn2) {
            textField.setText(textField.getText()+ "2");
	}else if(source == btn3) {
            textField.setText(textField.getText()+ "3");
        }else if(source == btn4) {
            textField.setText(textField.getText()+ "4");
	}else if(source == btn5) {
            textField.setText(textField.getText()+ "5");
	}else if(source == btn6) {
            textField.setText(textField.getText()+ "6");
	}else if(source == btn7) {
            textField.setText(textField.getText()+ "7");
	}else if(source == btn8) {
	textField.setText(textField.getText()+ "8");
	}else if(source == btn9) {
            textField.setText(textField.getText()+ "9");
	}else if(source == btn0) {
            textField.setText(textField.getText()+ "0");
	}else if(source == btnCe) {
            if(textField.getText().contains(".")) {
		return;
            }else {
                textField.setText(textField.getText()+ "." );
	}   }else if(source == btnSoma) {
                String str = textField.getText();
                n1 = Double.parseDouble(textField.getText());
                calculo = 1;
                textField.setText("");
                label.setText(str+ "+");
            }
        
        else if(source == btnSub) {
            String str = textField.getText();
            n1 = Double.parseDouble(textField.getText());
            calculo = 2;
            textField.setText("");
            label.setText(str+ "-");
	}else if(source == btnSoma) {
            String str = textField.getText();
            n1 = Double.parseDouble(textField.getText());
            calculo = 1;
            textField.setText("");
            label.setText(str+ "+");
	}else if(source == btnDiv) {
            String str = textField.getText();
            n1 = Double.parseDouble(textField.getText());
            calculo = 4;
            textField.setText("");
            label.setText(str+ "/");
	}else if(source == btnMult) {
            String str = textField.getText();
            n1 = Double.parseDouble(textField.getText());
            calculo = 3;
            textField.setText("");
            label.setText(str+ "*");
	}else if(source == btnIgual) {
            n2 = Double.parseDouble(textField.getText());
            switch(calculo) {
            case 1:
		result = n1 + n2;
		break;
            case 2:
                result =  n1-n2;
		break;
            case 3:
		result = n1*n2;
		break;
            case 4:
                result = n1/n2;
		break;
	}
        if(Double.toString(result).endsWith(".0")) {
            textField.setText(Double.toString(result).replace(".0", ""));	
	}else {
            textField.setText(Double.toString(result));
	}
	label.setText("");
        n1=result;
	}
    }
	
    public void enable() {
        btnFechar.setEnabled(true);
        btnCe.setEnabled(true);
        btnC.setEnabled(true);
        btnDiv.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
        btnMult.setEnabled(true);
	btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btnSub.setEnabled(true);
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btnSoma.setEnabled(true);
        btnVirgula.setEnabled(true);
        btn0.setEnabled(true);
        btnMaisMenos.setEnabled(true);
        btnIgual.setEnabled(true);
    }
}
