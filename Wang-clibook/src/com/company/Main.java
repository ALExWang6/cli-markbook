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

    System.out.print("Please type in the total number of students:");
    total = input.nextInt();
    name = new String[total];
    sAverage = new double[total];
    studentNum = new int[total];
    assignments = new String[total];

    System.out.printf("What would you like to view?\n(1)\tStudent #\n(2)\tStudent's Averages\nPlease enter either '1' or '2':\t");
    choice = input.nextInt();

    //  User wants to view Student #
    if (choice == 1) {
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
        for(int i = 0; i < total; i++) {
  
          System.out.printf("What is Student #" + (i + 1) + "'s name? ");
          name[i] = input.next();
          System.out.print("What is " + name[i] + "'s average (%)? ");
          sAverage[i] = input.nextDouble();
          System.out.print("Is " + name[i] + " missing any assignments (YES/NO)? ");
          assignments[i] = input.next().toLowerCase();
          
          if (sAverage[i] <= 65 || assignments[i].equals("yes")) {
            System.out.println(name[i] + "'s grades are in danger!");
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
        
        cAverage = classTotal / total;
        System.out.println("Class Average:\t" + cAverage + "%");
    
    //  User enters a number not 1 or 2  
    } else {
      System.out.println("Not a valid option! Please restart the program and try again!");
    }
  }
}
