package input.controller;

import input.view.MashDisplay;
import input.model.Mash;



public class MashController
{

	
	
	

	private MashDisplay myPopups;
	private Mash myMash;
	
		

	public MashController()
	{
		myPopups = new MashDisplay();
	}

	
	
	
	
	
	
	
	public void start()
	{
		String monstername = myPopups.getAnswer("Type in a monster's name: ");
		
		myPopups.displayResponse("Your monster's name is: " + monstername);
		
		
		
		
		
		int eyes;
		String tempEyes = myPopups.getAnswer("How many eyes does it have?");
		
		while(!isInteger(tempEyes))
		{
			tempEyes = myPopups.getAnswer("Type in an integer!");
		}
		
		if(isInteger(tempEyes))
		{
			eyes = Integer.parseInt(tempEyes);
		}
		else
		{
			eyes = -12345678;
		}
		
		myPopups.displayResponse("You typed in: " + eyes);
		
		
		
		
		
		
		int weight;
		String tempWeight = myPopups.getAnswer("How many mouths do you want it to have?");
		
		while(!isInteger(tempWeight))
		{
			tempWeight = myPopups.getAnswer("Type in an integer!");
		}
		
		if(isInteger(tempWeight))
		{
			weight = Integer.parseInt(tempWeight);
		}
		else
		{
			weight = -999999;
		}
		
		myPopups.displayResponse("You typed in: " + weight);
		
		
		
		
		
		
		
		double legs;
		String tempLegs = myPopups.getAnswer("How many legs does it have?");
		
		while(!isDouble(tempLegs))
		{
			tempLegs = myPopups.getAnswer("A valid double please.");
		}
		
		if(isDouble(tempLegs))
		{
			legs = Double.parseDouble(tempLegs);
		}
		else
		{
			legs = -999999;
		}
		
		myPopups.displayResponse("You typed in: " + legs);
		
		
		
		
		double hair;
		String tempHair = myPopups.getAnswer("How many strands of hair does it have?");
		
		while(!isDouble(tempHair))
		{
			tempHair = myPopups.getAnswer("Valid double please");
		}
		
		if(isDouble(tempHair))
		{
			hair = Double.parseDouble(tempHair);
		}
		else
		{
			hair = -9999999.2;
		}
		
		myPopups.displayResponse("You typed in: " + hair);
		
		
		
		
		
		boolean isMale;
		String tempIsMale = myPopups.getAnswer("Is it male? true or false");
		
		while(!isBoolean(tempIsMale))
		{
			tempIsMale = myPopups.getAnswer("true or false only!");
		}
		
		if(isBoolean(tempIsMale))
		{
			isMale = Boolean.parseBoolean(tempIsMale);
		}
		else
		{
			isMale = false;
		}
		
		myPopups.displayResponse("You typed in: " + isMale);
		
		
		
		
	}
		
		
		private boolean isInteger(String input)
		{
			boolean isInt = false;
			
			
			try
			{
				int validInteger = Integer.parseInt(input);
				isInt = true;
			}
			catch(NumberFormatException error)
			{
				myPopups.displayResponse("ERROR");
			}
			
			return isInt;
		}
		
		
		
		
		
		private boolean isDouble(String input)
		{
			boolean isDouble = false;
			
			try
			{
				double validDouble = Double.parseDouble(input);
				isDouble = true;
			}
			catch(NumberFormatException error)
			{
				myPopups.displayResponse("You typed wrong.");
			}
			return isDouble;
		}
			
		private boolean isBoolean(String input)
		{
			boolean isBoolean = false;
			
			try
			{
				boolean validBoolean = Boolean.parseBoolean(input);
				isBoolean = true;
			}
			catch(NumberFormatException error)
			{
				myPopups.displayResponse("fail");
			}
			return isBoolean;
		}
		

	}



