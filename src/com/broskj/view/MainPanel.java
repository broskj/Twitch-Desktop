package com.broskj.view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by broskj on 7/10/16.
 */
public class MainPanel extends JPanel {

    public MainPanel() {
        setOpaque(false);
    } // end constructor

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();

        g2d.dispose();
    } // end paintComponent
} // end MainPanel
