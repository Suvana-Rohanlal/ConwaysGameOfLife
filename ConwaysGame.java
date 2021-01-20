import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;  
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
/*
 * The ConwaysGame class is used to create the game frame.
 *
 * The contructor accepts the rows and columns as parameters and creates the grid of buttons. 
 *
 * The class makes use of swing components to generate a frame and panels.
 */

public class ConwaysGame extends JFrame{
    /*
     * Panel p contains the grid of buttons.
     * X is an object of ImageIcon used to add the Yellow block when a cell on the grid is clicked.
     * rows and cols are variables used to store the rows and columns that is passed through the contructor.
     * buttons[] is an array containing objects of the GridButton class.
     * g is an object of the Game class.
     * 
     */
    
    JPanel p = new JPanel();
    ImageIcon X;
    static int rows;
    static int cols;
    int []arrGame;
    GridButton buttons[];
    Game g;
    
    /*
     * Main method used to call the contructor and run the GUI
     */
    public static void main(String[]args) {
        new ConwaysGame(rows,cols);
    }

   /*
    * Constructor used to create the GUI, add functionality to the Buttons and run the game.
    * 
    */
    public ConwaysGame(int rows, int cols){
       super("Conway's Game of Life");
       this.rows = rows;
       this.cols = cols;
       int size = rows*cols;                  //Size of array
       buttons = new GridButton[size];       
       X=new ImageIcon(this.getClass().getResource("yellow.jpg")); //adding the image url to X

      /*
       * Default settings for the frame. Size of frame set to 500 X 500 without a resizable option
       */
       setSize(500,500);
       setResizable(false);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       p.setLayout(new GridLayout(rows,cols)); //Panel of buttons set as a grid with user requested rows and columns
  
        /*
         * A loop used to create a GridButton object and add it to the GridButton array
         *
         * The button object is then added to the panel
         */
        for(int i=0; i<size; i++){
            buttons[i]= new GridButton();
            p.add(buttons[i]);
        }
       
        /*
         * Second panel created to include the start and exit buttons
         *
         * The start button extracts the value of each button and stores it in an array. 
         *
         * The exit button closes the game and ends the program.
         */
        JPanel panel = new JPanel(); 
        JButton start = new JButton("Start");
        JButton next = new JButton("Next");
        JButton exit = new JButton("Exit");
        panel.add(start);
        panel.add(next);
        panel.add(exit);
        
        next.setVisible(false);
        
        
       /*Event listener for the exit button*/ 
       exit.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            System.exit(0);
         }
       });
      
      /*Event listerner for the start button*/
      start.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            arrGame= new int[rows*cols];
            /*Loop storing the values from the buttons into an array*/
            for(int i=0;i<rows*cols;i++){
               if(buttons[i].getText() != ""){
                  arrGame[i] = Integer.parseInt(buttons[i].getText());
               }
               else{
                  arrGame[i]=0;
               }
            }
         
            /*A new Game object is created and the output is stored back into the array.*/
            // for(int k=0; k<3;k++){
            g=new Game(arrGame,rows,cols);
            g.fillBoard();
            arrGame = g.block();
            
            /*The results are displayed back to the GUI grid*/
            int value=0;
            for(int j=0;j<rows*cols;j++){
               value = arrGame[j];
               buttons[j].setText("");
               switch(value){
                  case 0:
                     buttons[j].setIcon(null);
                     break;
                  case 1:
                     buttons[j].setIcon(X);
                     break;
               }

            // }            
               }
               
               next.setVisible(true);
            }
         });
    

       /*Event listener for the next button*/ 
       next.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
           /*A new Game object is created and the output is stored back into the array.*/
            // for(int k=0; k<3;k++){
            g=new Game(arrGame,rows,cols);
            g.fillBoard();
            arrGame = g.block();
            
            /*The results are displayed back to the GUI grid*/
            int value=0;
            for(int j=0;j<rows*cols;j++){
               value = arrGame[j];
               buttons[j].setText("");
               switch(value){
                  case 0:
                     buttons[j].setIcon(null);
                     break;
                  case 1:
                     buttons[j].setIcon(X);
                     break;
               }

            // }            
               }
            
         }
       });
        
        getContentPane().add(BorderLayout.SOUTH, panel);
        getContentPane().add(BorderLayout.CENTER, p);
        setVisible(true);
        
        

    }
    
   
}