package extra;

import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	
	
	String inT = JOptionPane.showInputDialog("how ol r u in yEarrrrrrs");
	
	String input=inT;
	
	int num= Integer.parseInt(input);
	
	
	
	
	
	if(num>18) {
	
	
	JOptionPane.showMessageDialog(null, "ure allow to vote");
	
	
	
	
	}
	
	
	
	else if(num<18) {
		
		
		
		
		
		
		JOptionPane.showMessageDialog(null, "scarm u underag!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1!");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	else if(num==18) {
		
		
		
		JOptionPane.showMessageDialog(null, "clutch my dude");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
