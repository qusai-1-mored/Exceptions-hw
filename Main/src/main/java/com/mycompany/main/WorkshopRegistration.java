/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;
public class WorkshopRegistration {

    public void registerParticipant(String name, int age)throws InvalidAgeException {
        if (age < 18) 
        {
            throw new InvalidAgeException( "Registration denied for " + name+ ": Must be at least 18 years old" + " (provided age: " + age + ")");

        } else {

            System.out.println(
                "Registration successful for " + name
            );

        }
    }
}
