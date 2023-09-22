package UI.GP;

import javax.swing.*;
import java.awt.*;

public class GameZone extends JPanel {
    public GameZone(){
        this.setLayout(null);
        this.setPreferredSize(new Dimension(500,500));
        this.setBounds(0,0,500,500);
        this.setVisible(true);
        this.updateUI();
    }
    public void paint(Graphics g){
        Graphics2D d2 = (Graphics2D) g;
        d2.setPaint(Color.WHITE);
        d2.setStroke(new BasicStroke(2));
        for (int i = 0; i <= 500; i += 25) {
            d2.drawLine(i,0, i,this.getHeight());
        }
        for (int i = 0; i <= 500; i += 25) {
            d2.drawLine(0,i, 500,i);
        }

        d2.setPaint(Color.BLACK);
        d2.fillOval(7,3,10,10);
    }
}
