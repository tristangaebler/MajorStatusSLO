package controller;

import model.MajorStatus;
import view.PopUpDisplay;

public class MajorController
{
	private PopUpDisplay myPopUp;
	private MajorStatus myMajor;
	private String userYear;
	private String userMajor;
	

	public MajorController()
	{
		myPopUp = new PopUpDisplay();
	}
	
	public void start()
	{
		String userInput = myPopUp.grabAnswer("Please type in the first letter of your major, and the number corresponding with your year. (C2) or (I4)");
		userMajor = userInput.substring(0, 0);
		userYear = userInput.substring(1, 1);
		
	}
	
	public void showUserMajor()
	{
		if(userMajor.equals('C') || userMajor.equals('c'))
		{
			
		}
	}
}
