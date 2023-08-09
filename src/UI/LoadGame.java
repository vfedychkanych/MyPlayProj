package UI;

import javax.swing.*;
import java.awt.*;

public class LoadGame extends JPanel {
    private JPanel loadGame;
    private JFrame f;
    private void loadGame(JFrame f){
        this.f = f;
        loadGame = new JPanel();
        loadGame.setLayout(null);
        loadGame.setPreferredSize(new Dimension(400,400));
        JButton back = new JButton("Back");
        back.setBounds(225,220,150,135);
        loadGame.add(back);


        back.addActionListener(e -> {this.f.remove(loadGame); new Game(); this.f.pack();});

        this.f.add(loadGame);
    }
}
