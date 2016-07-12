package com.broskj.view;

import com.broskj.utils.Observer;
import com.broskj.utils.Settings;

import javax.swing.*;
import java.awt.*;

/**
 * Created by broskj on 7/10/16.
 *
 * Main frame to house online channel follows.
 *
 * Followed channels will be displayed vertically at first, and compatibility should be added later to rotate the list
 * horizontally.  Circular icons will be populated with the channel's icon, and on hover will display the channel name,
 * game, and description.  Clicking a channel icon will open a browser tab to that twitch channel.
 */
public class MainView extends JFrame implements Observer {
    private Graphics g;
    private MainPanel panel;

    public void init() {
        panel = new MainPanel();
        setSize(Settings.FRAME_WIDTH, Settings.FRAME_HEIGHT);
        setLocation(Settings.START_X, Settings.START_Y);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setBackground(new Color(0, 0, 0, 250));

        add(panel);
        setVisible(true);

        g = getGraphics();
    }

    public void run() {
        panel.paintComponent(g);
    } // end run

    @Override
    public void update() {

    }

    @Override
    public void remove() {

    }
} // end class MainView
