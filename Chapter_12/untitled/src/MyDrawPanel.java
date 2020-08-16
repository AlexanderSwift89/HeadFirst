import java.awt.*;
import javax.swing.*;

public class MyDrawPanel extends JPanel {
    public static void main(String[] args) {
        JFrame frame;
        frame = new JFrame();

        MyDrawPanel panel1 = new MyDrawPanel();
        frame.setVisible(true);
    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.orange);
        g.fillRect(20, 50, 100, 100);
    }
}


