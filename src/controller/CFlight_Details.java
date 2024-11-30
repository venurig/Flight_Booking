/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.Date;
import model.*;

public class CFlight_Details 
{
    public void addFlightDetails(String flightNumber, String fromDestination, String toDestination, String departureDate, String arrivalDate)
   {
       MFlight_Details mfdadd = new MFlight_Details();
       mfdadd.addFlightDetails(flightNumber, fromDestination, toDestination, departureDate, arrivalDate);
   }
    
    public void updateFlightDetails(String flightNumber, String fromDestination, String toDestination, String departureDate, String arrivalDate)
   {
       MFlight_Details mfdupdate = new MFlight_Details();
       mfdupdate.updateFlightDetails(flightNumber, fromDestination, toDestination, departureDate, arrivalDate);
   }
    
    public void deleteFlightDetails(String flightNumber) 
    {
        MFlight_Details mfddelete = new MFlight_Details();
        mfddelete.deleteFlightDetails(flightNumber);
    }
    
    private MFlight_Details mfdsea = new MFlight_Details(); 
    
        public String getflightDetails(String flightNumber)
        {
            return mfdsea.searchFlightDetails(flightNumber);
        }
}
