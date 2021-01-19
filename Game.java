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


    /* public int[] block(){
      int pos=0;
     // Loop through every cell 
        for (int l = 1; l < rows-1 ; l++) 
        { 
            for (int m = 1; m < columns-1 ; m++) 
            { 
                // finding no Of Neighbours that are alive 
                int aliveNeighbours = 0; 
                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++){ 
                        aliveNeighbours += board[l + i][m + j]; 
                    }
                 }
                // The cell needs to be subtracted from 
                // its neighbours as it was counted before 
                aliveNeighbours -= board[l][m]; 
  
                // Implementing the Rules of Life 
  
                // Cell is lonely or overpopulated and dies 
                if (((board[l][m] == 1) && (aliveNeighbours < 2)) || ((board[l][m] == 1) && (aliveNeighbours > 3))) {
                    arr[pos] = 0;  
                 } 
                // A new cell is born 
                else if ((board[l][m] == 0) && (aliveNeighbours == 3)) {
                    arr[pos] = 1; 
                  }
  
                // Remains the same 
                else{
                    arr[pos] = board[l][m]; 
                }
               pos++;
            } 
        } 
      return arr;
   }*/