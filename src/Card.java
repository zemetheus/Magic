<<<<<<< HEAD
import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class Card
{
	private ManaCost manaCost;
	
	String name, cardType, subType, effect, flavorText;
	
	int power, toughness;

	
	//empty constructor
	public Card(){}

	public Card(Path target)
	{
		parseCardFromFile(target);
	}
	
	public void parseCardFromFile(Path target)
	{
		Scanner reader = null;
		
		//line counter
		int n = 0; 
		int[] costs = new int[6];
		try
		{
			reader = new Scanner(target.toFile());
			
			while(reader.hasNextLine())
			{
				switch(n)
				{
				case 0:
				{
					name = reader.nextLine();
					break;
				}
				case 1: case 2: case 3: case 4: case 5: case 6:
				{
					costs[n-1] = Integer.parseInt(reader.nextLine());
					break;
				}
				case 7:
				{
					cardType = reader.nextLine();
					break;
				}
				case 8:
				{
					subType = reader.nextLine();
					break;
				}
				case 9:
				{
					effect = reader.nextLine();
					break;
				}
				case 10:
				{
					flavorText = reader.nextLine();
					break;
				}
				}
			}
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println("That Card doesn't exist in the library.");
		}
		finally
		{
			reader.close();
		}
	}
}
=======
import java.util.HashMap;

public class Card {
	
	private String name, cardType;
	private int power, toughness;
	
	private ManaCost manaCost;
	
	//manaCost = new ManaCost({G, R, U, B, W, C});
	
	
	
	
	
	
	
	
}
>>>>>>> 8e440063e2924be59ea2c1d397be9a05f635e957
