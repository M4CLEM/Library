package com.mycompany.library;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class User {
    private String username = "";
    private String email = "";
    private String password = "";
    private boolean admin = false; // check if the current user is an admin
    
    // Constructors
    public User(String usm, String pw) // constructor to initialize user object
    {
        if(usm.contains("@")) { // usm is an email
            email = usm;
        } else { // usm is a username
            username = usm;
        }
        password = pw;

        String admin_name = "";
        String admin_pw = "";

        try {
            File file = new File("resources/credentials/admin.txt");
            Scanner read = new Scanner(file);
            int i = 0;
            while(i < 2 && read.hasNextLine()) {
                if(i < 2) {
                    if(i == 0) {
                        admin_name = read.nextLine();
                    } else if(i == 1) {
                        admin_pw = read.nextLine();
                    }
                    i++;
                }
            }
            read.close();
            admin_name = admin_name.trim(); // remove trailing whitespaces
            admin_pw = admin_pw.trim();
        } catch(FileNotFoundException e) {
            System.out.println("[Error] File not found");
            e.printStackTrace();
        }

        // System.out.println("Admin username: " + admin_name);
        // System.out.println("Admin password: " + admin_pw);

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
