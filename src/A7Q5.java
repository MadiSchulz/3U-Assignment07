
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author schum0689
 */
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create scanner
        Scanner input = new Scanner(System.in);
        // Ask user to input # of marks
        System.out.println("Number of marks:");
        // Store # of marks
        int numMarks = input.nextInt();
        
        // Create array of marks
        int[] marks = new int[numMarks];
        // Loop to populate array
        for (int i = 0; i < marks.length; i++) {
            // Ask user to input each mark
            System.out.println("Enter mark " + (i + 1) + ":");
            // Fill spot
            marks[i] = input.nextInt();
        }
        
        // Loop for each spot in array
        for (int i = 0; i < marks.length; i++) {
            // Loop for the number of spots after i 
            for (int x = 1; x < marks.length - i; x++) {
                // If spot x is less than spot before
                if (marks[x] < marks[x - 1]) {
                    // Store value of x (otherwise erased)
                    int storeValueX = marks[x];
                    // Spot x is filled with value of spot before
                    marks[x] = marks[x - 1];
                    // Spot x - 1 is filled with value of spot x
                    marks[x - 1] = storeValueX;
                }
            }
        }
        // Ouput sorted array to user
        System.out.println("The integers in ascending order are:");
        // Loop to output the sorted values
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i] + "  ");
        }
        
        // Determine if the length of the array is an even or odd number
        // Divide array length into groups of two (A6Q9)
            
    }
}
