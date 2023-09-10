package UI;

import Race.*;
import UI.GP.GamePlay;

import javax.swing.*;
import java.awt.*;

public class NewGame extends JPanel {
    private final JPanel newGame;
    private Race chosenRace;
    private String playerName;
    private final JFrame f;
    private final JTextArea raceName;
    private final JTextArea weaponRace;
    private final JTextArea RaceWeapBonus;
    private final JTextArea hp;
    private final JTextArea hpForLv;
    private final JTextArea Atk;
    private final JTextArea AtkForLv;
    private final JTextArea Def;
    private final JTextArea DefForLv;
    private final JButton startGame;
    public NewGame(JFrame f) {
        this.f = f;
        newGame = new JPanel();
        newGame.setLayout(null);
        newGame.setPreferredSize(new Dimension(400,400));
        JTextField name = new JTextField("name",10);

        name.setBounds(25,25, 350, 30);
        newGame.add(name);

        JButton elf = new JButton("Elf");
        elf.setBounds(25,55, 87, 30);

        JButton gnome = new JButton("gnome");
        gnome.setBounds(112,55, 87, 30);

        JButton human = new JButton("human");
        human.setBounds(199,55, 87, 30);

        JButton ork = new JButton("ork");
        ork.setBounds(286,55, 87, 30);

        startGame = new JButton("Start");
        startGame.setBounds(225,100,150,135);
        startGame.setVisible(false);

        JButton backNG = new JButton("Back");
        backNG.setBounds(225,220,150,135);

        newGame.add(elf);
        newGame.add(gnome);
        newGame.add(human);
        newGame.add(ork);
        newGame.add(startGame);
        newGame.add(backNG);

        raceName = new JTextArea();
        weaponRace = new JTextArea();
        RaceWeapBonus = new JTextArea();
        hp = new JTextArea();
        hpForLv = new JTextArea();
        Atk = new JTextArea();
        AtkForLv = new JTextArea();
        Def = new JTextArea();
        DefForLv = new JTextArea();

        elf.addActionListener(e -> {
            this.chosenRace = new Elf();
            raseSett(this.chosenRace);
        });
        gnome.addActionListener(e -> {
            this.chosenRace = new Gnome();
            raseSett(this.chosenRace);
        });
        human.addActionListener(e -> {
            this.chosenRace = new Human();
            raseSett(this.chosenRace);
        });
        ork.addActionListener(e -> {
            this.chosenRace = new Orc();
            raseSett(this.chosenRace);
        });
        startGame.addActionListener(e -> {
            if (name.getText().isEmpty())
                JOptionPane.showMessageDialog(this.f.getContentPane(), "Please enter your name");
            else {
                this.playerName = name.getText();
                f.setVisible(false);
                new GamePlay(playerName, chosenRace);
            }
        });
        backNG.addActionListener(e -> {this.f.remove(newGame); new Menu(); this.f.pack();});

        this.f.add(newGame);
    }

    private void raseSett(Race rase){
        startGame.setVisible(true);
        raceName.selectAll();
        raceName.replaceSelection("");
        raceName.append("Race " + chosenRace.getRaceName());
        raceName.setBounds(25, 100, 200,30);
        newGame.add(raceName);

        weaponRace.selectAll();
        weaponRace.replaceSelection("");
        weaponRace.append("Master weapon " + chosenRace.getWeaponForRace());
        weaponRace.setBounds(25, 130, 200,30);
        newGame.add(weaponRace);

        RaceWeapBonus.selectAll();
        RaceWeapBonus.replaceSelection("");
        RaceWeapBonus.append("Weapon bonus " + chosenRace.getCofForRace());
        RaceWeapBonus.setBounds(25, 160, 200,30);
        newGame.add(RaceWeapBonus);

        hp.selectAll();
        hp.replaceSelection("");
        hp.append("hp " + chosenRace.getHp());
        hp.setBounds(25, 190, 200,30);
        newGame.add(hp);

        hpForLv.selectAll();
        hpForLv.replaceSelection("");
        hpForLv.append("ho cof(lv) " + chosenRace.getHpForLvl());
        hpForLv.setBounds(25, 220, 200,30);
        newGame.add(hpForLv);

        Atk.selectAll();
        Atk.replaceSelection("");
        Atk.append("attack " + chosenRace.getAttack());
        Atk.setBounds(25, 250, 200,30);
        newGame.add(Atk);

        AtkForLv.selectAll();
        AtkForLv.replaceSelection("");
        AtkForLv.append("attack cof(lv) " + chosenRace.getAttForLvl());
        AtkForLv.setBounds(25, 280, 200,30);
        newGame.add(AtkForLv);

        Def.selectAll();
        Def.replaceSelection("");
        Def.append("def " + chosenRace.getDefense());
        Def.setBounds(25, 310, 200,30);
        newGame.add(Def);

        DefForLv.selectAll();
        DefForLv.replaceSelection("");
        DefForLv.append("def cof(lv) " + chosenRace.getDefForLvl());
        DefForLv.setBounds(25, 340, 200,30);
        newGame.add(DefForLv);
        newGame.updateUI();
    }
}
