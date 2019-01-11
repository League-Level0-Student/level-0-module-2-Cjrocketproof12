//    Copyright (c) The League of Amazing Programmers 2013-2018
//    Level 0


package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {
		
	
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
		int coolkids = new Random().nextInt(4);
	// 3. Print out this variable
System.out.println(coolkids);
	// 4. Get the user to enter a question for the 8 ball
String eeeeeeeeea = JOptionPane.showInputDialog(null, "Ask a yes or no question");
	// 5. If the random number is 0
if(coolkids == 0 ) {
// -- tell the user "Yes"
	JOptionPane.showMessageDialog(null, "yes");
}
	// 6. If the random number is 1
else if(coolkids == 1) {
	// -- tell the user "No"
JOptionPane.showMessageDialog(null, "no");
}
	// 7. If the random number is 2
else if(coolkids == 2) {
	// -- tell the user "Maybe you should ask Google?"
JOptionPane.showMessageDialog(null, "the future is unfortold");
}
	// 8. If the random number is 3
else if(coolkids == 3) {
	// -- write your own answer
JOptionPane.showMessageDialog(null, "yeet i dont know so ima scadoddle");
}
	}
}
