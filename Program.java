import javax.swing.*;
import java.awt.*;

public class Program extends JFrame {
    private Image grassTexture;

    public Program(){
        grassTexture = new ImageIcon("grass.jpg").getImage();
        //this.setLayout(null);
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        for (int x = 0; x < 800; x += 50) {
            for (int y = 0; y < 600; y += 50) {
                this.getGraphics().drawImage(grassTexture, x, y, null);
            }
        }
    }

    public static void main(String[] args) {
        new Program();
    }
}
