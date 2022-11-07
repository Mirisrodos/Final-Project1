package com.supermarket.dao.impl;

import com.supermarket.connection.DBConnection;
import com.supermarket.dao.IUserDAO;
import com.supermarket.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDAO extends DBConnection implements IUserDAO{
    private static String SELECT_ALL_USER = "Select * from users";

    @Override
    public List<User> getAllUser() {
        List<User> users = new ArrayList<User>();
        try {
            Connection connection = super.getConnection();
            PreparedStatement pStatement = connection.prepareStatement(SELECT_ALL_USER);
            ResultSet rSet = pStatement.executeQuery();
            
        } catch(Exception e){
            
        }
        return null;
    }

    @Override
    public User getUser() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean insertUser() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
