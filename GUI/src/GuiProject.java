import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class GuiProject {

	public static void main(String[] args) {

		JFrame frame=new JFrame("sum of numbers");
		frame.setLayout(new FlowLayout());
		frame.setSize(400, 500);
		
		
		JTextField jfield1=new JTextField("enter n1");
		frame.add(jfield1);
		
		JTextField jfield2=new JTextField("enter n2");
		frame.add(jfield2);
		
		JButton button =new JButton("SUM");
		frame.add(button);
		
		JLabel label=new JLabel("result=");
		frame.add(label);
		
		JRadioButton b1=new JRadioButton("male");
		JRadioButton b2=new JRadioButton("female");
		
		frame.add(b1);
		frame.add(b2);
		
		class Sum implements ActionListener
		{
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String str1=jfield1.getText();
				int a=Integer.parseInt(str1);
				String str2=jfield2.getText();
				int b=Integer.parseInt(str2);
				
				int c=a+b;
				label.setText("Result="+c);
				
			}
		}
		
		Sum listener=new Sum();
		button.addActionListener(listener);
		frame.setVisible(true);
	}

}
