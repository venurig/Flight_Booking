/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.ArrayList;
import model.*;
import java.util.List; 
import java.util.logging.Level; 
import java.util.logging.Logger;


public class CPassenger_View_Flight_Details 
{
    private static final Logger LOGGER = Logger.getLogger(CPassenger_View_Flight_Details.class.getName());
    private MPassenger_View_Flight_Details model;

    public CPassenger_View_Flight_Details() {
        this.model = new MPassenger_View_Flight_Details();
    }

    public List<Object[]> getFlights(String from, String to, String flightClass, int passengers) 
    {
        LOGGER.info("Search criteria: From=" + from + ", To=" + to + ", Class=" + flightClass + ", Passengers=" + passengers);

        try 
        {           
            List<Object[]> flights = model.searchFlights(from, to, flightClass, passengers);           
            LOGGER.info("Fetched flight data: " + (flights != null ? flights.size() : 0));
            if (flights != null) 
            {
                for (Object[] flight : flights)
                {
                    LOGGER.info("Flight details: " + java.util.Arrays.toString(flight));

                    double ticketPrice = (double) flight[8];  
                    flight[8] = ticketPrice * passengers;  
                }
            }
            return flights;
        } 
        catch (Exception e) 
        {
            LOGGER.log(Level.SEVERE, "Error fetching flight data", e);
            return null;
        }
    }
}
