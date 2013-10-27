package tema.java.pkg3;
import javax.swing.JFrame;

public class Points extends JFrame {

    public Points() {

        initUI();
    }

    private void initUI() {
        
        setTitle("Points");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new Surface());

        setSize(350, 250);
        setLocationRelativeTo(null);
    }
}