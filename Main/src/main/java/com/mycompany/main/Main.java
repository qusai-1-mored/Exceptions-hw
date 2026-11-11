/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.main;
/***************************************************************/
public class Main {

    public static void main(String[] args) {

        WorkshopRegistration registration =new WorkshopRegistration();
        try {registration.registerParticipant("Qusai", 16);
        } catch (InvalidAgeException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
