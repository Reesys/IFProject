package controller;

import model.IFProperties;

public class IFController
{

	private IFController myProperties;
	private IFController userProperties;

	/**
	 * Builds the instance of the Controller.
	 */

	public void IFProperties()
	{
		myProperties = new IFProperties();
		userProperties = new IFProperties();

	}

	public void start()
	{
		bigGame();
	}

	/**
	 * This is where the program starts calling methods to run the program.
	 */

	public void bigGame()
	{

	}
}
