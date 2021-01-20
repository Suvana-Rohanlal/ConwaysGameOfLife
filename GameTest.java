import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class GameTest {

   /** Testing whole array with one iteration. **/
   @Test public void mainTest() {
       int []arr = new int[]{1,1,1,0,0,0,0,0,1,1,1,1,0,0,0,0};
      Game g = new Game(arr,4,4);
      g.fillBoard(); 
      int result[] = new int[]{0,1,0,0,0,0,0,1,0,1,1,0,0,1,1,0};
      Assert.assertArrayEquals(result, g.block());
   }
   
     /** Testing Rule 1: Each cell with one or no neighbour dies. **/
   @Test public void RuleOneTest() {
      int []arr = new int[]{1,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0};
      Game g = new Game(arr,4,4);
      g.fillBoard(); 
      int result[] = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
      Assert.assertArrayEquals(result, g.block());
   }
   
       /** Testing Rule 2: Each cell with four or more neighbour dies. **/
   @Test public void RuleTwoTest() {
      int []arr = new int[]{1,1,1,0,1,1,1,0,0,0,0,0,0,0,0,0};
      Game g = new Game(arr,4,4);
      g.fillBoard(); 
      int result[] = new int[]{1,0,1,0,1,0,1,0,0,1,0,0,0,0,0,0};
      Assert.assertArrayEquals(result, g.block());
   }
   
         /** Testing Rule 3: Each cell with two or three neighbours survive. **/
   @Test public void RuleThreeTest() {
      int []arr = new int[]{1,1,0,0,1,1,0,0,0,0,0,1,0,0,1,1};
      Game g = new Game(arr,4,4);
      g.fillBoard(); 
      int result[] = new int[]{1,1,0,0,1,1,1,0,0,1,0,1,0,0,1,1};
      Assert.assertArrayEquals(result, g.block());
   }
   
         /** Testing Rule 4: Each cell that is empty and has three neighbours survive. **/
   @Test public void RuleFourTest() {
      int []arr = new int[]{0,1,0,0,1,1,0,0,0,0,0,1,0,0,1,0};
      Game g = new Game(arr,4,4);
      g.fillBoard(); 
      int result[] = new int[]{1,1,0,0,1,1,1,0,0,1,1,0,0,0,0,0};
      Assert.assertArrayEquals(result, g.block());
   }
}
