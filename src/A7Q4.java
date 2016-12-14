
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author schum0689
 */
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create an array of 10 marks
        double[] marks = new double[10];
        // Create scanner
        Scanner input = new Scanner(System.in);
        // Loop to populate array
        for (int i = 0; i < marks.length; i++) {
            // Ask user to input each mark
            System.out.println("Mark " + (i + 1) + ":");
            // Fill spot
            marks[i] = input.nextDouble();
        }
        
        // Sort array from highest to lowest mark
            // BubbleSorting method
        
        // 
        
 
        // Output the array
    }
}
