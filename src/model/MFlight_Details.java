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
    
    public String searchFlightDetails(String flightNumber) 
    {
        String fromDestination = null;
        String toDestination = null;
        Date departureDate = null;
        Date arrivalDate = null;
        
        StringBuilder flightDetails = new StringBuilder();
        
        try 
        {
            Statement st = DBConnection.createDBConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT fromDestination, toDestination, departureDate, arrivalDate FROM FlightDetails WHERE flightNumber = '"+flightNumber+"' ");

            if (rs.next()) 
            {
                fromDestination = rs.getString("fromDestination");
                toDestination = rs.getString("toDestination");
                departureDate = rs.getDate("departureDate");
                arrivalDate = rs.getDate("arrivalDate");
                
                flightDetails
                        .append("From: ").append(fromDestination).append(", ")
                        .append("To: ").append(toDestination).append(", ")
                        .append("Departure: ").append(departureDate).append(", ")
                        .append("Arrival: ").append(arrivalDate);
            } 
            else 
            {
                flightDetails.append("No flight found with flight number: ").append(flightNumber);
            }
        } 
        catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
        }

        return flightDetails.toString();
    }
}   
