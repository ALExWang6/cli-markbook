package com.company;

import java.util.*; // accesses entire java.util library

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String choice1;
        String choice2;
        int[] studentNum;
        double[] sAverage;
        int cAverage;
        String[] name;
        String[] pass;
        int total = 0;

        System.out.println("Please type in the total number of students.");
        total = input.nextInt();
        name = new String[total];
        sAverage = new double[total];
        pass = new String[total];
        studentNum = new int[total];

        System.out.printf("What would you like to do?\nEdit Student info? See the list? Check student login information?\n");

        choice1 = input.next();

        if (choice1.equals("Edit")){

            System.out.println("Do you want to add a new student or change current information?");
            choice2 = input.next();

            if (choice2.equals("Add")){

                    for(int i = 0; i < total; i++) {

                        System.out.println("Enter student name: ");
                        name[i] = input.next();
                        System.out.println("Enter the student's number: ");
                        studentNum[i] = input.nextInt();

                    }


                    //System.out.println(name[0] + studentNum[0]);
            }
            if (choice2.equals("Edit")){

            }
        }
    }
}


// Martin's code below
/*
import java.util.*;


public class Main {   // This  function stores values onto a list which would later be displayed 
  public static void main(String[] args) {
    // Inputting student's information

    Scanner student = new Scanner(System.in);
    System.out.print("What is this student's name?\t");
    String studentName = student.next();
    
    System.out.print("Please enter " + studentName + "'s Student Number:\t");
    int studentno = Student.nextInt();
    
    System.out.print("What is " + studentName + "'s avaerage mark as of now?\t");
    boolean col4 = false
    double studentAvg = student.nextDouble();
    if (studentAvg <= 65) {
      boolean col4 = true
    }
    
    System.out.print("Is " + studentName + "missing any assignments (YES/NO)?\t");
    String assignments = student.next();
    String missing = assignments.toLowerCase();
    if (missing.equals("y") || missing.equals("yes") {
      boolean col4 = true
    }
    

    // Printing Class List
    System.out.print("Do you want to view your Class List (YES/NO)?\t");
    Scanner maybe = new Scanner(System.in);
    String view = maybe.next();
    String classInfo = view.toLowerCase();
    
    if (classInfo.equals("y") || classInfo.equals("yes")) {
      //  Make ASCII tables @ https://ozh.github.io/ascii-tables/
      System.out.println("╔═════════════════════════════╦═══════════╦═══════════════════════╦════════════════════════════════╗");
      System.out.println("║        Student Name         ║ Student # ║ Student's Average (%) ║ In Danger?/Missed Assignments? ║");
      System.out.println("╠═════════════════════════════╬═══════════╬═══════════════════════╬════════════════════════════════╣");
    } else {
        System.out.print("Class List not shown.");
    }

  }
}

*/
