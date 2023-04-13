package com.mycompany.library;

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

        if((username.equals("Admin") || email.equals("admin@gmail.com")) && password.equals("adminpw")) {
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
