import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;

public class HelloWorld {
    public static void main(String[] args) {
        // Utilisation des constantes
        JFrame fenetre = new JFrame(Constantes.HELLO_WORLD_TITLE);
        fenetre.setSize(500, 500);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel(Constantes.HELLO_WORLD_TEXT, SwingConstants.CENTER);
        label.setOpaque(true);
        label.setBackground(Color.GREEN);

        fenetre.add(label);
        fenetre.setVisible(true);
    }
}
