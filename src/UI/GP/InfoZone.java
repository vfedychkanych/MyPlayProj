package UI.GP;

import Items.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class InfoZone extends JDialog {
    public InfoZone(JFrame frame, List<String> inventory) {
        JDialog d = new JDialog();

        DefaultListModel dlm = new DefaultListModel();
        for (String s: inventory) dlm.addElement(s);
        JList inv = new JList<>(dlm);

        d.setSize(new Dimension(400, 400));
        d.setResizable(false);
        d.setLocationRelativeTo(null);
        dialog(d,inv);
        d.setVisible(true);
    }

    private void dialog(JDialog d, JList inventory){
        JPanel p = new JPanel();
        p.setLayout(null);
        p.setPreferredSize(new Dimension(400,400));
        JScrollPane sp = new JScrollPane(inventory);
        sp.setBounds(0,0, 400,300);
        p.add(sp);

        JButton b = new JButton("Close");
        b.setBounds(100,300,200,75);
        p.add(b);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d.dispose();
            }
        });

        p.setVisible(true);
        d.add(p);


    }
}
