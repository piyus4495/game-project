package game_project;
import java.util.Scanner;
public class Game {
	
	public Weapon pressButton()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Score: ");
		int score=sc.nextInt();
		if(score<=400)
		{
			System.out.println("You got the Knife");
			Knife k=new Knife();
			return k;
		}
		else if(score<=800)
		{
			System.out.println("Press 1 to get Knife and 2 to get Gun");
			int x=sc.nextInt();
			switch(x)
			{
			case 1:
				System.out.println("You got the Knife");
				Knife k=new Knife();
				return k;
			default:
				System.out.println("You got the Gun");
				Gun g=new Gun();
				return g;
			}
		}
		else
		{
			System.out.println("Press 1 to get Knife and 2 to get Gun and any other no to get Bomb");
			int x=sc.nextInt();
			switch(x)
			{
			case 1:
				System.out.println("You got the Knife");
				Knife k=new Knife();
				return k;
			case 2:
				System.out.println("You got the Gun");
				Gun g=new Gun();
				return g;
			default: 
				System.out.println("You got the Bomb");
				Bomb b=new Bomb();
				return b;
			}
			
		}
		
	}

}









