package com.broskj.utils;

import java.awt.*;
import java.util.Properties;

/**
 * Created by broskj on 7/10/16.
 */
public class Settings {
    public static String CONFIG_FILE = "res/config.properties";

    // set from config file
    public static Layout LAYOUT;
    public static String AUTH_TOKEN;

    public static int SCREEN_WIDTH;
    public static int SCREEN_HEIGHT;
    public static int FRAME_HEIGHT;
    public static int FRAME_WIDTH;
    public static int START_X;
    public static int START_Y;

    public enum Layout {
        LEFT, RIGHT, TOP, BOTTOM
    } // end enum Layout

    public static void init() {
        ConfigLoader parser = new ConfigLoader();

        try {
            Properties p = parser.loadProperties();
            LAYOUT = Layout.valueOf(p.getProperty("layout").toUpperCase());
            AUTH_TOKEN = p.getProperty("auth_token");
        } catch (Exception e) {
            e.printStackTrace();
            LAYOUT = Layout.RIGHT;
            AUTH_TOKEN = "";
        }

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        SCREEN_WIDTH = (int)screenSize.getWidth();
        SCREEN_HEIGHT = (int)screenSize.getHeight();

        switch(LAYOUT) {
            case LEFT:
                FRAME_WIDTH = SCREEN_WIDTH/12;
                FRAME_HEIGHT = (3*SCREEN_HEIGHT)/4;
                START_X = 0;
                START_Y = (SCREEN_HEIGHT/2) - (FRAME_HEIGHT/2);
                break;
            case RIGHT:
                FRAME_WIDTH = SCREEN_WIDTH/12;
                FRAME_HEIGHT = (3*SCREEN_HEIGHT)/4;
                START_X = SCREEN_WIDTH - FRAME_WIDTH;
                START_Y = (SCREEN_HEIGHT/2) - (FRAME_HEIGHT/2);
                break;
            case TOP:
                FRAME_WIDTH = (3*SCREEN_WIDTH)/4;
                FRAME_HEIGHT = SCREEN_HEIGHT/10;
                START_X = (SCREEN_WIDTH/2) - (FRAME_WIDTH/2);
                START_Y = 0;
                break;
            case BOTTOM:
                FRAME_WIDTH = (3*SCREEN_WIDTH)/4;
                FRAME_HEIGHT = SCREEN_HEIGHT/10;
                START_X = (SCREEN_WIDTH/2) - (FRAME_WIDTH/2);
                START_Y = SCREEN_HEIGHT - FRAME_HEIGHT;
                break;
        }
    } // end init

} // end class Settings
