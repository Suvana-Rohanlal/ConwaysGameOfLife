import javax.swing.JPanel;
import javax.swing.JFrame;

public class ConwaysGame extends JFrame{
    JPanel p = new JPanel();
    GridButton buttons[] = new GridButton[9];
    
    public static void main(String[]args) {
        new conway();
    }

    public ConwaysGame(){
        super("Conway's Game of Life");
        setSize(400,400);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        p.setLayout(new GridLayout(3,3));
        for(int i=0; i<9;i++){
            buttons[i]= new GridButton();
            p.add(buttons[i]);
        }
        add(p);
        setVisible();
    }
}