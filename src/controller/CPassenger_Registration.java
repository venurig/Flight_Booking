/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.*;

public class CPassenger_Registration 
{
    public void registerPassenger(String fullName, String contactNumber, String email, String passportNumber, String password)
   {
       MPassenger_Registration mcureg = new MPassenger_Registration();
       mcureg.registerPassenger(fullName, contactNumber, email, passportNumber, password);
   }
}
