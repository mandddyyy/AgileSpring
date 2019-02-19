package org.cvtc.shapes;
import javax.swing.JOptionPane;

public class MessageBox implements Dialog {
	
	@Override
	public int show(String message, String text) {
	
		JOptionPane.showMessageDialog(null, message, text, 3);
		
		return JOptionPane.OK_OPTION;
		
	}

}
