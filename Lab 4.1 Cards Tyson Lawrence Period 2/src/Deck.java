import java.util.ArrayList;

public class Deck {

	
private String[] ranks;
private String[]suits;
private int[]values;
ArrayList<Card> Undealt;

public Deck(String[}ranks,String[]suits,int[]values)
{for (int x=0;x<ranks.length;x++)
 {for (int y=0;y<suits.length;y++)
  {
	 Card card=new Card(ranks[x],suits[y],values[x]);
	 Undealt.add(card);
  }
	
	
 }
}
}
