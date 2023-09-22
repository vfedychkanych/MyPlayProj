package UI.GP;

import Player.Player;
import Race.Race;
import UI.GP.INVview.InventoryView;
import UI.Menu;
import Items.Weapon.*;
import Items.UsableItems.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GamePlay extends JFrame {
    private JFrame gamePlay;
    private JPanel InfoZone;
    private Dimension d = new Dimension(500,535);
    private Player player;

    public GamePlay(String Pname, Race PRase){
        this.player = new Player(PRase, Pname);
        generatePlayerInvetory();
        gamePlay = new JFrame();
        gamePlay.setTitle(player.getName());
        gamePlay.setLayout(null);
        gamePlay.setSize(d);
        gamePlay.setVisible(true);
        gamePlay.setResizable(false);
        gamePlay.setLocationRelativeTo(null);
        JPanel gz = new GameZone();
        gamePlay.add(gz);
        test();
        gamePlay.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                gamePlay.setVisible(false);
                new Menu();
            }
        });
        gamePlay.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_I) {
                    //new InfoZone(gamePlay, player.inventoryToStr());
                    new InventoryView(player.getInventory(), player);
                }
            }
        });
    }

    public void test(){
        InfoZone = new JPanel();
        InfoZone.setPreferredSize(new Dimension(500,500));
        InfoZone.setBounds(500,500,500,500);
        InfoZone.updateUI();
        gamePlay.add(InfoZone);
    }

    //testing method!!!
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    public void generatePlayerInvetory(){
        for (int i = 1; i < 10; i++) {

            switch (getRandomNumber(1,2)) {
                case 1 -> player.addToInventory(new Sword(getRandomNumber(1, 10)));
                case 2 -> player.addToInventory(new Axe(player.getLevel()));
                case 3 -> player.addToInventory(new Hammer(player.getLevel()));
                case 4 -> player.addToInventory(new Baculus(player.getLevel()));
            }
        }
        for (int i = 1; i < 4; i++) {
            switch (getRandomNumber(1,3)) {
                case 1 -> player.addToInventory(new HealPoison(getRandomNumber(15, 100)));
                case 2 -> player.addToInventory(new AttackPoison(getRandomNumber(1, 15)));
                case 3 -> player.addToInventory(new DefencePoison(getRandomNumber(1, 15)));
            }
        }
    }


    /*public void paint(Graphics g){
        super.paint(g);
        Graphics2D d2 = (Graphics2D) g;
        d2.setColor(Color.BLACK);
        d2.drawRect(d.height/2,d.width/2, 200,200);
    }*/
}

