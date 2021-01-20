import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/*
 * The GridButton class is used to create the buttons that will be displayed on the GUI
 *
 * It uses the JButton class to create the buttons and ActionListener to add functionality to the button
 *
 */
public class GridButton extends JButton implements ActionListener{
    ImageIcon X;
    byte value=0; 

   /*Constructor used to initialise the variables*/
    public GridButton(){
        X=new ImageIcon(this.getClass().getResource("yellow.jpg"));
        this.addActionListener(this);
       
    }

   /*
    * Event added tto each button
    *
    * The button changes between a yellow block and the normal colour when pressed.
    *
    * A text is set to be able to identify which button was pressed.
    */
    public void actionPerformed(ActionEvent e){
        value++;
        value%=2;
        
        switch(value){
            case 0:
                setIcon(null);
                setText("0");
                break;
            case 1:
                setIcon(X);
                setText("1");
                break;
        }        
       
    }
}