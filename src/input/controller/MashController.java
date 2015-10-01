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
			String name = myPopups.getAnswer("Type in a monster name: ");
			
			myPopups.displayResponse("Your monster's name is: " + name);
			
			int eyes;
			String tempEyes = myPopups.getAnswer("How many eyes does it have?");
			
			while(!isInteger(tempEyes))
			{
				tempEyes = myPopups.getAnswer("Type in an interger!");
			}
			
			if(isInteger(tempEyes))
			{
				eyes = Integer.parseInt(tempEyes);
			}
			else
			{
				eyes = -12345678;
			}
			
			myPopups.displayResponse("You typed in " + eyes);
			
			int mouths;
			String tempMouths = myPopups.getAnswer("How many mouths does it have?");
			
			while(!isInteger(tempMouths))
			{
				tempMouths = myPopups.getAnswer("Type it in again!");
			}
			
			if(isInteger(tempMouths))
			{
				mouths = Integer.parseInt(tempMouths);
			}
			else
			{
				mouths = -2;
			}
			
			myPopups.displayResponse("You typed in: " + eyes);
			
			myPopups.displayResponse(myMash.toString());
		}
			
			
			

	}
}


