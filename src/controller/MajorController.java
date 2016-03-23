package controller;

import view.PopUpDisplay;

public class MajorController
{
	private PopUpDisplay myPopUp;
	private String userYear;
	private String userMajor;	

	public MajorController()
	{
		myPopUp = new PopUpDisplay();
	}
	
	public void start()
	{
		String userInput = myPopUp.grabAnswer("Please type in the first letter of your major, and the number corresponding with your year. For example (C2) or (I4)");
		userMajor = Character.toString(userInput.charAt(0));
		userYear = Character.toString(userInput.charAt(1));
		
		showUserMajor();
		showUserStatus();
		myPopUp.showResponse("Your major is " + userMajor + " and your are a " + userYear);
		
	}
	
	private void showUserMajor()
	{
		if(userMajor.equals("C") || userMajor.equals("c"))
		{
			userMajor = "Computer Science";
		}
		else if(userMajor.equals("M") || userMajor.equals("m"))
		{
			userMajor = "Mathematics";
		}
		else if(userMajor.equals("I") || userMajor.equals("i"))
		{
			userMajor = "Information Technology";
		}
		else
		{
			userMajor = "Error: Major Not Found";
		}
	}
	
	private void showUserStatus()
	{
		if(userYear.equals("1"))
		{
			userYear = "Freshman";
		}
		else if(userYear.equals("2"))
		{
			userYear = "Sophomore";
		}
		else if(userYear.equals("3"))	
		{
			userYear = "Junoir";
		}
		else if(userYear.equals("4"))
		{
			userYear = "Senior";
		} 
		else
		{
			userYear = "Error: Year not found";
		}
	}
}
