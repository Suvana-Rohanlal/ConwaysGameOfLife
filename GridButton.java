import javax.swing.JButton;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GridButton extends JButton implements ActionListener{
    ImageIcon X;
    byte value=0;

    public GridButton(){
        X=new ImageIcon(this.getClass().getResource("yellow.png"));
        this.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        value++;
        value%=2;
        switch(value){
            case 0:
                setIcon(null);
                break;
            case 1:
                setIcon(X);
                break;
        }
    }
}