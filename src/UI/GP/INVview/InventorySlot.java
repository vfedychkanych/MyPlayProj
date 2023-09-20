package UI.GP.INVview;

import Items.Inventory;
import Items.Weapon.Sword;
import Player.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InventorySlot extends JLabel {
    private String currentIcon = "src/UI/GP/INVview/Icon/";
    private Inventory item;
    private ItemStats itemStats;

    public InventorySlot(Inventory item, Player player, JFrame parent) {
        this.item = item;
        findIcon();
        itemStats = new ItemStats(this.item.toString());
        this.setBackground(Color.BLUE);
        this.setIcon(new ImageIcon(currentIcon));

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                itemStats.setBounds(0,400,400,200);
                itemStats.setVisible(true);
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {
                itemStats.setVisible(false);
            }
        });
    }

    private void findIcon(){
        if (item instanceof Sword) {
            currentIcon += "Sword.png";
        }
    }


}
