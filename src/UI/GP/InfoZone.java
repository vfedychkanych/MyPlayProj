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
        d.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    d.setVisible(false);
                }

            }
        });
    }

    private void dialog(JDialog d, JList inventory){
        JPanel p = new JPanel();
        p.setPreferredSize(new Dimension(400,400));
        JScrollPane sp = new JScrollPane(inventory);
        sp.setBounds(0,0, 400,400);
        p.add(sp);

//        JButton b = new JButton("1111");
//        b.setBounds(200,300,100,200);
//        p.add(b);

        p.setVisible(true);
        d.add(p);


    }
}
