package UI.GP.INVview;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ItemStats extends JScrollPane {
    private java.util.List<String> ItemSett;
    public ItemStats(String ItemSett){
        this.setPreferredSize(new Dimension(400,200));
         //= Arrays.asList(ItemSett.split(","));
        this.ItemSett = Arrays.asList(ItemSett.split("\\s*,\\s*"));
        DefaultListModel d = new DefaultListModel();
        for (String s: this.ItemSett) {d.addElement(s);}
        JList l = new JList(d);
        this.add(l);

    }
}
