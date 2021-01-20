import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;  
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/*The homepage class creates a GUI to find the rows and columns wanted by the user*/
public class homepage extends JFrame{
   JPanel p = new JPanel();
   
   /*Basic GUI created with two textfields for the user to enter the rows and columns and a button to create the grid*/
   public homepage(){
       super("Conway's Game of Life");
       /*
       * Default settings for the frame. Size of frame set to 500 X 500 without a resizable option
       */
       setSize(500,500);
       setResizable(false);
       setDefaultCloseOperation(EXIT_ON_CLOSE);

      /*
       *Labels created for a welcome message, rows and columns
       *
       *The labels are set to white with Serif font
       *
       *Textfield created to accept a value for rows and columns
       */
        JLabel label = new JLabel("Welcome to Conway's Game of Life",JLabel.CENTER);
        label.setForeground(Color.white);
        label.setFont(new Font("Serif", Font.PLAIN, 34));
        
        JLabel rows = new JLabel("Rows",JLabel.CENTER);
        JTextField tfR = new JTextField(10); // accepts upto 10 characters
        rows.setForeground(Color.white);
        rows.setFont(new Font("Serif", Font.PLAIN, 20));
       

        JLabel columns = new JLabel("Columns");
        JTextField tfC = new JTextField(10); // accepts upto 10 characters
        columns.setForeground(Color.white);
        columns.setFont(new Font("Serif", Font.PLAIN, 20));
        
        /*Button to create the grid*/
        JButton send = new JButton("Create");
        
        /*Components create above added to the panel*/ 
        p.setBackground(Color.BLUE);
        p.add(label);
        p.add(rows); // Components Added using Flow Layout
        p.add(tfR);
        p.add(columns); // Components Added using Flow Layout
        p.add(tfC);
        p.add(send);
        
        /*Event listener added to the create button to pass through the rows and columns, kill the current frame
         * and display the next frame
         */
        send.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            int rows = Integer.parseInt(tfR.getText());
            int col = Integer.parseInt(tfC.getText());
            ConwaysGame second = new ConwaysGame(rows,col);   
            setVisible(false); // Hide current frame
            second.setVisible(true);
         }
        });
       
        getContentPane().add(BorderLayout.CENTER, p);
        setVisible(true);



   }
   /*Main method to run the GUI*/
   public static void main(String[]args){
      new homepage();
   }

}