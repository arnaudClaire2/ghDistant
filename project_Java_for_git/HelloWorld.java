import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.Color;
import java.awt.FlowLayout;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorld {

        public static void main(String[] args) {
                // Utilisation des constantes
                JFrame fenetre = new JFrame(Constantes.HELLO_WORLD_TITLE);
                fenetre.setSize(600, 750);
                fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Créer un panneau avec un FlowLayout pour aligner les labels horizontalement
            JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));

            // Créer le label pour le texte "Hello World"
            JLabel helloLabel = new JLabel(Constantes.HELLO_WORLD_TEXT, SwingConstants.CENTER);
            helloLabel.setOpaque(true);
            helloLabel.setBackground(Color.CYAN);
            
            // Créer le label pour la date du jour
            String dateString = new SimpleDateFormat("dd MMMM yyyy").format(new Date());
            JLabel dateLabel = new JLabel(dateString, SwingConstants.CENTER);
            dateLabel.setOpaque(true);
            dateLabel.setBackground(Color.LIGHT_GRAY);

            // Ajouter les labels au panneau
            panel.add(helloLabel);
            panel.add(dateLabel);

            // Ajouter le panneau à la fenêtre
            fenetre.add(panel);
            fenetre.setVisible(true);
        });
    }
}
