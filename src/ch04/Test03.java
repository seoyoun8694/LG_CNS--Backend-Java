package ch04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URI;

public class Test03 extends JFrame {
    public Test03() {
        setSize(300, 200);
        setLayout(new GridLayout(1, 2));

        String[][] sites = {
                {"Bloter", "https://www.bloter.net"},
                {"ZDNet", "https://zdnet.co.kr"}
        };

        for (String[] site : sites) {
            JButton button = new JButton(site[0]);
            button.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    try {
                        Desktop.getDesktop().browse(new URI(site[1]));
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            });
            add(button);
        }

        setVisible(true);
    }

    public static void main(String[] args) {
        new Test03();
    }
}