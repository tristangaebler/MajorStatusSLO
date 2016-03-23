package view;

import javax.swing.JOptionPane;

public class PopUpDisplay
{	

	public void showResponse(String wordsFromSomewhere)
	{
		JOptionPane.showMessageDialog(null, wordsFromSomewhere);
	}
	

	public String grabAnswer(String userInput)
	{
		
		userInput = JOptionPane.showInputDialog(null, userInput);
		
		return userInput;
	}
}
