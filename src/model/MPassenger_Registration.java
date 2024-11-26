/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.*;

public class MPassenger_Registration 
{
    public void registerPassenger(String fullName, String contactNumber, String email, String gender, String passportNumber, String password)
    {
        try
        {
            Statement st = DBConnection.createDBConnection().createStatement();
            String query = "INSERT INTO registerDetails (fullName, contactNumber, email, gender, passportNumber, password) VALUES ('" + fullName + "', '" + contactNumber + "', '" + email + "', '" + gender + "', '" + passportNumber + "', '" + password + "')"; 
            st.executeUpdate(query);
            System.out.println("Succesfully added");
        }
        catch(SQLException e)
        {
            System.err.println(e.getMessage());
        }
    }
}
