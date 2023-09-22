package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Menu extends JFrame {
    private JPanel menu;
    private JFrame f;
    public Menu(){
        f = new JFrame();
        f = new JFrame("game");
        f.setSize(400, 400);
        f.setResizable(false);
        menu();
        f.setLocationRelativeTo(null);
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    private void menu(){
        menu = new JPanel();
        menu.setVisible(true);
        menu.setLayout(null);
        menu.setPreferredSize(new Dimension(400,400));
        JButton menuNG = new JButton("New Game");
        menuNG.setBounds(100,50,200,50);
        menu.add(menuNG);

        JButton menuLG = new JButton("Load Game");
        menuLG.setBounds(100,100,200,50);
        menu.add(menuLG);

        JButton menuEX = new JButton("Exit");
        menuEX.setBounds(100,150,200,50);
        menu.add(menuEX);

        menuNG.addActionListener(e ->{this.f.remove(menu); new NewGame(f); this.f.pack();});
        menuLG.addActionListener(e -> {this.f.remove(menu); new LoadGame(f); this.f.pack();});
        menuEX.addActionListener(e -> System.exit(0));

        f.add(menu);
    }

}
