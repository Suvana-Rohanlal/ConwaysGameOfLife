import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;  
import javax.swing.*;

public class ConwaysGame extends JFrame{
    JPanel p = new JPanel();
    GridButton buttons[] = new GridButton[16];
    
    public static void main(String[]args) {
        new ConwaysGame();
    }

    public ConwaysGame(){
        super("Conway's Game of Life");
        setSize(800,800);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        p.setLayout(new GridLayout(4,4));
        
        for(int i=0; i<16;i++){
            buttons[i]= new GridButton();
            p.add(buttons[i]);
        }
        add(p);
        setVisible(true);
    }
}