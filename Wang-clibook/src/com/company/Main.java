import java.util.*;

public class Main {
  public static void main(String[] args) {


    // to remove one part of row from the list, you use the .remove() function to an index and add another row using .add() 
    Scanner input = new Scanner(System.in);
    int choice;
    int count = 0;
    int quiz = 0;
    int[] studentNum;
    double[] sAverage;
    double[][] quizMarks;
    double qMark;
    double qTotal = 0;
    int cAverage;
    String[] name;
    int total = 0;
    int classTotal = 0;
    String[] gradYear;
    boolean[] danger;
    boolean end = false;

    System.out.print("Please type in the total number of students:");
    total = input.nextInt();
    name = new String[total];
    sAverage = new double[total];
    studentNum = new int[total];
    gradYear = new String[total];
    danger = new boolean[total];
    
    System.out.println("Please type in the students info.");
            
          for(int i = 0; i < total; i++) {
  
          System.out.print("What is Student #" + (i + 1) + "'s name? ");
          name[i] = input.next();
          System.out.print("What is " + name[i] + "'s student number? ");
          studentNum[i] = input.nextInt();
          
          }
          
          while(end == false){
          System.out.printf("What would you like to do?\n(1)\tEdit marks?\n(2)\tSee list of Average?\n(3)\tDanger students?\nPlease enter either '1' or '2' or '3':\t");
          choice = input.nextInt();
          
          if(choice == 1){
            
            if(count == 0){
              System.out.println("How many quiz are there?");
              quiz = input.nextInt();
              quizMarks = new double[total][quiz];
              
              for(int t = 0; t < total; t++){
              for(int k = 0; k < quiz; k++){
                System.out.println("What is " + name[t] + "'s " + (k+1) + "# quiz mark?");
                qMark = input.nextDouble();
                quizMarks[t][k] = qMark;
                qTotal += qMark;  
              }
              sAverage[t] = qTotal / quiz;
              qTotal = 0;
              }
              count ++;
              
              for(int u = 0; u < total; u++){
                for(int y = 0; y < quiz; y++){
                System.out.println(name[u] + (y+1) + "# quiz mark is " + quizMarks[u][y]);
              }
              System.out.println("His average is " + sAverage[u]); 
                System.out.println("");
              }
              
              System.out.println();
            }
            
            else{
              int editChoice;
              System.out.println("Which student info would you like to change? Type 0 ~ " + (total-1));
              editChoice = input.nextInt();
              
            }
          
          }
          
          }
            
            
          } // main method
    
  }// class
