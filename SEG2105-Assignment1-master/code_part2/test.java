package code_part2;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        try {
            Employee Employee = getInput();
            System.out.println("BIEN ENREGISTRE");
            System.err.println(Employee);
        } catch (Exception e) {
            System.out.println("ERRORRRRRR");
        }
    }

    /**
     * @return
     */
    public static Employee getInput() throws IOException {
        byte[] buffer = new byte[1024]; // Buffer to hold byte input
        boolean isOK = false; // Flag set if input correct
        String theInput = ""; // Input information
        String theInput1 = "";

        // Information for the constructor
        String name = "d";
        int hours = 0;
        double rate = 0;
        int nbr = 0;
        Address Addresslist[] = new Address[100];

        for (int i = 0; i < 10; i++) {
            while (!(isOK)) {
                isOK = true;
                if (i == 0) {
                    System.out.println("Bienvenue dans le systeme d'enregistrement d'employes");
                    System.out.print("Quelle est votre nom: ");
                } else if (i == 1) {
                    System.out.print("Quelle est votre nombre d'heures: ");
                } else if (i == 2) {
                    System.out.print("Quelle est votre salaire par heures: ");
                } else if (i == 3) {
                    System.out.print("Combien d'addresses Avez vous: ");
                }

                // Get the user's input

                // Initialize the buffer before we read the input
                for (int k = 0; k < 1024; k++)
                    buffer[k] = '\u0020';

                System.in.read(buffer);
                theInput = new String(buffer).trim();

                try {
                    if (i == 0) {
                        name = theInput;
                    }
                    if (i == 1) {
                        hours = Integer.parseInt(theInput);
                    }
                    if (i == 2) {
                        rate = Double.parseDouble(theInput);
                    }
                    if (i == 3) {
                        nbr = Integer.parseInt(theInput);
                        for (int k = 0; k < nbr; k++) {
                            String street = "a";
                            String postal = "a";
                            int number = 0;
                            for (int j = 0; j < 3; j++) {
                                boolean isOK1 = false;
                                while (!(isOK1)) {
                                    isOK1 = true;
                                    if (j == 0) {
                                        System.out.println("Entrez l'adresse numero" + " " + k);
                                        System.out.print("Street:");
                                    }
                                    if (j == 1) {
                                        System.out.print("numero:");
                                    }
                                    if (j == 2) {
                                        System.out.print("Code postal:");
                                    }
                                    for (int o = 0; o < 1024; o++)
                                        buffer[o] = '\u0020';

                                    System.in.read(buffer);
                                    theInput1 = new String(buffer).trim();
                                    try {
                                        if (j == 0) {
                                            street = theInput1;
                                        }
                                        if (j == 1) {
                                            number = Integer.parseInt(theInput1);
                                        }
                                        if (j == 2) {
                                            postal = theInput1;
                                        }

                                    } catch (Exception e) {
                                        System.out.println("Incorrect input");
                                        isOK1 = false; // Reset flag as so not to end while loop
                                    }
                                }
                                isOK1 = false;
                            }
                            Address adr = new Address(street, number, postal);
                            Addresslist[k] = adr;

                        }
                    }
                } catch (Exception e) {
                    System.out.println("Incorrect input");
                    isOK = false; // Reset flag as so not to end while loop
                }
            }
            isOK = false;
        }
        return new Employee(name, hours, rate, Addresslist);
    }

}
