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
                
                int availableSeats = 0;
                if (flightClass.equalsIgnoreCase("Business Class")) 
                {
                    availableSeats = 28;
                } 
                else if (flightClass.equalsIgnoreCase("Economy Class")) 
                {
                    availableSeats = 269; 
                } 
                else 
                {
                    System.err.println("Invalid flight class.");
                    return;
                }
                
                String checkBookedSeatsQuery = "SELECT SUM(passengers) AS totalBooked FROM flightBooking WHERE flightNumber = ? AND flightClass = ?";
                PreparedStatement psCheckBookedSeats = con.prepareStatement(checkBookedSeatsQuery);
                psCheckBookedSeats.setString(1, flightNumber);
                psCheckBookedSeats.setString(2, flightClass);
                ResultSet rsBooked = psCheckBookedSeats.executeQuery();
                
                int totalBooked = 0;
                if (rsBooked.next()) 
                {
                    totalBooked = rsBooked.getInt("totalBooked");
                }
                
                if ((totalBooked + passengers) > availableSeats) 
                {
                    System.err.println(flightClass + " for flight " + flightNumber + " is fully booked. Only " + (availableSeats - totalBooked) + " seats available.");
                    return;
                }
                
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
    
    public boolean checkSeatAvailability(String flightNumber, String flightClass, int passengers) throws SQLException 
    {
        try (Connection con = DBConnection.createDBConnection()) 
        {
            String query = "SELECT SUM(passengers) AS totalBooked FROM flightBooking WHERE flightNumber = ? AND flightClass = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, flightNumber);
            ps.setString(2, flightClass);
            ResultSet rs = ps.executeQuery();

            int availableSeats = flightClass.equalsIgnoreCase("Business Class") ? 28 : 269;
            int totalBooked = 0;

            if (rs.next()) 
            {
                totalBooked = rs.getInt("totalBooked");
            }

            return (totalBooked + passengers) <= availableSeats;
        }
    }
}
