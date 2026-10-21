package com.pluralsight;

import java.util.Scanner;

public class FullNameApp {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = myScanner.nextLine();

        System.out.println("Enter your middle name: ");
        String middleName = myScanner.nextLine();

        System.out.println("Enter your last name: ");
        String lastName = myScanner.nextLine();

        System.out.println("Enter surname if applicable: : ");
        String surName = myScanner.nextLine();

        String fullName = firstName;

        if (!middleName.isEmpty()) {
            fullName = fullName + (" ") + middleName; // update to Variable

        }
            fullName = fullName + (" ") + lastName;// update to Variable

        if (!surName.isEmpty()){
            fullName = fullName + (", ") + surName;
        }

        System.out.println(fullName);
/*
Create a Java application called full-name-generator. Ensure that you set the
GroupId to com.pluralsight. Create a new package named com.pluralsight
and add a new class called FullNameApplication for the main() method.
You will prompt the user to enter the parts of their name. You will then create a new
string that holds the user’s full name.
The user will always have a first and last name; they may also have a middle name and a
suffix (ex. Jr, PhD). If a user does not enter a value for the middle name or suffix, the full
name should not include that part of the name. If the user has a suffix in their name, the
full name should include a comma before the suffix.

        Scanner myscanner = new Scanner(System.in);

        String firstName = getfirstName();
        String middleName = getmiddleName();
        String lastName = getlastName();
        String suffix = getsuffix();
    }

    public static String firstName(Scanner myScanner) {
        System.out.println("Enter your first name: ");
        String firstName = myScanner.nextLine();


        return firstName;

    }
}
    public static String middleName(Scanner myScanner) {
        System.out.println("Enter your middle name: ");
        String middleName = myScanner.nextLine();

         return middleName;

        System.out.println("Enter your first name:  ");
        String firstName = myscanner.nextLine();

        System.out.println("Enter your middle name:  ");
        String secondName = myscanner.nextLine();

        System.out.println("Enter your last name:  ");
        String lastName = myscanner.nextLine();

        System.out.println("Enter any suffixes:  ");
        String suffix = myscanner.nextLine();
        */}

}


/*You will prompt the user to enter the parts of their name. You will then create a new
string that holds the user’s full name.
The user will always have a first and last name; they may also have a middle name and a
suffix (ex. Jr, PhD). If a user does not enter a value for the middle name or suffix, the full
name should not include that part of the name. If the user has a suffix in their name, the
full name should include a comma before the suffix

 */