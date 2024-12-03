/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author V E N U R I
 */
public class Flight 
{
    private String flightNumber;
    private String fromDestination;
    private String toDestination;
    private String departureDate;
    private String departureTime;
    private String arrivalDate;
    private String arrivalTime;

    public Flight(String flightNumber, String fromDestination, String toDestination, String departureDate, String departureTime, String arrivalDate, String arrivalTime) 
    {
        this.flightNumber = flightNumber;
        this.fromDestination = fromDestination;
        this.toDestination = toDestination;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.arrivalDate = arrivalDate;
        this.arrivalTime = arrivalTime;
    }

    public String getFlightNumber() 
    { 
        return flightNumber; 
    }
    
    public String getFromDestination() 
    {
        return fromDestination; 
    }
    
    public String getToDestination() 
    {
        return toDestination; 
    }
    
    public String getDepartureDate()
    {
        return departureDate; 
    }
    
    public String getDepartureTime() 
    {
        return departureTime; 
    }
    
    public String getArrivalDate() 
    {
        return arrivalDate; 
    }
    
    public String getArrivalTime() 
    {
        return arrivalTime; 
    }
}
