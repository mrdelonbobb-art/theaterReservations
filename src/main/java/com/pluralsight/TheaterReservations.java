package com.pluralsight;

import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your first and last name");
        String fullname = sc.nextLine().toUpperCase();

        String[] nameParts = fullname.split("\\s+");

        if (nameParts.length >= 2) {
            String firstName = nameParts[0];
            String lastName = nameParts[nameParts.length - 1];
            fullname = lastName + ", " + firstName;
        } else {
            System.out.println("Please enter both first and last name.");
            return;
        }

System.out.println("Enter date of the show,Format (MM/DD/YYYY): ");
String date = sc.nextLine();

 System.out.println("how may tickets do you need?");
 int Tickets = sc.nextInt();
        {if (Tickets <=1)
    System.out.println("one ticket reserved for "+ date + " under " + fullname);
else System.out.println(Tickets+" Tickets reserved for "+ date + " under "+ fullname);
}





    }
}
