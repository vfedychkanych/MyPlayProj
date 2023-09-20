package UI.GP.INVview;

import Items.Inventory;
import Player.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class InventoryView extends JFrame{
    private List<JButton> lb = new ArrayList<>();
    private JFrame frame;
    public InventoryView(List<Inventory> inventory, Player player) {
        frame = new JFrame();
        frame.setSize(new Dimension(400, 600));
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        show(frame,inventory,player);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }

    private void show(JFrame d, List<Inventory> inventory, Player player){
        JPanel p = new JPanel();
        p.setLayout(null);
        p.setPreferredSize(new Dimension(400,400));
        InventorySlot is = new InventorySlot(inventory.get(0), player, frame);
        is.setBounds(0,0,80,80);
        p.add(is);
        p.setVisible(true);
        d.add(p);


    }
}
