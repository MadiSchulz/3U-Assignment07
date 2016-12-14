
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
            System.out.println("Enter mark " + (i + 1) + ":");
            // Fill spot
            marks[i] = input.nextDouble();
        }
        
        // Loop to obtain all spots in the array
        for (int x = 0; x < marks.length; x++){
            // Loop to sort the values
            for(int y = 0; y < marks.length; y++){
                // If spot x is greater than spot y
                if (x > y){
                    // Store value of x (otherwise erased)
                    double storeValueX = marks[x];
                    // Spot x is filled with y
                    marks[x] = y;
                    // Spot y is filled with the stored x value
                    marks[y] = x;
                }     
            }
        }
            
        
        // 
        
 
         // Ouput sorted array to user
        System.out.println("The integers in ascending order are:");
        // Loop to output the sorted values
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}
