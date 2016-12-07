
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author schum0689
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create scanner for user input
        Scanner input = new Scanner(System.in);
        // Ask user to input # of students
        System.out.println("Enter number of students in class:");
        // Store # of students
        int students = input.nextInt();

        // Create integer array for the marks of each student
        double[] marks = new double[students];
        // Loop for user to fill the array
        for (int i = 0; i < marks.length; i++) {
            // Ask user to input marks for each student
            System.out.println("Mark of student " + (i + 1) + ":");
            marks[i] = input.nextDouble();
        }
        // Store # of total marks
        double total = 0;
        // Find each mark in the array
        for (int i = 0; i < marks.length; i++) {
            // Add mark to total
            total = total + marks[i];
        }
        // Calculate the class average
        double average = total / marks.length;
        // Ouput class average to user
        System.out.println("The class average is " + average + "%");
    }
}
