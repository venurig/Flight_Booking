/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import controller.LoggedInUser;
import java.sql.ResultSet;
import java.sql.*;
import javax.swing.JOptionPane;
import view.VPassenger_Dashboard;


public class MPassenger_Login 
{
   public void loginPassenger(String userName , String password)
    {
        try
        {
            Connection con = DBConnection.createDBConnection();
            String query = "SELECT * FROM registerDetails WHERE userName = ? AND password = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, userName);
            ps.setString(2, password);
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()) 
            {
                LoggedInUser.setUser(userName, password);
                JOptionPane.showMessageDialog(null, "Login successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Login failed! Please check your username and password.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(SQLException e)
        {
            System.err.println("SQL Error: " + e.getMessage());
        }
 
    }

    private void dispose() 
    {
        VPassenger_Dashboard PregisterForm = new VPassenger_Dashboard();
        PregisterForm.setVisible(true);
    }
}
