package com.mycompany.library;

import java.sql.*;

import com.mysql.cj.xdevapi.Result;

public class LibraryUtil {
    
    public static int getUserId(String first_name, String middle_name, String last_name, String email)
    {
        int id = 0;
        try {
            Connection con = DriverManager.getConnection(Database.getUrl(), Database.getUsername(), Database.getPassword());
            PreparedStatement stat = con.prepareStatement("SELECT user_id FROM users WHERE first_name = ? AND middle_name = ? AND last_name = ? AND email = ?");
            stat.setString(1, first_name);
            stat.setString(2, middle_name);
            stat.setString(3, last_name);
            stat.setString(4, email);
            ResultSet result = stat.executeQuery();
            if(result.next()) {
                id = result.getInt(1);
            }
            result.close();
            stat.close();
            con.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return id;
    }

    public static boolean isValidEmailFormat(final String email)
    {
        if(!email.contains("@")) {
            return false;
        }
        return true;
    }

    public static boolean isValidBookIdFormat(final String id)
    {
        if(id.length() != 13) {
            return false;
        }
        for(int i = 0; i < id.length(); i++) {
            if(!Character.isDigit(id.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean bookIdExists(final String id)
    {
        boolean exist = false;
        try {
            Connection con = DriverManager.getConnection(Database.getUrl(), Database.getUsername(), Database.getPassword());
            PreparedStatement stat = con.prepareStatement("SELECT book_id FROM books WHERE book_id = ?");
            stat.setString(1, id);
            ResultSet rs = stat.executeQuery();
            if(rs.next()) {
                exist = true;
            }
            rs.close();
            stat.close();
            con.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return exist;
    }
}
