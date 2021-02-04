package p1q1;

import java.util.Scanner;

/**
 * @author Tay
 * date: 20th Jan 2021
 */
public class P1Q1 {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  
  //Variables
  String name;
  int yearOfStudy;
  double gpa;
  
    System.out.print("Enter Name: ");
	name = input.nextLine(); 
        
    System.out.print("Enter your year of study : ");
        yearOfStudy = input.nextInt();
        
    System.out.print("What is your target GPA for this semester? ");
        gpa = input.nextDouble();
        
    System.out.println("Welcome " + name + " !!!");
    System.out.println("Work hard to achieve your target GPA of " + gpa + " this semester of your Year " + yearOfStudy +".");

  }
}
