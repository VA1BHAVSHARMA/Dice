package dice;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class MyFrame extends JFrame implements ActionListener{

	Random random;
	JButton button1;
	JButton button2;
	JButton button3;
	ImageIcon im1;
	ImageIcon im2;
	ImageIcon im3;
	ImageIcon im4;
	ImageIcon im5;
	ImageIcon im6;
	ImageIcon die;
	
	JLabel label11;
	JLabel label21;
	JLabel label31;
	JLabel label41;
	JLabel label51;
	JLabel label61;
	JLabel label12;
	JLabel label22;
	JLabel label32;
	JLabel label42;
	JLabel label52;
	JLabel label62;
	JLabel label13;
	JLabel label23;
	JLabel label33;
	JLabel label43;
	JLabel label53;
	JLabel label63;
	
	MyFrame() {
		
		random = new Random();
		
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button1.setFont(new Font("Geneva",Font.BOLD,20));
		button2.setFont(new Font("Geneva",Font.BOLD,20));
		button3.setFont(new Font("Geneva",Font.BOLD,20));
		
		im1 = new ImageIcon("one.png");
		im2 = new ImageIcon("two.png");
		im3 = new ImageIcon("three.png");
		im4 = new ImageIcon("four.png");
		im5 = new ImageIcon("five.png");
		im6 = new ImageIcon("six.png");
		
		label11 = new JLabel();
		label21 = new JLabel();
		label31 = new JLabel();
		label41 = new JLabel();
		label51 = new JLabel();
		label61 = new JLabel();
		label11.setIcon(im1);
		label21.setIcon(im2);
		label31.setIcon(im3);
		label41.setIcon(im4);
		label51.setIcon(im5);
		label61.setIcon(im6);
		label11.setVisible(false);
		label21.setVisible(false);
		label31.setVisible(false);
		label41.setVisible(false);
		label51.setVisible(false);
		label61.setVisible(false);
		label11.setBounds(80,300,100,100);
		label21.setBounds(80,300,100,100);
		label31.setBounds(80,300,100,100);
		label41.setBounds(80,300,100,100);
		label51.setBounds(80,300,100,100);
		label61.setBounds(80,300,100,100);
		
		label12 = new JLabel();
		label22 = new JLabel();
		label32 = new JLabel();
		label42 = new JLabel();
		label52 = new JLabel();
		label62 = new JLabel();
		label12.setIcon(im1);
		label22.setIcon(im2);
		label32.setIcon(im3);
		label42.setIcon(im4);
		label52.setIcon(im5);
		label62.setIcon(im6);
		label12.setVisible(false);
		label22.setVisible(false);
		label32.setVisible(false);
		label42.setVisible(false);
		label52.setVisible(false);
		label62.setVisible(false);
		label12.setBounds(200,300,100,100);
		label22.setBounds(200,300,100,100);
		label32.setBounds(200,300,100,100);
		label42.setBounds(200,300,100,100);
		label52.setBounds(200,300,100,100);
		label62.setBounds(200,300,100,100);
		
		label13 = new JLabel();
		label23 = new JLabel();
		label33 = new JLabel();
		label43 = new JLabel();
		label53 = new JLabel();
		label63 = new JLabel();
		label13.setIcon(im1);
		label23.setIcon(im2);
		label33.setIcon(im3);
		label43.setIcon(im4);
		label53.setIcon(im5);
		label63.setIcon(im6);
		label13.setVisible(false);
		label23.setVisible(false);
		label33.setVisible(false);
		label43.setVisible(false);
		label53.setVisible(false);
		label63.setVisible(false);
		label13.setBounds(320,300,100,100);
		label23.setBounds(320,300,100,100);
		label33.setBounds(320,300,100,100);
		label43.setBounds(320,300,100,100);
		label53.setBounds(320,300,100,100);
		label63.setBounds(320,300,100,100);
		
		button1.setBounds(80,100,100,50);
		button2.setBounds(200,100,100,50);
		button3.setBounds(320,100,100,50);
		button1.setBackground(new Color(0,134,36));
		button2.setBackground(new Color(0,134,36));
		button3.setBackground(new Color(0,134,36));
		button1.setForeground(new Color(255,255,255));
		button2.setForeground(new Color(255,255,255));
		button3.setForeground(new Color(255,255,255));
		button1.setBorder(BorderFactory.createBevelBorder(1, Color.black, Color.black));
		button2.setBorder(BorderFactory.createBevelBorder(1, Color.black, Color.black));
		button3.setBorder(BorderFactory.createBevelBorder(1, Color.black, Color.black));
		button1.setFocusable(false);
		button2.setFocusable(false);
		button3.setFocusable(false);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		
		JLabel text = new JLabel();
		text.setText("Choose the number of Dice you wanna roll");
		text.setFont(new Font("MV Boli",Font.PLAIN,20));
		text.setBackground(new Color(146,255,176));
		text.setBounds(40,10,480,80);
		text.setOpaque(true);
		
		JLabel color = new JLabel();
		color.setBackground(new Color(146,255,176));
		color.setBounds(0,0,500,600);
		color.setOpaque(true);
		
		this.add(text);
		this.add(label11);
		this.add(label21);
		this.add(label31);
		this.add(label41);
		this.add(label51);
		this.add(label61);
		this.add(label12);
		this.add(label22);
		this.add(label32);
		this.add(label42);
		this.add(label52);
		this.add(label62);
		this.add(label13);
		this.add(label23);
		this.add(label33);
		this.add(label43);
		this.add(label53);
		this.add(label63);
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(color);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Dice Roller");
		this.setSize(500,600);
		this.setLayout(null);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		die = new ImageIcon("die.png");
		this.setIconImage(die.getImage());
		this.setResizable(false);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button1) {
			label11.setVisible(false);
			label21.setVisible(false);
			label31.setVisible(false);
			label41.setVisible(false);
			label51.setVisible(false);
			label61.setVisible(false);
			label12.setVisible(false);
			label22.setVisible(false);
			label32.setVisible(false);
			label42.setVisible(false);
			label52.setVisible(false);
			label62.setVisible(false);
			label13.setVisible(false);
			label23.setVisible(false);
			label33.setVisible(false);
			label43.setVisible(false);
			label53.setVisible(false);
			label63.setVisible(false);
			
				int x = random.nextInt(6)+1;
			
				switch(x) {
				case 1: label11.setVisible(true);
				break;
				case 2: label21.setVisible(true);
				break;
				case 3: label31.setVisible(true);
				break;
				case 4: label41.setVisible(true);
				break;
				case 5: label51.setVisible(true);
				break;
				case 6: label61.setVisible(true);
				break;
				}
		
			}
		if(e.getSource()==button2) {
			label11.setVisible(false);
			label21.setVisible(false);
			label31.setVisible(false);
			label41.setVisible(false);
			label51.setVisible(false);
			label61.setVisible(false);
			label12.setVisible(false);
			label22.setVisible(false);
			label32.setVisible(false);
			label42.setVisible(false);
			label52.setVisible(false);
			label62.setVisible(false);
			label13.setVisible(false);
			label23.setVisible(false);
			label33.setVisible(false);
			label43.setVisible(false);
			label53.setVisible(false);
			label63.setVisible(false);
				
				int x = random.nextInt(6)+1;
				int a = random.nextInt(6)+1;
				
				switch(x) {
				case 1: label11.setVisible(true);
				break;
				case 2: label21.setVisible(true);
				break;
				case 3: label31.setVisible(true);
				break;
				case 4: label41.setVisible(true);
				break;
				case 5: label51.setVisible(true);
				break;
				case 6: label61.setVisible(true);
				break;
				}
				switch(a) {
				case 1: label12.setVisible(true);
				break;
				case 2: label22.setVisible(true);
				break;
				case 3: label32.setVisible(true);
				break;
				case 4: label42.setVisible(true);
				break;
				case 5: label52.setVisible(true);
				break;
				case 6: label62.setVisible(true);
				break;
				}
		
			}
		if(e.getSource()==button3) {
				label11.setVisible(false);
				label21.setVisible(false);
				label31.setVisible(false);
				label41.setVisible(false);
				label51.setVisible(false);
				label61.setVisible(false);
				label12.setVisible(false);
				label22.setVisible(false);
				label32.setVisible(false);
				label42.setVisible(false);
				label52.setVisible(false);
				label62.setVisible(false);
				label13.setVisible(false);
				label23.setVisible(false);
				label33.setVisible(false);
				label43.setVisible(false);
				label53.setVisible(false);
				label63.setVisible(false);
				
				int x = random.nextInt(6)+1;
				int a = random.nextInt(6)+1;
				int b = random.nextInt(6)+1;
				
				switch(x) {
				case 1: label11.setVisible(true);
				break;
				case 2: label21.setVisible(true);
				break;
				case 3: label31.setVisible(true);
				break;
				case 4: label41.setVisible(true);
				break;
				case 5: label51.setVisible(true);
				break;
				case 6: label61.setVisible(true);
				break;
				}
				switch(a) {
				case 1: label12.setVisible(true);
				break;
				case 2: label22.setVisible(true);
				break;
				case 3: label32.setVisible(true);
				break;
				case 4: label42.setVisible(true);
				break;
				case 5: label52.setVisible(true);
				break;
				case 6: label62.setVisible(true);
				break;
				}
				switch(b) {
				case 1: label13.setVisible(true);
				break;
				case 2: label23.setVisible(true);
				break;
				case 3: label33.setVisible(true);
				break;
				case 4: label43.setVisible(true);
				break;
				case 5: label53.setVisible(true);
				break;
				case 6: label63.setVisible(true);
				break;
				}
		
			}
	}
}
