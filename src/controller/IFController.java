package controller;

import javax.swing.JOptionPane;

public class IFController
{

	private IFController myProperties;
	private IFController userProperties;
	private IFController loopy;

	/**
	 * Builds the instance of the Controller.
	 */

	/**public void IFProperties()
	{
		myProperties = new IFProperties();
		userProperties = new IFProperties();

	}*/

	public void start()
	{
		bigGame();
		loopy();
	}

	/**
	 * This is where the program starts calling methods to run the program.
	 * @param ooga booga
	 */

	public void bigGame()
	{

	}

	private void loopy()
	{
		//define a variable before the loop
		boolean isFinished = false;
		int someCount = 0;

		//test the code
		while (!isFinished)
		{
			IFController joshRuns = new IFController();
			//do code
			JOptionPane.showMessageDialog(null, "hola senir");

			someCount++;
			someCount += 1;

			//Update the test variable
			if (someCount > 10)
			{
				isFinished = true;
			}

			//isFinished = true;
		}

		String response = JOptionPane.showInputDialog(null, "Did you go fast?");
		while(!validDouble(response))
		{
			response = JOptionPane.showInputDialog(null, "Nuh uh.");
		}
		joshRuns.setDistance(Double.parseDouble(response));
	}

	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;

		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "You need to type in a whole number.");
		}

		return isValid;
	}

	public boolean validDouble(String mightBeDouble)
	{
		boolean isValid = false;

		try
		{
			Double.parseDouble(mightBeDouble);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "Type in a decimal value AKA a number with a . in the middle.");
		}

		return isValid;
	}
}
