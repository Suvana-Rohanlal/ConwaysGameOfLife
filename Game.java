public class Game{
   int[] arr;
   int [][] board; 
   int rows; 
   int columns;
   
   public Game(int[]arr, int rows, int columns){
      this.arr = arr;
      this.rows = rows;
      this.columns = columns;
      board = new int[rows][columns];
   }
   
   public void fillBoard(){
      int k=0;
      for(int i=0; i<rows; i++){
         for(int j=0; j<columns; j++){
            board[i][j] = arr[k];
            k++; 
         }
      }
   }
   
   public int[] block(){
      int pos =0;
      int neighbours=0;
      for(int i=0; i<rows; i++){
         for(int j=0; j<columns; j++){
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
            else{
               neighbours = board[i][j-1] + board[i][j+1] + board[i-1][j+1] + board[i-1][j-1]+ board[i-1][j]+board[i+1][j]+board[i+1][j+1]+board[i+1][j-1];
            }
         
         
            //changing cells accordingly
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


   