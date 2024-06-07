package lab_exams_10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class problem{
	public static void main(String[] args) {
		JFrame f = new JFrame();
		JLabel l1 = new JLabel("Number Addition");
		JLabel l2 = new JLabel("First Number:");
		JLabel l3 = new JLabel("Second Number:");
		JLabel l4 = new JLabel("Result:");
		JTextField t1 = new JTextField();
		JTextField t2 = new JTextField();
		JTextField t3 = new JTextField();
		JButton b1 = new JButton("Add");
		JButton b2 = new JButton("Clear");
		JButton b3 = new JButton("Exit");
		
		
		l1.setBounds(50,10,100,30);
		l1.setForeground(Color.BLUE);
		l2.setBounds(100, 40, 100, 30);
	    l3.setBounds(83, 70, 100, 30);
	    l4.setBounds(137, 100, 100, 30);
	    t1.setBounds(180, 40, 150, 25);
	    t2.setBounds(180, 70, 150, 25);
	    t3.setBounds(180, 100, 150, 25);
	    b1.setBounds(180, 130, 60, 30);
	    b2.setBounds(250, 130, 70, 30);
	    b3.setBounds(300, 180, 70, 30);
	    
	    b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e1) {
                // Perform addition when b1 is clicked
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int sum = num1 + num2;
                t3.setText(String.valueOf(sum));
            }
        });
	    
	    b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e2) {
            	 t1.setText("");
                 t2.setText("");
                 t3.setText("");
            }
        });
	    
	    b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e3) {
            	System.exit(0);
            }
        });
	
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.setSize(400,300);
		f.setLayout(null);
		f.setVisible(true);
	}
	
}