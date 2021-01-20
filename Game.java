/*
 *The Game class is used to process and implement all the rules of the game
 *
 *The constructor accepts the array, rows and columns as parameters.
 *
 *The fillBoard method converts the 1D array into a 2D array
 *
 *The block method implements the rules and returns the results in a 1D array
 */
 
public class Game{
   int[] arr;
   int [][] board; 
   int rows; 
   int columns;
   
   /* The constructor initialising the variables with the parameters received*/
   public Game(int[]arr, int rows, int columns){
      this.arr = arr;
      this.rows = rows;
      this.columns = columns;
      board = new int[rows][columns];
   }
   
   /*Method used to convert the 1D array into a 2D array*/
   public void fillBoard(){
      int k=0;
      for(int i=0; i<rows; i++){
         for(int j=0; j<columns; j++){
            board[i][j] = arr[k];
            k++; 
         }
      }
   }
   
   /*Method implementing the rules*/
   public int[] block(){
      int pos =0;
      int neighbours=0;
      
      /*Number of neighbours are found using if statements*/
      for(int i=0; i<rows; i++){
         for(int j=0; j<columns; j++){
            /*Edge cases are first checked*/
            if(i==0){
               if(j==0){
                  neighbours = board[i+1][j+1] + board[i][j+1] + board[i+1][j];
               }
               else if(j==columns-1){
                  neighbours = board[i+1][j] + board[i+1][j-1] + board[i][j-1];
               }
               else{
                  neighbours = board[i][j-1] + board[i][j+1] + board[i+1][j-1] + board[i+1][j] +board[i+1][j+1];
               }
            }
            else if(j==0){
               if(i==rows-1){
                  neighbours = board[i-1][j] + board[i-1][j+1] + board[i][j+1];
               }
               else{
                  neighbours = board[i-1][j] + board[i-1][j+1] + board[i][j+1] + board[i+1][j+1]+ board[i+1][j];
               }
            }
            else if(i==rows-1){
               if(j==columns-1){
                  neighbours = board[i-1][j] + board[i-1][j-1] + board[i][j-1];
               }
               else{
                  neighbours = board[i][j-1] + board[i][j+1] + board[i-1][j+1] + board[i-1][j-1]+ board[i-1][j];
               }
            }
            else if(j==columns-1){
               neighbours = board[i-1][j] + board[i+1][j] + board[i-1][j-1] + board[i+1][j-1] +board[i][j-1];  
            }
            /*The middle is then checked*/
            else{
               neighbours = board[i][j-1] + board[i][j+1] + board[i-1][j+1] + board[i-1][j-1]+ board[i-1][j]+board[i+1][j]+board[i+1][j+1]+board[i+1][j-1];
            }
         
         
            /*changing cells according to the neighbours found above*/
            if(board[i][j]==1 && neighbours < 2){
               arr[pos] =0;
            }
            else if(board[i][j]==1 && neighbours >3){
               arr[pos] =0;
            }
            else if(board[i][j]==0 && neighbours==3 ){
               arr[pos] =1;
            }
            else{
               arr[pos] = board[i][j];
            }
            
            pos++;
         }
      }
      
      
      return arr;
   }
   
  
}


   