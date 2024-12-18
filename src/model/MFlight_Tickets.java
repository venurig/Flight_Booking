/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MFlight_Tickets 
{
    public void addFlightTicket(String flightNumber, String flightClass, double ticketPrice)
    {
        try
        {
            Statement st = DBConnection.createDBConnection().createStatement();
            st.executeUpdate("insert into FlightTicket values('"+flightNumber+"' , '"+flightClass+"' , '"+ticketPrice+"')");
            System.out.println("Flight ticket succesfully added.");
        }
        catch(SQLException e)
        {
            System.err.println(e.getMessage());
        }
    }
    
    public void updateFlightTicket(String flightNumber, String flightClass, double ticketPrice) 
    {
        try 
        {
            Statement st = DBConnection.createDBConnection().createStatement();
            st.executeUpdate("UPDATE FlightTicket SET flightClass = '"+flightClass+"' , ticketPrice = '"+ticketPrice+"' WHERE flightNumber = '"+flightNumber+"' ");
            System.out.println("Flight ticket successfully updated.");
        } 
        catch (SQLException e) {

            System.err.println("SQL Error: " + e.getMessage());
        }
    }
    
    public void deleteFlightTicket(String flightNumber) 
    {
        try 
        {
            Statement st = DBConnection.createDBConnection().createStatement();
            st.executeUpdate("DELETE FROM FlightTicket WHERE flightNumber = '"+flightNumber+"' ");
            System.out.println("Flight ticket successfully deleted.");
        } 
        catch (SQLException e) 
        {
            System.err.println("SQL Error: " + e.getMessage());
        }
    }
    
    public Ticket searchFlightTicket(String flightNumber) {
        Ticket ticket = null;
        try {
            Statement st = DBConnection.createDBConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM FlightTicket WHERE flightNumber = '" + flightNumber + "'");
            
            if (rs.next()) {
                ticket = new Ticket(
                    rs.getString("flightNumber"),
                    rs.getString("flightClass"),
                    rs.getDouble("ticketPrice")
                );
            }
        } catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
        return ticket;
    }
}
