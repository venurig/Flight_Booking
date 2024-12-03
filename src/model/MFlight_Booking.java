/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.*;


public class MFlight_Booking 
{
    public void bookFlight(String flightNumber, String fromDestination, String toDestination, String flightClass, int passengers, String username, String password)
    {
        try (Connection con = DBConnection.createDBConnection())
        {
            String getPassengerQuery = "SELECT passengerID FROM registerDetails WHERE userName = ? AND password = ?";
            PreparedStatement psGetPassenger = con.prepareStatement(getPassengerQuery);
            psGetPassenger.setString(1, username);
            psGetPassenger.setString(2, password);
            ResultSet rs = psGetPassenger.executeQuery();
            
            if (rs.next()) 
            {
                int passengerID = rs.getInt("passengerID");
                
                String insertBookingQuery = "INSERT INTO flightBooking (passengerID, flightNumber, fromDestination, toDestination, flightClass, passengers) VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement psInsertBooking = con.prepareStatement(insertBookingQuery);
                psInsertBooking.setInt(1, passengerID);
                psInsertBooking.setString(2, flightNumber);
                psInsertBooking.setString(3, fromDestination);
                psInsertBooking.setString(4, toDestination);
                psInsertBooking.setString(5, flightClass);
                psInsertBooking.setInt(6, passengers);

                psInsertBooking.executeUpdate();
                System.out.println("Flight booking successfully saved to the database.");
            }
            else 
            {
                System.err.println("Passenger not found. Booking cannot be completed.");
            }
        }
        catch(SQLException e)
        {
            System.err.println(e.getMessage());
        }
    }
}
