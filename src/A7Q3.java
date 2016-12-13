
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author schum0689
 */
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create array to store two integers
        int[] A = new int[2];
        // Create scanner
        Scanner input = new Scanner(System.in);
        // Ask user to input integers
        System.out.println("Enter two integers:");
        // Store first integer
        int first = input.nextInt();
        // Fill first spot in array
        A[0] = first;
        // Store second integer
        int second = input.nextInt();
        // Fill second spot in array
        A[1] = second;

        // If the first value is larger
        if (first > second) {
            // Interchange the values
            A[1] = first;
            A[0] = second;
        }
        // If the second value is larger; already sorted
        // If both values are equal; already sorted
        
        // Ouput sorted array to user
        System.out.println("The integers in ascending order are:");
        // Loop to output the sorted values
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }
}
