package UI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game{
    private JPanel card;
    private JPanel menu;
    private JPanel newGame;
    private JPanel loadGame;
    private JPanel gamePlay;
    private void gamePlay(){

    }
    private void loaGame(){

    }

    private void newGame(){

    }
    private void menu(){
        menu = new JPanel();

        JButton ng = new JButton("New Game");
        menu.add(ng);
        ng.setBounds(100,50,200,50);
        JButton lg = new JButton("Load game");
        menu.add(lg);
        lg.setBounds(100,100,200,50);
        JButton exit = new JButton("Quit");
        menu.add(exit);
        exit.setBounds(100,150,200,50);

        ng.addActionListener(e -> {

        });
        lg.addActionListener(e -> loadGame.setVisible(false));
        exit.addActionListener(e -> System.exit(0));

        frames.add(menu);
    }
    public Game() {
        JFrame frame = new JFrame("Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }

}