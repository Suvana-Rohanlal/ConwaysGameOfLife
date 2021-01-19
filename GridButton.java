import javax.swing.JButton;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GridButton extends JButton implements ActionListener{
    ImageIcon X;
    byte value=0; 

    
    
    public GridButton(){
        X=new ImageIcon(this.getClass().getResource("yellow.jpg"));
        this.addActionListener(this);
       
    }

    public void actionPerformed(ActionEvent e){
      //  System.out.println(getX());
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