/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.supermarket.dao;

import java.util.List;

import com.supermarket.model.entity.User;

public interface IUserDAO {
    public List<User> getAllUser();
    public User getUser();
    public boolean insertUser();
}
