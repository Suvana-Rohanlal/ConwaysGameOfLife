import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;  
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class homepage extends JFrame{
   JPanel p = new JPanel();
   
   public homepage(){
       super("Conway's Game of Life");
       setSize(500,500);
       setResizable(false);
       setDefaultCloseOperation(EXIT_ON_CLOSE);

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
        
        JButton send = new JButton("Create");
        
         
        p.setBackground(Color.BLUE);
        p.add(label);
        p.add(rows); // Components Added using Flow Layout
        p.add(tfR);
        p.add(columns); // Components Added using Flow Layout
        p.add(tfC);
        p.add(send);
        
        send.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent arg0) {
        int rows = Integer.parseInt(tfR.getText());
        int col = Integer.parseInt(tfC.getText());
        ConwaysGame second = new ConwaysGame(rows,col);   
        setVisible(false); // Hide current frame
        second.setVisible(true);
    }
});
        //getContentPane().add(BorderLayout.NORTH, label);
        getContentPane().add(BorderLayout.CENTER, p);
        setVisible(true);



   }
   
   public static void main(String[]args){
      new homepage();
   }

}