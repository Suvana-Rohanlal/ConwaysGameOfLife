import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;  
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class ConwaysGame extends JFrame{
    JPanel p = new JPanel();
     ImageIcon X;
     
     private JPanel  grid; 
    static int rows;
    static int cols;
    int []arrGame;
    GridButton buttons[];
    Game g;
    public static void main(String[]args) {
        new ConwaysGame(rows,cols);
    }

    public ConwaysGame(int rows, int cols){
       super("Conway's Game of Life");
       this.rows = rows;
       this.cols = cols;
      int size = rows*cols;
      buttons = new GridButton[size];
      X=new ImageIcon(this.getClass().getResource("yellow.jpg"));

      
       setSize(500,500);
       setResizable(false);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       p.setLayout(new GridLayout(rows,cols));
  
        
        for(int i=0; i<size; i++){
            buttons[i]= new GridButton();
            p.add(buttons[i]);
        }
       
        JPanel panel = new JPanel(); // the panel is not visible in output
        JButton start = new JButton("Start");
        JButton exit = new JButton("Exit");
        panel.add(start);
        panel.add(exit);
        
        
       exit.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent arg0) {
         System.exit(0);
         }
      });
      
      
      start.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent arg0) {
            arrGame= new int[rows*cols];
            for(int i=0;i<rows*cols;i++){
               if(buttons[i].getText() != ""){
               arrGame[i] = Integer.parseInt(buttons[i].getText());
               }else{
                  arrGame[i]=0;
               }
            }
            g=new Game(arrGame,rows,cols);
            g.fillBoard();
            arrGame = g.block();
            
           int value=0;
             for(int j=0;j<rows*cols;j++){
             value = arrGame[j];
             buttons[j].setText("");
               switch(value){
            case 0:
                buttons[j].setIcon(null);
               // setText("0");
                break;
            case 1:
                buttons[j].setIcon(X);
               // setText("1");
                break;
        }

             }
            
         }
      });
    
       
        getContentPane().add(BorderLayout.SOUTH, panel);
        getContentPane().add(BorderLayout.CENTER, p);
        setVisible(true);
        
        

    }
    
   
}