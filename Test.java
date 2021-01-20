import java.util.*;
import java.math.*;

public class Test{
   public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the number of rows:");
   int rows = sc.nextInt();
   System.out.println("\nEnter the number of columns:");
   int cols = sc.nextInt();
   
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

   for(int i=0;i<4;i++){
   System.out.print("\n");
   
   Game g = new Game(arr, rows,cols);
   g.fillBoard();
   arr = g.block();
   pos=0;
   for(int j=0;j<rows;j++){
      for(int k=0;k<cols;k++){
         System.out.print(arr[pos]+" ");
         pos++;
      }
      System.out.print("\n");
   }
   }}
}  