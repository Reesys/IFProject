package model;

public class IFProperties
{
	/**
	 * Default Constructor for a IFProperties
	 * Initializes all variables
	 */

	private String name;
	private double distance;
	private boolean decision;
	private int timeHours;
	private int timeMinutes;

	public IFProperties(String name, double distance, boolean decision, int timeHours, int timeMinutes)
	{
		this.name = name;
		this.distance = distance;
		this.decision = decision;
		this.timeHours = timeHours;
		this.timeMinutes = timeMinutes;
	}

	public String getName()
	{
		return name;
	}

	public double getDistance()
	{
		return distance;
	}

	public boolean getDecision()
	{
		return decision;
	}

	public int getTimeHours()
	{
		return timeHours;
	}

	public int getTimeMinutes()
	{
		return timeMinutes;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setDistance(double distance)
	{
		this.distance = distance;
	}

	public void setDecision(boolean decision)
	{
		this.decision = decision;
	}

	public void setTimeHours(int timeHours)
	{
		this.timeHours = timeHours;
	}

	public void setTimeMinutes(int timeMinutes)
	{
		this.timeMinutes = timeMinutes;
	}
}

