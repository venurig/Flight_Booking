/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.List;
import model.*;


public class CFlight_Tickets 
{
    public void addFlightTicket(String flightNumber, String flightClass, double ticketPrice)
   {
       MFlight_Tickets mftadd = new MFlight_Tickets();
       mftadd.addFlightTicket(flightNumber, flightClass, ticketPrice);
   }
    
    public void updateFlightTicket(String flightNumber, String flightClass, double ticketPrice)
   {
       MFlight_Tickets mftupdate = new MFlight_Tickets();
       mftupdate.updateFlightTicket(flightNumber, flightClass, ticketPrice);
   }
    
    public void deleteFlightTicket(String flightNumber) 
    {
        MFlight_Tickets mftupdate = new MFlight_Tickets();
        mftupdate.deleteFlightTicket(flightNumber);
    }
    
    private MFlight_Tickets mft = new MFlight_Tickets();

        public Ticket getFlightTicket(String flightNumber) 
        {
            return mft.searchFlightTicket(flightNumber);
        }
}
