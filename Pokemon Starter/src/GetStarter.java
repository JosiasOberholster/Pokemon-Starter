import java.io.*;

public class GetStarter 
{
	public static void main(String[] args)
	{		
		new GetStarter().whichPokemon();
	}
	
	public void whichPokemon()
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String choice = null;
		
		System.out.println("Choose your Started Pokemon:");
		System.out.println("Bulbasaur, Charmander or Squirtle");
		
		try
		{
			choice = reader.readLine();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		//Chosen Bulbasaur
		if(choice.equalsIgnoreCase("Bulbasaur"))
		{
			System.out.println("");
			System.out.println("Are you sure?");
			
			try
			{
				choice = reader.readLine();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			
			if(choice.equalsIgnoreCase("Yes"))
			{
				System.out.println("Congrads, You own a Bulbasaur");
			}
			
			else if(choice.equalsIgnoreCase("No"))
			{
				System.out.println("");
				whichPokemon();
			}
			else
			{
				System.out.println("Invalid choice");
				System.out.println("");
				whichPokemon();
			}
		}
		
		//Chosen Charmander
		else if(choice.equalsIgnoreCase("Charmander"))
		{
			System.out.println("");
			System.out.println("Are you sure?");
			
			try
			{
				choice = reader.readLine();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			
			if(choice.equalsIgnoreCase("Yes"))
			{
				System.out.println("Congrads, You own a Charmander");
			}
			
			else if(choice.equalsIgnoreCase("No"))
			{
				System.out.println("");
				whichPokemon();
			}
			else
			{
				System.out.println("Invalid choice");
				System.out.println("");
				whichPokemon();
			}
		}
		
		//Chosen Squirtle
		else if(choice.equalsIgnoreCase("Squirtle"))
		{
			System.out.println("");
			System.out.println("Are you sure?");
						
			try
			{
				choice = reader.readLine();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
						
			if(choice.equalsIgnoreCase("Yes"))
			{
				System.out.println("Congrads, You own a Squirtle");
			}
						
			else if(choice.equalsIgnoreCase("No"))
			{
				System.out.println("");
				whichPokemon();
			}
			else
			{
				System.out.println("Invalid choice");
				System.out.println("");
				whichPokemon();
			}
		}
		else
		{
			System.out.println("Invalid choice");
			System.out.println("");
			whichPokemon();
		}
	}
}