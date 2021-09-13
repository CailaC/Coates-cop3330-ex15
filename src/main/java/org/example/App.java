package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Caila Coates
 */

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.println( "What is the password?" );
        String pass = input.next();

        String knownPass = "abc$123";

        if(pass.equals(knownPass))
            System.out.println("Welcome!");
        else
            System.out.println("I don't know you.");

    }

}
