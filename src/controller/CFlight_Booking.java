/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.*;


public class CFlight_Booking 
{
    public void bookFlight(String flightNumber, String fromDestination, String toDestination, String flightClass, int passengers, String username, String password)
   {
       MFlight_Booking mfbook = new MFlight_Booking();
       mfbook.bookFlight(flightNumber, fromDestination, toDestination, flightClass, passengers, username, password);
   }
}
