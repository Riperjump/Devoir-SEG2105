package pointcp.design2;

// This file contains material supporting section 2.9 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at http://www.site.uottawa.ca/school/research/lloseng/

import java.io.*;
import java.util.Scanner;

/**
 * This class prompts the user for a set of coordinates, and then
 * converts them from polar to cartesian or vice-versa.
 *
 * @author Fran&ccedil;ois B&eacute;langer
 * @author Dr Timothy C. Lethbridge
 * @author Paul Holden
 * @version July 2000
 */
public class PointCP2Test {
    // Class methods *****************************************************

    /**
     * This method is responsible for the creation of the PointCP2
     * object. This can be done in two ways; the first, by using the
     * command line and running the program using <code> java 
     * PointCPTest &lt;coordtype (c/p)&gt; &lt;X/RHO&gt; &lt;Y/THETA&gt;
     * </code> and the second by getting the program to prompt the user.
     * If the user does not enter a valid sequence at the command line,
     * the program will prompte him or her.
     *
     * modified version for design 2
     * 
     * @param args[1] The value of X or RHO.
     * @param args[2] The value of Y or THETA.
     */
    public static void main(String[] args) {
        PointCP2 point;

        System.out.println("Cartesian-Polar Coordinates Conversion Program");

        // Check if the user input coordinates from the command line
        // If he did, create the PointCP2 object from these arguments.
        // If he did not, prompt the user for them.
        try {
            point = new PointCP2(
                    Double.valueOf(args[1]).doubleValue(),
                    Double.valueOf(args[2]).doubleValue());
        } catch (Exception e) {
            // If we arrive here, it is because either there were no
            // command line arguments, or they were invalid
            if (args.length != 0)
                System.out.println("Invalid arguments on command line");

            try {
                point = getInput();
            } catch (Exception ex) {
                System.out.println("Error getting input. Ending program.");
                return;
            }
        }
        System.out.println("\nYou entered:\n" + point);
    }

    /**
     * This method obtains input from the user and verifies that
     * it is valid. When the input is valid, it returns a PointCP2
     * object.
     *
     * @return A PointCP2 constructed using information obtained
     *         from the user.
     */
    private static PointCP2 getInput() {

        Scanner scanner = new Scanner(System.in);

        String input;

        double a = 0.0;
        double b = 0.0;

        // Read the first coordinate
        boolean readOk = false; // flag that indicates whether the coordinate value is valid

        while (!readOk) {

            System.out.print("Enter the value of Rho using a decimal point(.)");

            input = scanner.next();

            try {

                a = Double.valueOf(input).doubleValue();
                readOk = true;
            } catch (NumberFormatException e) {
                readOk = false;
                System.out.println("Incorrect input. Please enter a valid decimal number.");
            }

        }

        // Read the second coordinate
        readOk = false; // reset the flag
        while (!readOk) {

            System.out.print("Enter the value of Theta using a decimal point(.)");

            input = scanner.next();

            try {

                b = Double.valueOf(input).doubleValue();
                readOk = true;
            } catch (NumberFormatException e) {
                readOk = false;
                System.out.println("Incorrect input. Please enter a valid decimal number.");
            }

        }

        scanner.close(); // close the scanner

        // Return a new PointCP2 object
        return (new PointCP2(a, b));
    }
}
