
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author schum0689
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create scanner
        Scanner input = new Scanner(System.in);
        // Ask user to input # of people
        System.out.println("Number of people in group:");
        // Store # of people
        int people = input.nextInt();

        // Create array for the height of each person
        int[] height = new int[people];
        // Loop to populate array
        for (int i = 0; i < height.length; i++) {
            // Ask user to input the height of 
            System.out.println("Height of person " + (i + 1) + " to the nearest cm:");
            // Fill spot
            height[i] = input.nextInt();
        }
        // Store total sum of array
        int sum = 0;
        // Find each height in array
        for (int i = 0; i < height.length; i++) {
            // Add height to total sum
            sum = sum + height[i];
        }
        // Calculate the average height
        int average = Math.round(sum / height.length);

        // Tell user what next numbers are
        System.out.println("Above average heights:");
        // Go through each height value in the array
        for (int i = 0; i < height.length; i++) {
            // If the value is above the group's average value
            if (height[i] > average) {
                // Output the height
                System.out.println(height[i]);
            }
        }
    }
}
