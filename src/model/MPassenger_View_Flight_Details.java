/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;



public class MPassenger_View_Flight_Details 
{
    private static final Logger LOGGER = Logger.getLogger(MPassenger_View_Flight_Details.class.getName());

    public List<Object[]> searchFlights(String from, String to, String flightClass, int passengers) 
    {
        List<Object[]> flightData = new ArrayList<>();

        String query = "SELECT ft.flightNumber, fd.fromDestination, fd.toDestination, fd.departureDate, "
                     + "fd.departureTime, fd.arrivalDate, fd.arrivalTime, ft.flightClass, ft.ticketPrice * ? AS totalTicketPrice "
                     + "FROM FlightTicket ft "
                     + "JOIN FlightDetails fd ON ft.flightNumber = fd.flightNumber "
                     + "WHERE TRIM(LOWER(fd.fromDestination)) = TRIM(LOWER(?)) "
                     + "AND TRIM(LOWER(fd.toDestination)) = TRIM(LOWER(?)) "
                     + "AND TRIM(LOWER(ft.flightClass)) = TRIM(LOWER(?))";

        try (Connection con = DBConnection.createDBConnection();
             PreparedStatement pst = con.prepareStatement(query)) 
        {
            pst.setInt(1, passengers);
            pst.setString(2, from.trim().toLowerCase());
            pst.setString(3, to.trim().toLowerCase());
            pst.setString(4, flightClass.trim().toLowerCase());

            LOGGER.info("Executing query: " + query);
            LOGGER.info("Parameters: Passengers = " + passengers + ", From = " + from + ", To = " + to + ", Class = " + flightClass);

            try (ResultSet rs = pst.executeQuery()) 
            {
                if (!rs.isBeforeFirst()) 
                {
                    LOGGER.warning("No flights found for the given criteria.");
                }
                while (rs.next()) 
                {
                    Object[] row = new Object[9];
                    row[0] = rs.getString("flightNumber");
                    row[1] = rs.getString("fromDestination");
                    row[2] = rs.getString("toDestination");
                    row[3] = rs.getDate("departureDate");
                    row[4] = rs.getTime("departureTime");
                    row[5] = rs.getDate("arrivalDate");
                    row[6] = rs.getTime("arrivalTime");
                    row[7] = rs.getString("flightClass");
                    row[8] = rs.getDouble("totalTicketPrice");
                    flightData.add(row);
                }
            }
        } 
        catch (SQLException e) 
        {
            LOGGER.severe("SQL Error: " + e.getMessage());
        }

        if (flightData.isEmpty()) 
        {
            LOGGER.warning("No flights found for the given criteria.");
        }

        return flightData;
    }
}
