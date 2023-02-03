
/**
 * Write a description of class Deck here.
 *
 * @author (Eric Robinson)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
 
public class Deck
{
   public static final int NCARDS = 52;
    //private Card[] NewDeck = new Card[NCARDS];
    //private ArrayList <Card> NewDeck = new ArrayList <Card>(); 
    private List<Card>   deck;
    private int cardsUsed = 0;
    private final int SHUFFLENUM=1000;
    private RandomInteger   r1; 
    private RandomInteger   r2;
    
    public Deck(){
        r1=new RandomInteger(0,NCARDS-1);
        r2=new RandomInteger(0,NCARDS-1);
       deck = new ArrayList<>();

       for (int value =1; value <=13; value++){
           for(int s=0; s<4;s++){
               deck.add(new Card(value, Card.Suit.values()[s]));
           }
       }
    }
    public int CardsLeft(){
        return NCARDS - cardsUsed;
    }
    public Card DealACard(){
        cardsUsed++;
        return deck.get((cardsUsed-1)); 
    }
   // private void initDeck() {
        // int index = 0;
            // for (int i = 0; i < 4; i++) {
                // for (int j = 0; j < 13; j++) {
                    // //System.out.println("index: " + index  + "I: " + i + "J: " + j );
                    // switch (i) {
                        // case 0:
                            // NewDeck.add(Card) = new Card(j, Card.Suit.SPADES);
                            // break;
                        // case 1:
                            // NewDeck.add(Card) = new Card(j, Card.Suit.HEARTS);
                            // break;
                        // case 2:
                            // NewDeck.add(Card) = new Card(j, Card.Suit.DIAMONDS);
                            // break;
                        // case 3:
                            // NewDeck.add(Card) = new Card(j, Card.Suit.CLUBS);
                            // break;
                    // } //end of switch statement
                    // index++;
                // } //end of j loop
            // } // end of i loop
    // }
    public void Shuffle(){
        for(int i= deck.size()-1; i >0;  i--){
            int rand = (int) (Math.random()*(i+1));
            Card temp = deck.get(i);
            Collections.shuffle(deck);
        } 
        cardsUsed=0;
    }
}