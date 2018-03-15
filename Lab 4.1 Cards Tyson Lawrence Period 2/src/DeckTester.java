
public class DeckTester {

	public static void main (String[]argd)
	{   String[]ranks={"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
	    String[]suits= {"Hearts","Clubs","Spades","Diamonds"};
	    int[]values= {2,3,4,5,6,7,8,9,10,11,12,13,14};
	    
	    
		Deck test=new Deck(ranks,suits,values);
		test.Shuffle();
		int size=test.size();
		for(int x=0;x<size;x++)
		{
			System.out.print(test.deal());
		}
	}
}
