/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.*;

public class MFlight_Details 
{
    public void addFlightDetails(String flightNumber, String fromDestination, String toDestination, String departureDate, String departureTime, String arrivalDate, String arrivalTime)
    {
        try
        {
            Statement st = DBConnection.createDBConnection().createStatement();
            st.executeUpdate("insert into FlightDetails values('"+flightNumber+"' , '"+fromDestination+"' , '"+toDestination+"' , '"+departureDate+"' , '"+departureTime+"' , '"+arrivalDate+"' , '"+arrivalTime+"')");
            System.out.println("Flight details succesfully added.");
        }
        catch(SQLException e)
        {
            System.err.println(e.getMessage());
        }
    }
    
    public void updateFlightDetails(String flightNumber, String fromDestination, String toDestination, String departureDate, String departureTime, String arrivalDate, String arrivalTime) 
    {
        try 
        {
            Statement st = DBConnection.createDBConnection().createStatement();
            st.executeUpdate("UPDATE FlightDetails SET fromDestination = '"+fromDestination+"' , toDestination = '"+toDestination+"' , departureDate = '"+ departureDate+"' , departureTime = '"+departureTime+"' , arrivalDate = '"+arrivalDate+"' , arrivalTime = '"+arrivalTime+"' WHERE flightNumber = '"+flightNumber+"'");
            System.out.println("Flight details successfully updated.");
        } 
        catch (SQLException e) {

            System.err.println("SQL Error: " + e.getMessage());
        }
    }
    
    public void deleteFlightDetails(String flightNumber) 
    {
        try 
        {
            Statement st = DBConnection.createDBConnection().createStatement();
            st.executeUpdate("DELETE FROM FlightDetails WHERE flightNumber = '"+flightNumber+"' ");
            System.out.println("Flight details successfully deleted.");
        } 
        catch (SQLException e) 
        {
            System.err.println("SQL Error: " + e.getMessage());
        }
    }
    
    public Flight searchFlightDetails(String flightNumber) {
        Flight flight = null;
        try {
            Statement st = DBConnection.createDBConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM FlightDetails WHERE flightNumber = '" + flightNumber + "'");
            
            if (rs.next()) {
                flight = new Flight(
                    rs.getString("flightNumber"),
                    rs.getString("fromDestination"),
                    rs.getString("toDestination"),
                    rs.getString("departureDate"),
                    rs.getString("departureTime"),
                    rs.getString("arrivalDate"),
                    rs.getString("arrivalTime")
                );
            }
        } catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
        return flight;
    }
}   
