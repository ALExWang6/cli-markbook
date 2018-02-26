import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String choice1;
        int[] studentNum;
        double[] sAverage;
        double cAverage;
        String[] name;
        int total = 0;
        boolean[] danger;
        double classTotal = 0;
    

        System.out.print("Please type in the total number of students.");
        total = input.nextInt();
        name = new String[total];
        sAverage = new double[total];
        studentNum = new int[total];
        danger = new boolean[total];

        System.out.printf("What would you like to do?\nEdit Student info(Edit)? See the list?(list) Check student login information(check)?");

        choice1 = input.next();

        if (choice1.equals("Edit")){

            System.out.println("Type in student info.");
        

                    for(int i = 0; i < total; i++) {

                        System.out.print("Enter " + (i+1) + "#student name: ");
                        name[i] = input.next();
                        System.out.print("Enter the student's number: ");
                        studentNum[i] = input.nextInt();
                        System.out.print("Enter student average: ");
                        sAverage[i] = input.nextDouble();
                        if(sAverage[i] <= 65){ 
                        danger[i] = true;
                        }
                        
                        else{
                          danger[i] = false;
                        }
                        
                        classTotal += sAverage[i];
                        
                        System.out.println("");

                    }
                    
                  
                    cAverage = classTotal / total;

            System.out.println("╔═════════════════════════════╦═══════════╦═══════════════════════╦════════════════════════════════╗");
            System.out.println("║        Student Name         ║ Student # ║ Student's Average (%) ║ In Danger?/Missed Assignments? ║");
            System.out.println("╠═════════════════════════════╬═══════════╬═══════════════════════╬════════════════════════════════╣");
          
          for(int j = 0; j < total; j++){
            System.out.println("║        " + name[j] + "      " + studentNum[j] + "    " + sAverage[j] + "     " + danger[j] + "║");
          }
          
          System.out.println("║   class average: " + cAverage );

    }
}
}
