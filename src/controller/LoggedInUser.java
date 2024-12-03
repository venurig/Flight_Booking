/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author V E N U R I
 */
public class LoggedInUser 
{
    public static String username;
    public static String password;

    public static void setUser(String user, String pass) 
    {
        username = user;
        password = pass;
    }

    public static String getUsername() 
    {
        return username;
    }

    public static String getPassword() 
    {
        return password;
    }
}
