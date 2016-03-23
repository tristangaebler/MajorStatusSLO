package model;

import java.util.ArrayList;

public class MajorStatus
{

	private ArrayList<String> majors;
	private ArrayList<String> status;
	
	public MajorStatus()
	{
		this.majors = new ArrayList<String>();
		this.status = new ArrayList<String>();
		
		buildMajors();
		buildStatus();
	}
	
	public void buildMajors()
	{
		this.majors.add("Computer Science");
		this.majors.add("Mathematics");
		this.majors.add("Information Technology");
	}
	
	public void buildStatus()
	{
		this.status.add("Freshmen");
		this.status.add("Sophmore");
		this.status.add("Junior");
		this.status.add("Senior");
	}
}
