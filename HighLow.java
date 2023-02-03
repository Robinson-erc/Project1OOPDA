import java.util.Scanner;

/**
 * Write a description of class HighLow here.
 *
 * @author (Eric Robinson)
 * @version (a version number or a date)
 */
public class HighLow
{
    protected int m_gamesPlayed;
    private int m_sumofScores;
    private Deck deck;

    public static void main(String args[]){
        HighLow highlow =new HighLow();
        int count=0;

        highlow.PlayARound();
        //highlow.Play();
        count++;

    }

    public void Play(){
        PlayARound();
    }

    protected char PlayAgainPrompt(){
        char answer;
        Scanner in=new Scanner(System.in);
        System.out.println("Would you like to play again? Y/N");
        answer=in.next().charAt(0);
        if(answer=='Y'){
            Play();
            m_gamesPlayed++;
        }
        else{
            System.out.println(m_gamesPlayed);
            System.exit(0);
        }

        return answer;
    }

    protected int PlayARound(){
        char guess;
        deck=new Deck();
        deck.Shuffle();
        Card currentCard;
        currentCard=deck.DealACard();
        DisplayCurrentCard(currentCard); 
        guess=GuessPrompt();
        Card NextCard=deck.DealACard(); 
        if(NextCard.GetValue()==currentCard.GetValue()){
            System.out.println("The value is the same as the last card");
            System.out.println("You lose on ties!");             
            PlayAgainPrompt();
        }
        else if(NextCard.GetValue()>currentCard.GetValue()){
            if(guess=='H'){
                System.out.println("Your prediction was correct");
                Play();
            }
            else{
                System.out.println("The prediction was incorrect");
                PlayAgainPrompt();
            }
        }
        else {
            if(guess=='L'){
                System.out.println("Your prediction was correct");
                Play();
            }
            else{
                System.out.println("The prediction was incorrect");
                PlayAgainPrompt();
            }
        }
        return this.m_gamesPlayed;
    }

    protected char GuessPrompt(){
        char prompt;
        Scanner in=new Scanner(System.in);
        System.out.println("Will the next card be higher (H) or lower (L)?");
        prompt=in.next().charAt(0);
        return prompt;
    }

    protected void DisplayCurrentCard(Card card){
        System.out.println("The current card is "+card);
    }

    protected void NextCard(Card card){
        System.out.println("The next card is "+card);
    }

}