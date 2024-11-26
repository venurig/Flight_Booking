/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.*;

public class MFlight_Details 
{
    public void addFlightDetails(String flightNumber, String fromDestination, String toDestination, String departureDate, String arrivalDate)
    {
        try
        {
            Statement st = DBConnection.createDBConnection().createStatement();
            st.executeUpdate("insert into FlightDetails values('"+flightNumber+"' , '"+fromDestination+"' , '"+toDestination+"' , '"+departureDate+"' , '"+arrivalDate+"')");
            System.out.println("Succesfully added");
        }
        catch(SQLException e)
        {
            System.err.println(e.getMessage());
        }
    }
    
    public void updateFlightDetails(String flightNumber, String fromDestination, String toDestination, String departureDate, String arrivalDate) 
    {
        try 
        {
            Statement st = DBConnection.createDBConnection().createStatement();
            st.executeUpdate("UPDATE FlightDetails SET fromDestination = '"+fromDestination+"' , toDestination = '"+toDestination+"' , departureDate = '"+ departureDate+"' , arrivalDate = '"+arrivalDate+"' WHERE flightNumber = '"+flightNumber+"'");
            System.out.println("Flight details successfully updated.");
        } 
        catch (SQLException e) {

            System.err.println("SQL Error: " + e.getMessage());
        }
    }

}   
