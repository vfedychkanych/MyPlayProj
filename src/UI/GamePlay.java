package UI;

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
    public int Cx;
    public int Cy;
    public int Cw;
    public int Ch;

    public GamePlay(){
        gamePlay.setSize(1680,1080);
        gamePlay.setTitle("Game");
        gamePlay.setVisible(true);
        gamePlay.setResizable(false);
        gamePlay.setLocationRelativeTo(null);
        gamePlay.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                new Game();
            }
        });
    }

    public void test(){
        test = new JPanel();
        test.setLayout(null);
        test.setPreferredSize(new Dimension(400,400));
        JButton back = new JButton("Back");
        back.setBounds(225,220,150,135);
        test.add(back);
        back.addActionListener(e -> {this.setVisible(false); new Game();});

        test.add(new Circle());
        test.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()){
                    case VK_UP:

                }
            }
        });
    }
}

class Circle extends GamePlay{
    public void paint(Graphics g){g.drawOval(Cx,Cy,Cw,Ch);}
}
