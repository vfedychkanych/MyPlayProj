package UI;

import Race.Race;

import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import static java.awt.event.KeyEvent.VK_UP;

public class GamePlay extends JFrame {
    private JFrame gamePlay;
    private JPanel test;
    private Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    private String PlayerName;
    private Race PlayerRase;

    public GamePlay(String Pname, Race PRase){
        this.PlayerName = Pname;
        this.PlayerRase = PRase;
        gamePlay = new JFrame();
        gamePlay.setSize(d);
        gamePlay.setTitle("Game");
        gamePlay.setVisible(true);
        gamePlay.setResizable(false);
        gamePlay.setLocationRelativeTo(null);
        test();
        gamePlay.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                gamePlay.setVisible(false);
                new Game();
            }
        });
    }

    public void test(){
        test = new JPanel();
        test.setLayout(null);
        test.setPreferredSize(new Dimension(1680,1080));
        JButton backGP = new JButton("Back");
        backGP.setBounds(225,220,150,135);
        test.add(backGP);
        backGP.addActionListener(e -> {gamePlay.setVisible(false); new Game();});

        test.updateUI();
        gamePlay.add(test);
    }

    @Override public void paint(Graphics g){
        super.paint(g);
        Graphics2D d2 = (Graphics2D) g;
        d2.setColor(Color.BLACK);
        d2.drawRect(d.height/2,d.width/2, 200,200);
    }
}

