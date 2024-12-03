/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;



public class Ticket 
{
    private String flightNumber;
    private String flightClass;
    private double ticketPrice;

    public Ticket(String flightNumber, String flightClass, double ticketPrice) 
    {
        this.flightNumber = flightNumber;
        this.flightClass = flightClass;
        this.ticketPrice = ticketPrice;
    }

    public String getFlightNumber() 
    { 
        return flightNumber; 
    }
    
    public String getflightClass() 
    { 
        return flightClass; 
    }
    
    public double getticketPrice() 
    {
        return ticketPrice; 
    }
}
