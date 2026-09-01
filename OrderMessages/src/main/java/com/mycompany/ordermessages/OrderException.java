/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ordermessages;

/**
 *
 * @author asand
 */
public class OrderException extends Exception { // Adapted from: GeeksforGeeks
                                                // Reference: https://www.geeksforgeeks.org/user-defined-custom-exception-in-java/
    
public OrderException(String message){
    super(message);
}
}