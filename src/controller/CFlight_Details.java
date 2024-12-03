/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.List;
import model.*;

public class CFlight_Details 
{
    public void addFlightDetails(String flightNumber, String fromDestination, String toDestination, String departureDate, String departureTime, String arrivalDate, String arrivalTime)
   {
       MFlight_Details mfdadd = new MFlight_Details();
       mfdadd.addFlightDetails(flightNumber, fromDestination, toDestination, departureDate, departureTime, arrivalDate, arrivalTime);
   }
    
    public List<String> getAllFlightNumbers() 
    {
        MFlight_Details mfd = new MFlight_Details();
        return mfd.getAllFlightNumbers();
    }
    
    public void updateFlightDetails(String flightNumber, String fromDestination, String toDestination, String departureDate,String departureTime, String arrivalDate, String arrivalTime)
   {
       MFlight_Details mfdupdate = new MFlight_Details();
       mfdupdate.updateFlightDetails(flightNumber, fromDestination, toDestination, departureDate, departureTime, arrivalDate, arrivalTime);
   }
    
    public void deleteFlightDetails(String flightNumber) 
    {
        MFlight_Details mfddelete = new MFlight_Details();
        mfddelete.deleteFlightDetails(flightNumber);
    }
    
    private MFlight_Details mfd = new MFlight_Details();

        public Flight getFlightDetails(String flightNumber) 
        {
            return mfd.searchFlightDetails(flightNumber);
        }
}
