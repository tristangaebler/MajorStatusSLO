package controller;

import model.MajorStatus;
import view.PopUpDisplay;

public class MajorController
{
	private PopUpDisplay myPopUp;
	private MajorStatus myMajor;
	private String userYear;
	private String userMajor;
	private String userFullMajor;
	private String userFullYear;
	

	public MajorController()
	{
		myPopUp = new PopUpDisplay();
	}
	
	public void start()
	{
		String userInput = myPopUp.grabAnswer("Please type in the first letter of your major, and the number corresponding with your year. (C2) or (I4)");
		userMajor = userInput.substring(0, 0);
		userYear = userInput.substring(1, 1);
		
		showUserMajor();
		
	}
	
	public void showUserMajor()
	{
		if(userMajor.equals('C') || userMajor.equals('c'))
		{
			userFullMajor = "Computer Science";
		}
		else if(userMajor.equals('M') || userMajor.equals('m'))
		{
			userFullMajor = "Mathematics";
		}
		else if(userMajor.equals('I') || userMajor.equals('i'))
		{
			userFullMajor = "Information Technology";
		}
		else
		{
			userFullMajor = "Error: Major Not Found";
		}
	}
	
	public void showUserStatus()
	{
		if(userYear.equals('1'))
		{
			userFullYear = "Freshmen";
		}
		else if(userYear.equals('2'))
		{
			userFullYear = "Sophmore";
		}
		else if(userYear.equals('3'))
		{
			userFullYear = "Junoir";
		}
		else if(userYear.equals('4'))
		{
			userFullYear = "Senoir";
		} 
		else
		{
			userFullYear = "Error: Year not found";
		}
	}
}
