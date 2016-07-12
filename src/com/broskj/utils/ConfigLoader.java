package com.broskj.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by broskj on 7/10/16.
 */
public class ConfigLoader {
    private static InputStream inputStream;
    private Properties properties;

    public Properties loadProperties() throws IOException {
        //inputStream = ConfigLoader.class.getResourceAsStream(Settings.CONFIG_FILE);
        inputStream = new FileInputStream(Settings.CONFIG_FILE);
        properties = new Properties();

        if(inputStream != null) {
            properties.load(inputStream);
            return properties;
        }
        return null;
    } // end loadProperties

    public void writeProperty(String property, String value) {
        properties.setProperty(property, value);
    }
} // end class ConfigLoader
