
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author schum0689
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Create an integer array with known values
        int[] myNums = {5, 2, -3, 10, 7};
        
        // Print the array
        System.out.println("Array: " + myNums);
        // Go through each spot in array
        for(int i = 0; i < 5; i++){
            // i counts, starting from 0
            System.out.println(myNums[i]);
        }
        
        // Multiply 2 spots together
        int product = myNums[0] + myNums[1];
        // Sets spot 2 equal to the product
        myNums[2] = product;
        
        // Create an array to store 5 marks
        double[] marks = new double[5];
        // Get the user to fill the array
        // .length allows for 
        for(int i = 0; i < marks.length; i++){
            // Tell user what to do
            System.out.println("Enter mark:");
            marks[i] = input.nextDouble();
        }
        // Print the array
        System.out.println("You entered in these marks: ");
        for(int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }
        
        //double total = marks[0] + marks[1] + marks[2] + marks[3] + marks[4] + marks[5]; ... OR
        
        // Add all the numbers using a loop
        // Start a total at 0
        double total = 0;
        // Go through each number
        for(int i = 0; i < marks.length; i++){
            // Add the number into total
            total = total + marks[i];
        }
        System.out.println("Total = " + total);
        
        // Calculate the average
        double average = total / marks.length;
        
        System.out.println("Average = " + average);
        
        // Two dimensional array example
        char[][] grid = new char [3][3];
        grid[0][0] = 'x';
        grid[1][1] = 'o';
        grid[2][2] = 'x';
    }
}
