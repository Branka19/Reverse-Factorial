
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;

import javax.swing.*;

public class Design extends JFrame implements ActionListener {
	
	JTextField fieldnumber;
	JTextField fieldresult;
	JLabel instructions;
	JLabel number;
	JButton button;
	JLabel text;
	GridBagConstraints gbc = new GridBagConstraints();
	JPanel pane = new JPanel();
	
	public Design() {
		
		add(pane);
		pane.setLayout(new GridBagLayout());
		gbc.insets = new Insets(5, 5, 5, 5);
		
		instructions = new JLabel("n! > m", JLabel.CENTER);
		instructions.setLabelFor(text);
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL; 
		gbc.gridwidth = 50;
		pane.add(instructions, gbc);
		
		text = new JLabel();
		text.setPreferredSize(new Dimension(50, 50));
		String myString = "Insert a long positive number m in order to find its smallest int number n such that n! > m.";
		text.setText("<html>" + myString + "</html>");
		text.setHorizontalAlignment(SwingConstants.CENTER);
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;  
		pane.add(text, gbc);
		
		number = new JLabel("m", JLabel.CENTER);
		number.setLabelFor(fieldnumber);
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.fill = GridBagConstraints.HORIZONTAL;  
		pane.add(number, gbc);

		fieldnumber = new JTextField(20);
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		pane.add(fieldnumber, gbc);
		
		button = new JButton("Calculate");	
		gbc.gridx = 0;
		gbc.gridy = 4;  
		pane.add(button, gbc);

		JLabel result = new JLabel("n", JLabel.CENTER);	
		result.setLabelFor(fieldresult);
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.fill = GridBagConstraints.HORIZONTAL;  
		pane.add(result, gbc);
		
		fieldresult = new JTextField(20);
		gbc.gridx = 0;
		gbc.gridy = 6;
		gbc.fill = GridBagConstraints.HORIZONTAL;  
		pane.add(fieldresult, gbc);
		
		fieldnumber.setHorizontalAlignment(SwingConstants.CENTER);
		
		button.addActionListener(this);
		
		setTitle("Reverse Factorial Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		long m = Long.parseLong(fieldnumber.getText());
		long n = 0;
		while (m > 0) {
		    m = m / ++n;
		}
		//printing the n:
		String result = n + "";
		fieldresult.setHorizontalAlignment(SwingConstants.CENTER);
		fieldresult.setText(result);
	}

}