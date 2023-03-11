import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class calc implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextArea textarea = new JTextArea(2,10);
	
	JButton btn_1 = new JButton("1");
	JButton btn_2 = new JButton("2");
	JButton btn_3 = new JButton("3");
	JButton btn_4 = new JButton("4");
	JButton btn_5 = new JButton("5");
	JButton btn_6 = new JButton("6");
	JButton btn_7 = new JButton("7");
	JButton btn_8 = new JButton("8");
	JButton btn_9 = new JButton("9");
	JButton btn_0 = new JButton("0");
	JButton btn_add = new JButton("+");
	JButton btn_sub = new JButton("-");
	JButton btn_mult = new JButton("X");
	JButton btn_div = new JButton("/");
	JButton btn_dot = new JButton(".");
	JButton btn_eql = new JButton("=");
	JButton btn_clr = new JButton("C");
	
	double number1, number2, result;
	int addc = 0, subc = 0, divc = 0, multc = 0;
	
	public calc () {
		frame.setSize(340, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("Calculator");
		frame.setResizable(false);
		
		frame.add(panel);
		panel.setBackground(Color.black);
		
		panel.add(textarea);
		textarea.setBackground(Color.white);
		Font font = new Font ("arial",Font.BOLD,33);
		textarea.setFont(font);

		btn_1.setPreferredSize(new Dimension(80, 60));
		btn_2.setPreferredSize(new Dimension(80, 60));
		btn_3.setPreferredSize(new Dimension(80, 60));
		btn_4.setPreferredSize(new Dimension(80, 60));
		btn_5.setPreferredSize(new Dimension(80, 60));
		btn_6.setPreferredSize(new Dimension(80, 60));
		btn_7.setPreferredSize(new Dimension(80, 60));
		btn_8.setPreferredSize(new Dimension(80, 60));
		btn_9.setPreferredSize(new Dimension(80, 60));
		btn_0.setPreferredSize(new Dimension(80, 60));
		btn_add.setPreferredSize(new Dimension(80, 60));
		btn_sub.setPreferredSize(new Dimension(80, 60));
		btn_mult.setPreferredSize(new Dimension(80, 60));
		btn_div.setPreferredSize(new Dimension(80, 60));
		btn_eql.setPreferredSize(new Dimension(80, 60));
		btn_dot.setPreferredSize(new Dimension(80, 60));
		btn_clr.setPreferredSize(new Dimension(80, 60));
		
		btn_1.setFont(new Font("Arial", Font.PLAIN, 40));
		btn_2.setFont(new Font("Arial", Font.PLAIN, 40));
		btn_3.setFont(new Font("Arial", Font.PLAIN, 40));
		btn_4.setFont(new Font("Arial", Font.PLAIN, 40));
		btn_5.setFont(new Font("Arial", Font.PLAIN, 40));
		btn_6.setFont(new Font("Arial", Font.PLAIN, 40));
		btn_7.setFont(new Font("Arial", Font.PLAIN, 40));
		btn_8.setFont(new Font("Arial", Font.PLAIN, 40));
		btn_9.setFont(new Font("Arial", Font.PLAIN, 40));
		btn_0.setFont(new Font("Arial", Font.PLAIN, 40));
		btn_add.setFont(new Font("Arial", Font.PLAIN, 40));
		btn_sub.setFont(new Font("Arial", Font.PLAIN, 40));
		btn_div.setFont(new Font("Arial", Font.PLAIN, 40));
		btn_mult.setFont(new Font("Arial", Font.PLAIN, 40));
		btn_eql.setFont(new Font("Arial", Font.PLAIN, 40));
		btn_dot.setFont(new Font("Arial", Font.PLAIN, 40));
		btn_clr.setFont(new Font("Arial", Font.PLAIN, 40));

		
		
		panel.add(btn_1);
		panel.add(btn_2);
		panel.add(btn_3);
		panel.add(btn_4);
		panel.add(btn_5);
		panel.add(btn_6);
		panel.add(btn_7);
		panel.add(btn_8);
		panel.add(btn_9);
		panel.add(btn_0);
		panel.add(btn_mult);
		panel.add(btn_div);
		panel.add(btn_sub);
		panel.add(btn_dot);
		panel.add(btn_add);
		panel.add(btn_eql);
		panel.add(btn_clr);
		
		btn_1.addActionListener(this);
		btn_2.addActionListener(this);
		btn_3.addActionListener(this);
		btn_4.addActionListener(this);
		btn_5.addActionListener(this);
		btn_6.addActionListener(this);
		btn_7.addActionListener(this);
		btn_8.addActionListener(this);
		btn_9.addActionListener(this);
		btn_0.addActionListener(this);
		btn_add.addActionListener(this);
		btn_sub.addActionListener(this);
		btn_div.addActionListener(this);
		btn_mult.addActionListener(this);
		btn_eql.addActionListener(this);
		btn_dot.addActionListener(this);
		btn_clr.addActionListener(this);
	}

	
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		if(source == btn_1){
			textarea.append("1");
		}
		if(source == btn_2){
			textarea.append("2");
		}
		if(source == btn_3){
			textarea.append("3");
		}
		if(source == btn_4){
			textarea.append("4");
		}
		if(source == btn_5){
			textarea.append("5");
		}
		if(source == btn_6){
			textarea.append("6");
		}
		if(source == btn_7){	
			textarea.append("7");
		}
		if(source == btn_8){
			textarea.append("8");
		}
		if(source == btn_9){
			textarea.append("9");
		}
		if(source == btn_0){
			textarea.append("0");
		}
		if(source == btn_dot){
			textarea.append(".");
		}
		
		if(source == btn_add){
			number1 = number_reader();
			textarea.setText("");
			addc = 1;
			divc = 0;
			subc = 0;
			multc = 0;
		}
		if(source == btn_sub){
			number1 = number_reader();
			textarea.setText("");
			addc = 0;
			divc = 0;
			subc = 1;
			multc = 0;
		}
		if(source == btn_div){
			number1 = number_reader();
			textarea.setText("");
			addc = 0;
			divc = 1;
			subc = 0;
			multc = 0;
		}
		if(source == btn_mult){
			number1 = number_reader();
			textarea.setText("");
			addc = 0;
			divc = 0;
			subc = 0;
			multc = 1;
		}
		
		if(source == btn_clr){
			number1 = 0.0;
			number2 = 0.0;
			textarea.setText("");
		}
		
		if(source == btn_eql){
			number2 = number_reader();
			
			if(addc > 0){
				result = number1 + number2;
				textarea.setText(Double.toString(result));
			}
			if(subc > 0){
				result = number1 - number2;
				textarea.setText(Double.toString(result));
			}
			if(divc > 0){
				result = number1 / number2;
				textarea.setText(Double.toString(result));
			}
			if(multc > 0){
				result = number1 * number2;
				textarea.setText(Double.toString(result));
			}
		}
		
	}
	
	public double number_reader() {
		double num1;
		String s;
		s = textarea.getText();
		num1 = Double.valueOf(s);
		return num1;
	}
}

