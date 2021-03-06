import java.util.ArrayList;
import java.util.Random;
public class Deck {

ArrayList<Card> Undealt;
ArrayList<Card> Dealt;

public Deck(String[]ranks,String[]suits,int[]values)
{this.Undealt=new ArrayList<Card>();
 this.Dealt=new ArrayList<Card>();
 
 for (int x=0;x<ranks.length;x++)
 {
	 for (int y=0;y<suits.length;y++) {
		 Card card=new Card(ranks[x],suits[y],values[x]);
		 Undealt.add(card);
    }
	
	
 }
}

public boolean isEmpty()
{if (Undealt.size()==0)
   {return true;}
   else
   {return false;}
	
}

public int size()
{return Undealt.size();
	
}

public Card deal()
{
  if (Undealt.size()>0)
     {Card temp=new Card ("0","x",0);
      temp=Undealt.remove(0);
      Dealt.add(temp);
      return temp;
 	
 }
else
 {return null;
	
 }
	
}
public void Shuffle()
{int size=Dealt.size();
 //places cards back into Undealt ArrayList
  for(int f=size-1;f>=0;f--)
   {
      Undealt.add(Dealt.remove(f));   
   }
	//Shuffles UnDealt ArrayList
  Random a=new Random();
  for (int k=51;k>0;k--)
  {
	int random=a.nextInt(k);
	Card randomcard=Undealt.get(random);
	Card placeholder=Undealt.get(k);
	Undealt.set(random, placeholder);
	placeholder=Undealt.set(k, randomcard); 
  }
}
}
