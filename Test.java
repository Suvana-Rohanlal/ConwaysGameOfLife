import java.util.*;
import java.math.*;

/*Test class to run the game on the command line
 *
 *The user will be prompted to enter the rows and columns 
 *
 *The board is then randomly generated and the game is played with 3 iterations
 */
public class Test{
   /*
    *Main method to run the game
    */
   public static void main(String[]args){
   
   /*User inputs extracted and stored in variables*/
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the number of rows:");
   int rows = sc.nextInt();
   System.out.println("\nEnter the number of columns:");
   int cols = sc.nextInt();
   
   /*Values randomly assigned to the array*/
   int []arr = new int[rows*cols];
   Random rand = new Random();

   for(int i=0; i<rows*cols; i++){
      arr[i] = rand.nextInt(2) % 2;
   }
   int pos =0;
   for(int j=0;j<rows;j++){
      for(int k=0;k<cols;k++){
         System.out.print(arr[pos]+" ");
         pos++;
      }
      System.out.print("\n");
   }

   /*Game iterated for 4 rounds*/
   for(int i=0;i<4;i++){
   System.out.print("\n");
   
   Game g = new Game(arr, rows,cols);
   g.fillBoard();
   arr = g.block();
   pos=0;
   /*Each iteration displayed*/
   for(int j=0;j<rows;j++){
      for(int k=0;k<cols;k++){
         System.out.print(arr[pos]+" ");
         pos++;
      }
      System.out.print("\n");
   }
   }}
}  