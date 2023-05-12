package com.mycompany.library.utilities;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.mycompany.library.Database;
import com.mysql.cj.xdevapi.Result;

public class LibraryUtil {
    
    public static int getUserId(final String email)
    {
        int id = 0;
        try {
            Connection con = DriverManager.getConnection(Database.getUrl(), Database.getUsername(), Database.getPassword());
            PreparedStatement stat = con.prepareStatement("SELECT user_id FROM users WHERE email = ?");
            stat.setString(1, email);
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
        return email.contains("@");
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

    public static boolean isValidPublishDateFormat(final String date)
    {
        if(date.isBlank()) {
            return true;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setLenient(false);
        try {
            sdf.parse(date);
        } catch (ParseException e) {
            return false;
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

    public static boolean userIdExists(final String id)
    {
        boolean exist = false;
        try {
            Connection con = DriverManager.getConnection(Database.getUrl(), Database.getUsername(), Database.getPassword());
            PreparedStatement stat = con.prepareStatement("SELECT user_id FROM users WHERE user_id = ?");
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

    public static boolean userExists(final String email)
    {
        return getUserId(email) > 0;
    }

    public static String getDatetimeNow()
    {
        Date currentDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return formatter.format(currentDate);
    }

    public static String getAddedDatetime(final String date, int days)
    {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        try {
            cal.setTime(formatter.parse(date));
        } catch(ParseException e) {
            e.printStackTrace();
        }
        cal.add(Calendar.DAY_OF_MONTH, days);
        String new_date = formatter.format(cal.getTime());
        return new_date;
    }
}
