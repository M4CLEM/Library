package com.mycompany.library;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Database {
    private static final String config_file = "resources/credentials/database.properties";
    private static Properties properties = new Properties();
    static {
        try {
            FileInputStream input = new FileInputStream(config_file);
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getUrl() 
    {
        return properties.getProperty("url");
    }

    public static String getUsername() 
    {
        return properties.getProperty("username");
    }

    public static String getPassword() 
    {
        return properties.getProperty("password");
    }
}   
