import java.util.*;
import java.math.*;

public class Test{
   public static void main(String[]args){
   int []arr = new int[16];
   Random rand = new Random();

   for(int i=0; i<16; i++){
      arr[i] = rand.nextInt(2) % 2;
   }
   int pos =0;
   for(int j=0;j<4;j++){
      for(int k=0;k<4;k++){
         System.out.print(arr[pos]+" ");
         pos++;
      }
      System.out.print("\n");
   }

   System.out.print("\n");
   Game g = new Game(arr, 4,4);
   g.fillBoard();
   arr = g.block();
   pos=0;
   for(int j=0;j<4;j++){
      for(int k=0;k<4;k++){
         System.out.print(arr[pos]+" ");
         pos++;
      }
      System.out.print("\n");
   }
   }
}  