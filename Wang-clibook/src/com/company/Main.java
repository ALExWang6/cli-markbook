package com.company;

import java.util.Scanner;

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
