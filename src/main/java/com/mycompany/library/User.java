package com.mycompany.library;

import java.io.File;
import java.io.FileNotFoundException;  
import java.util.Scanner; 
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class User {
    private static final String config_file = "resources/credentials/admin.properties";
    private static Properties properties = new Properties();

    private String username = "";
    private String email = "";
    private String password = "";
    private boolean admin = false; // check if the current user is an admin

    static {
        try {
            FileInputStream input = new FileInputStream(config_file);
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    // Constructors
    public User(String usm, String pw) // constructor to initialize user object
    {
        if(usm.contains("@")) { // usm is an email
            email = usm;
        } else { // usm is a username
            username = usm;
        }
        password = pw;

        String admin_name = properties.getProperty("username");
        String admin_pw = properties.getProperty("password");

        System.out.println("Admin username: " + admin_name);
        System.out.println("Admin password: " + admin_pw);

        if((username.equals(admin_name) || email.equals(admin_name)) && password.equals(admin_pw)) {
            admin = true;
        }
    }

    // Getters
    public String getUsername()
    {
        return username;
    }
    public String getEmail()
    {
        return email;
    }
    public String getPassword()
    {
        return password;
    }
    public boolean isAdmin()
    {
        return admin;
    }

    public boolean isValidUser()
    {
        if(admin) { // is admin
            return true;
        } else if((username.equals("User") || email.equals("user@gmail.com")) && password.equals("userpw")) { // is regular user
            return true;
        } else {
            return false;
        }
    }

    public void showInfo()
    {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password); // only show when debugging
    }
}
