import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class Card
{
	private ManaCost manaCost;
	
	private String name, cardType, subType, effect, flavorText;
	
	private int convertedManaCost, power, toughness;

	
	//empty constructor
	public Card(){}

	public Card(ManaCost manaCost, String name, String cardType, String subType, String effect, String flavorText, int power, int toughness)
	{
		this.name = name;
		this.manaCost = manaCost;
		convertedManaCost = this.manaCost.calculateConvertedManaCost();
		this.cardType = cardType;
		this.subType = subType;
		this.effect = effect;
		this.flavorText = flavorText;
		
		if(this.cardType.toLowerCase().equals("creature"))
		{
			this.power = power;
			this.toughness = toughness;
		}
	}
	
	public Card(String fileName)
	{
		
		String wdir = System.getProperty("user.dir");
		fileName = "Cards/" + fileName;
		Path target = Paths.get(wdir,fileName);
		
		parseCardFromFile(target);
	}
	
	public void parseCardFromFile(Path target)
	{
		Scanner reader = null;
		int[] costs = new int[6];
		
		try
		{
			reader = new Scanner(target.toFile());
			
			name = reader.nextLine();
			
			for(int n=0;n<6;n++)
			{
				costs[n] = Integer.parseInt(reader.nextLine());
			}
			
			cardType = reader.nextLine();
			subType = reader.nextLine();
			effect = reader.nextLine();
			flavorText = reader.nextLine();
			power = Integer.parseInt(reader.nextLine());
			toughness = Integer.parseInt(reader.nextLine());
						
			manaCost = new ManaCost(costs);
			convertedManaCost = manaCost.calculateConvertedManaCost();
			
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
	
	public String[] toStringArray()
	{
		String[] fields = 
				{
					name,
					manaCost.toString(),
					Integer.toString(convertedManaCost),
					cardType,
					subType,
					effect,
					flavorText,
					Integer.toString(power),
					Integer.toString(toughness)
				};
		
		return fields;
	}
}