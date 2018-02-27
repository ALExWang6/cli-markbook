import java.util.*;

public class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int choice;
    int[] studentNum;
    double[] sAverage;
    int cAverage;
    String[] name;
    int total = 0;
    int classTotal = 0;
    String[] assignments;
    String[] name2;
    String[] gradYear;

    System.out.print("Please type in the total number of students:");
    total = input.nextInt();
    name = new String[total];
    sAverage = new double[total];
    studentNum = new int[total];
    assignments = new String[total];
    name2 = new String[total];
    gradYear = new String[total];

    if (total > 0) {  //When user has more than zero students enrolled
    
      System.out.printf("What would you like to view?\n(1)\tStudent #\n(2)\tStudent's Averages\n(3)\tStudent's Logins\nPlease enter either '1' or '2' or '3':\t");
      choice = input.nextInt();
  
      //  User wants to view Student #
      if (choice == 1) {
        System.out.println("Student #s");
        for(int i = 0; i < total; i++) {
  
          System.out.print("What is Student #" + (i + 1) + "'s name? ");
          name[i] = input.next();
          System.out.print("What is " + name[i] + "'s student number? ");
          studentNum[i] = input.nextInt();
        }
          
        String classTable1 = "║ %-15s ║ %-9d ║%n";
        System.out.format("╔═════════════════╦═══════════╗%n");
        System.out.format("║ Student Name    ║ Student # ║%n");
        System.out.format("╠═════════════════╬═══════════╣%n");
        for (int j = 0; j < total; j++) {
          System.out.format(classTable1, name[j], studentNum[j]);
        }
        System.out.format("╚═════════════════╩═══════════╝%n");
      
      //  User wants to view Student's averages  
      } else if (choice == 2) {
          System.out.println("Student's Averages");
          for(int i = 0; i < total; i++) {
    
            System.out.printf("What is Student #" + (i + 1) + "'s name? ");
            name[i] = input.next();
            System.out.print("What is " + name[i] + "'s average (%)? ");
            sAverage[i] = input.nextDouble();
            System.out.print("Is " + name[i] + " missing any assignments (YES/NO)? ");
            assignments[i] = input.next().toLowerCase();
            
            if (sAverage[i] <= 65 || assignments[i].equals("yes")) {
              System.out.println(name[i] + "'s grades are in danger!!!");
            }
            // Gather sum of averages
            classTotal += sAverage[i];
          }
            
          String classTable2 = "║ %-15s ║ %-11g ║%n";
          System.out.format("╔═════════════════╦═════════════╗%n");
          System.out.format("║ Student Name    ║ Average (%%) ║%n");
          System.out.format("╠═════════════════╬═════════════╣%n");
          for (int j = 0; j < total; j++) {
            System.out.format(classTable2, name[j], sAverage[j]);
          }
          System.out.format("╚═════════════════╩═════════════╝%n");
          
          // Calculate total class average
          cAverage = classTotal / total;
          System.out.println("Class Average:\t" + cAverage + "%");
      
      //  User wants to view student logins (passwords could not yet be implemented)
      } else if (choice == 3) {
          System.out.println("Student's Logins");
          for(int i = 0; i < total; i++) {
            System.out.print("What is Student #" + (i + 1) + "'s first name? ");
            name[i] = input.next();
            System.out.print("What is " + name[i] + "'s last name? ");
            name2[i] = input.next();
            System.out.print("When is " + name[i] + " " + name2[i] + " graduating? 20");
            gradYear[i] = input.next();
            System.out.print("This student's login is:\t" + name[i] + "." + name2[i] + gradYear[i] + "@ycdsbk12.ca\n");
          }
      
      // User enters a number that is not 1, 2, or 3
      } else {
        System.out.println("Not a valid command! Please restart the program and try again!");
      }
    } else {  // When user enters 0 for number of students
      System.out.println("There are no students in your class.");
    }
  }
}
