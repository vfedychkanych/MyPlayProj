package UI;

import UI.toDel.Game;

import javax.swing.*;
import java.awt.*;

public class LoadGame extends JPanel {
    private JPanel loadGame;
    private JFrame f;
    public LoadGame(JFrame f){
        this.f = f;
        loadGame = new JPanel();
        loadGame.setLayout(null);
        loadGame.setPreferredSize(new Dimension(400,400));
        JButton backLG = new JButton("Back");
        backLG.setBounds(225,220,150,135);
        loadGame.add(backLG);


        backLG.addActionListener(e -> {this.f.remove(loadGame); new Game(); this.f.pack();});

        this.f.add(loadGame);
    }
}
