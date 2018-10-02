package controller;

import javax.swing.JOptionPane;

import model.IFProperties;

public class IFController
{

	private IFProperties userProperties;
	//private IFController loopy;

	/**
	 * Builds the instance of the Controller.
	 */

	public IFController()
	{
		userProperties = new IFProperties();
	}

	public void start()
	{
		bigGame();
		loopy();
		loops();
	}

	/**
	 * This is where the program starts calling methods to run the program.
	 * @param ooga booga
	 */

	public void bigGame()
	{
		JOptionPane.showMessageDialog(null, userProperties);

		System.out.println(userProperties);

		String userInput = JOptionPane.showInputDialog("How many hours did you run?");
		int timeHours = -99;
		if(validInt(userInput))
		{
			timeHours = Integer.parseInt(userInput);
		}
		JOptionPane.showMessageDialog(null, "You said you ran " + timeHours);

		userInput = JOptionPane.showInputDialog("How many minutes did you run?");
		int timeMinutes = -99;
		if(validInt(userInput))
		{
			timeMinutes = Integer.parseInt(userInput);
		}
		JOptionPane.showMessageDialog(null, "You said you ran " + timeMinutes);

		userInput = JOptionPane.showInputDialog("How far did you run?");
		int distance = -99;
		if(validInt(userInput))
		{
			distance = Integer.parseInt(userInput);
		}
		JOptionPane.showMessageDialog(null, "You far did you run " + distance);
	}

	private void loopy()
	{
		//define a variable before the loop
		/*boolean isFinished = false;
		int someCount = 0;

		//test the code
		while (!isFinished)
		{
			IFController joshRuns = new IFController();
			//do code
			JOptionPane.showMessageDialog(null, "dgggd");

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
			response = JOptionPane.showInputDialog(null, "o-o");
		}
		//joshRuns.setDistance(Double.parseDouble(response));

		for (int index = 0; index < 10; index++)
		{
			JOptionPane.showMessageDialog(null, "This is execution number " + index);
		}
		JOptionPane.showMessageDialog(null, "This is execution number " + response);*/
	}


	/**********************
	 * This "loops()" method is a for loop
	 * that is going to count down from any
	 * integer by minus 1 from that number.
	 * Until it has counted by 10 and closes.
	 **********************/
	private void loops()
	{
		String numOne = JOptionPane.showInputDialog(null, "Enter in a number: ");
		int num = Integer.parseInt(numOne);

		for(int newNum = Integer.valueOf(numOne); newNum > num-10; newNum-=1)
		{
			JOptionPane.showMessageDialog(null, "Counting backwards " + newNum);
		}
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
