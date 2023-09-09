package UI.toDel;

import javax.swing.*;
import java.awt.*;

public class Menu extends JPanel {
    private JPanel menu;
    private JFrame f;
    public Menu(JFrame frame){
        this.f = frame;
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

    public JPanel getMenu() {
        return menu;
    }
}
