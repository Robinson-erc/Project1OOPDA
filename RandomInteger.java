
/**
 * Generates a random number within the range and max
 *
 * @author (Eric Robinson)
 * @version (V.1 1/19/23)
 */
import java.util.Random;
public class RandomInteger
{// instance variables - replace the example below with your own
   private int min;
   private int max;
   private int range;
   
   public RandomInteger(int min, int max){
       this.min=min;
       this.max=max;
       range = max - min +1;
   }
   public int GetMin(){
       return min;
   }
   public int GetMax(){
       return max;
   }
   public void SetMin(int min){
       this.min=min;
       range = max - min +1;
   }
   public void SetMax(int max){
       this.max=max;
       range = max - min +1;
   }
   public int Generate(){
        return (int)(range * Math.random()) + min;
   }
   
}
