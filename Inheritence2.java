import java.util.Scanner;//Inherit the classes  Cricket _Player, Football _Player and Hockey_ Player from Player class
class Player
{
	void cricketer()
	{
		System.out.println("M.S. Dhoni");
	}
	void footballer()
	{
		System.out.println("Sunil Chetri");
	}
	void hockey()
	{
		System.out.println("Sardaar Ji");
	}
}

class Cricket_Player extends Player
{
	void details()
	{System.out.println("Team India");}
}
class Football_Player extends Player
{
	void details()
	{System.out.println("Team India");}
} 

class Hockey_Player extends Player
{
	void details()
	{System.out.println("Team India");}
}

public class Inheritence2
{
	public static void main(String [] args)
	{
		Cricket_Player c = new Cricket_Player();
        	Football_Player f = new Football_Player();
        	Hockey_Player h = new Hockey_Player();
		c.cricketer();
		c.details();
		f.footballer();
		f.details();
		h.hockey();
		h.details();
	}
}
