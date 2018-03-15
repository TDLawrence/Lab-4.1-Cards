
public class Card {

	private String rank;
	private String suit;
	private int value;
	
	public String getRank() {
		return rank;
	}

	public String getSuit() {
		return suit;
	}

	public int getValue() {
		return value;
	}

	public Card(String rank, String suit,int value)
	{this.rank=rank;
	 this.suit=suit;
	 this.value=value;
	 
		
	}
	
	public boolean equals(Card othercard)
	{   int z=this.getValue();
		int x=othercard.getValue();
		if(z==x)
		{return true;}
		else
		{return false;}
	 
		
	}
	
	public String toString()
	{   System.out.println();
		return "This is a "+this.getRank()+ "  of " + this.getSuit()+". Its value is  "+this.getValue();
	 
		
	}
	
	
	
	
	
	
	
}
