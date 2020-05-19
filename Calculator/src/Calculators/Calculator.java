package Calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;

public class Calculator {

	private JFrame frmCalculator;
	private JTextField txtDisplay;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setBackground(new Color(0, 255, 127));
		frmCalculator.getContentPane().setBackground(Color.ORANGE);
		frmCalculator.setResizable(false);
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 305, 380);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setEditable(false);
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setFont(new Font("Calibri", Font.BOLD, 20));
		txtDisplay.setBounds(10, 10, 270, 45);
		frmCalculator.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		// ---------------------Row 0--------------------
				JButton btnDel = new JButton("<-");
				btnDel.setForeground(new Color(255, 0, 0));
				btnDel.setBackground(new Color(220, 220, 220));
				btnDel.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String del = null;
						if(txtDisplay.getText().length()> 0) {
						StringBuilder strB = new StringBuilder(txtDisplay.getText());
						strB.deleteCharAt(txtDisplay.getText().length() - 1);
						del = strB.toString();
						txtDisplay.setText(del);
							
						}
					}
				});
				btnDel.setFont(new Font("Calibri", Font.BOLD, 18));
				btnDel.setBounds(10, 60, 50, 50);
				frmCalculator.getContentPane().add(btnDel);
				
				JButton btnClear = new JButton("C");
				btnClear.setForeground(new Color(255, 0, 0));
				btnClear.setBackground(new Color(220, 220, 220));
				btnClear.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						 txtDisplay.setText(null );
					}
				});
				btnClear.setFont(new Font("Calibri", Font.BOLD, 18));
				btnClear.setBounds(65, 60, 50, 50);
				frmCalculator.getContentPane().add(btnClear);
				
				JButton btnPercent = new JButton("%");
				btnPercent.setForeground(new Color(255, 0, 0));
				btnPercent.setBackground(new Color(220, 220, 220));
				btnPercent.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						firstnum= Double.parseDouble(txtDisplay.getText());
						txtDisplay.setText("");
						operations = "%";
					}
				});
				btnPercent.setFont(new Font("Calibri", Font.BOLD, 18));
				btnPercent.setBounds(230, 170, 50, 50);
				frmCalculator.getContentPane().add(btnPercent);
				
				JButton btnPlus = new JButton("+");
				btnPlus.setForeground(new Color(255, 0, 0));
				btnPlus.setBackground(new Color(220, 220, 220));
				btnPlus.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						firstnum= Double.parseDouble(txtDisplay.getText());
						txtDisplay.setText("");
						operations = "+";
					}
				});
				btnPlus.setFont(new Font("Calibri", Font.BOLD, 18));
				btnPlus.setBounds(175, 280, 50, 50);
				frmCalculator.getContentPane().add(btnPlus);
		
		// ---------------------Row 1--------------------
		JButton btn7 = new JButton("7");
		btn7.setBackground(new Color(220, 220, 220));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() +btn7.getText();
				 txtDisplay.setText(EnterNumber );
			}
		});
		btn7.setFont(new Font("Calibri", Font.BOLD, 18));
		btn7.setBounds(10, 115, 50, 50);
		frmCalculator.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBackground(new Color(220, 220, 220));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() +btn8.getText();
				 txtDisplay.setText(EnterNumber );
			}
		});
		btn8.setFont(new Font("Calibri", Font.BOLD, 18));
		btn8.setBounds(65, 115, 50, 50);
		frmCalculator.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBackground(new Color(220, 220, 220));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() +btn9.getText();
				 txtDisplay.setText(EnterNumber );
			}
		});
		btn9.setFont(new Font("Calibri", Font.BOLD, 18));
		btn9.setBounds(120, 115, 50, 50);
		frmCalculator.getContentPane().add(btn9);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setForeground(new Color(255, 0, 0));
		btnMinus.setBackground(new Color(220, 220, 220));
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum= Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "-";
			}
		});
		btnMinus.setFont(new Font("Calibri", Font.BOLD, 18));
		btnMinus.setBounds(175, 225, 50, 50);
		frmCalculator.getContentPane().add(btnMinus);
		
		// ---------------------Row 2--------------------
				JButton btn4 = new JButton("4");
				btn4.setBackground(new Color(220, 220, 220));
				btn4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String EnterNumber = txtDisplay.getText() +btn4.getText();
						 txtDisplay.setText(EnterNumber );
					}
				});
				btn4.setFont(new Font("Calibri", Font.BOLD, 18));
				btn4.setBounds(10, 170, 50, 50);
				frmCalculator.getContentPane().add(btn4);
				
				JButton btn5 = new JButton("5");
				btn5.setBackground(new Color(220, 220, 220));
				btn5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String EnterNumber = txtDisplay.getText() +btn5.getText();
						 txtDisplay.setText(EnterNumber );
					}
				});
				btn5.setFont(new Font("Calibri", Font.BOLD, 18));
				btn5.setBounds(65, 170, 50, 50);
				frmCalculator.getContentPane().add(btn5);
				
				JButton btn6 = new JButton("6");
				btn6.setBackground(new Color(220, 220, 220));
				btn6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String EnterNumber = txtDisplay.getText() +btn6.getText();
						 txtDisplay.setText(EnterNumber );
					}
				});
				btn6.setFont(new Font("Calibri", Font.BOLD, 18));
				btn6.setBounds(120, 170, 50, 50);
				frmCalculator.getContentPane().add(btn6);
				
				JButton btnMult = new JButton("x");
				btnMult.setForeground(new Color(255, 0, 0));
				btnMult.setBackground(new Color(220, 220, 220));
				btnMult.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						firstnum= Double.parseDouble(txtDisplay.getText());
						txtDisplay.setText("");
						operations = "*";
					}
				});
				btnMult.setFont(new Font("Calibri", Font.BOLD, 18));
				btnMult.setBounds(175, 170, 50, 50);
				frmCalculator.getContentPane().add(btnMult);
				
		// ---------------------Row 3--------------------
				JButton btn1 = new JButton("1");
				btn1.setBackground(new Color(220, 220, 220));
				btn1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String EnterNumber = txtDisplay.getText() +btn1.getText();
						 txtDisplay.setText(EnterNumber );
					}
				});
				btn1.setFont(new Font("Calibri", Font.BOLD, 18));
				btn1.setBounds(10, 225, 50, 50);
				frmCalculator.getContentPane().add(btn1);
				
				JButton btn2 = new JButton("2");
				btn2.setBackground(new Color(220, 220, 220));
				btn2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String EnterNumber = txtDisplay.getText() +btn2.getText();
						 txtDisplay.setText(EnterNumber );
					}
				});
				btn2.setFont(new Font("Calibri", Font.BOLD, 18));
				btn2.setBounds(65, 225, 50, 50);
				frmCalculator.getContentPane().add(btn2);
				
				JButton btn3 = new JButton("3");
				btn3.setBackground(new Color(220, 220, 220));
				btn3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String EnterNumber = txtDisplay.getText() +btn3.getText();
						 txtDisplay.setText(EnterNumber );
					}
				});
				btn3.setFont(new Font("Calibri", Font.BOLD, 18));
				btn3.setBounds(120, 225, 50, 50);
				frmCalculator.getContentPane().add(btn3);
				
				JButton btnDiv = new JButton("/");
				btnDiv.setForeground(new Color(255, 0, 0));
				btnDiv.setBackground(new Color(220, 220, 220));
				btnDiv.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						firstnum= Double.parseDouble(txtDisplay.getText());
						txtDisplay.setText("");
						operations = "/";
					}
				});
				btnDiv.setFont(new Font("Calibri", Font.BOLD, 18));
				btnDiv.setBounds(175, 115, 50, 50);
				frmCalculator.getContentPane().add(btnDiv);
		
		// ---------------------Row 4--------------------
				JButton btn0 = new JButton("0");
				btn0.setBackground(new Color(220, 220, 220));
				btn0.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String EnterNumber = txtDisplay.getText() +btn0.getText();
						 txtDisplay.setText(EnterNumber );
					}
				});
				btn0.setFont(new Font("Calibri", Font.BOLD, 18));
				btn0.setBounds(10, 280, 105, 50);
				frmCalculator.getContentPane().add(btn0);
				
				JButton btnDot = new JButton(".");
				btnDot.setBackground(new Color(220, 220, 220));
				btnDot.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String EnterNumber = txtDisplay.getText() +btnDot.getText();
						 txtDisplay.setText(EnterNumber );
					}
				});
				btnDot.setFont(new Font("Calibri", Font.BOLD, 18));
				btnDot.setBounds(120, 280, 50, 50);
				frmCalculator.getContentPane().add(btnDot);
				
				JButton btnSign = new JButton("+-");
				btnSign.setForeground(new Color(255, 0, 0));
				btnSign.setBackground(new Color(220, 220, 220));
				btnSign.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
						ops = ops * (-1);
						txtDisplay.setText(String.valueOf(ops));
					}
				});
				btnSign.setFont(new Font("Calibri", Font.BOLD, 18));
				btnSign.setBounds(120, 60, 50, 50);
				frmCalculator.getContentPane().add(btnSign);
				
				JButton btnEqual = new JButton("=");
				btnEqual.setForeground(new Color(255, 0, 0));
				btnEqual.setBackground(new Color(220, 220, 220));
				btnEqual.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String answer;
						secondnum =Double.parseDouble(txtDisplay.getText());
						if (operations == "+")
						{
							result = firstnum + secondnum;
							answer = String.format("%.2f", result);
							txtDisplay.setText(answer);
						}
						else if ( operations == "-")
						{
							result = firstnum - secondnum;
							answer = String.format("%.2f", result);
							txtDisplay.setText(answer);
						}
						else if ( operations == "*")
						{
							result = firstnum * secondnum;
							answer = String.format("%.2f", result);
							txtDisplay.setText(answer);
						}
						else if ( operations == "/")
						{
							result = firstnum / secondnum;
							answer = String.format("%.2f", result);
							txtDisplay.setText(answer);
						}
						else if ( operations == "%")
						{
							result = firstnum % secondnum;
							answer = String.format("%.2f", result);
							txtDisplay.setText(answer);
						}
							
					}
				});
				btnEqual.setFont(new Font("Calibri", Font.BOLD, 18));
				btnEqual.setBounds(230, 225, 50, 105);
				frmCalculator.getContentPane().add(btnEqual);
				
				JButton btnNewButton = new JButton("P");
				btnNewButton.setBackground(new Color(0, 255, 0));
				btnNewButton.setEnabled(false);
				btnNewButton.setBounds(175, 69, 40, 30);
				frmCalculator.getContentPane().add(btnNewButton);
				
				JButton btnNewButton_1 = new JButton("P");
				btnNewButton_1.setBackground(new Color(0, 255, 0));
				btnNewButton_1.setEnabled(false);
				btnNewButton_1.setBounds(230, 129, 40, 30);
				frmCalculator.getContentPane().add(btnNewButton_1);
				
				JButton btnNewButton_2 = new JButton("P");
				btnNewButton_2.setBackground(new Color(0, 255, 0));
				btnNewButton_2.setEnabled(false);
				btnNewButton_2.setBounds(229, 69, 40, 30);
				frmCalculator.getContentPane().add(btnNewButton_2);
	}
}
