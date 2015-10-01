//DDDDDOOONNNNEEE
package input.model;

public class Mash 
{
	private String monstername;
	private int eyes;
	private int mouths;
	private double legs;
	private double hair;
	private boolean isMale;
	
	public Mash()
	{
		monstername = "";
		eyes = 2;
		mouths = 1;
		legs = 2.0;
		hair = 50.0;
		isMale = true;
	}
	
	public Mash(String monstername, int eyes, int mouths, double legs, double hair, boolean isMale)
	{
		this.monstername = monstername;
		this.eyes = eyes;
		this.mouths = mouths;
		this.legs = legs;
		this.hair = hair;
		this.isMale = isMale;
	}
	
	
	
	
	
	
	
	public String getMonstername()
	{
		return monstername;
	}
	
	public int getEyes()
	{
		return eyes;
	}
	
	public int getMouths()
	{
		return mouths;
	}
	
	public double getLegs()
	{
		return legs;
	}
	
	public double getHair()
	{
		return hair;
	}
	
	public boolean getIsMale()
	{
		return isMale;
	}
	
	public String toString()
	{
		String thingInfo = monstername + " has " + eyes + " eyes, " + mouths + " mouths, " 
				+ legs + " legs, " + hair + " strands of hair, " + "and " + isMale + " male.";
		
		return thingInfo;
	}
}

//pretty much done now :)
