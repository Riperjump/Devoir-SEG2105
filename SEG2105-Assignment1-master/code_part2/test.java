package code_part2;

import java.lang.reflect.Array;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Employee Employee = getInput();
    }

    /**
     * @return
     */
    public static Employee getInput() {
        Scanner scanner = new Scanner(System.in);
        boolean isOK = false;
        String name = "d";
        int hours = 0;
        double rate = 0;
        int nbr = 0;
        Address Addresslist[] = new Address[100];
        for (int j = 0; j < 4; j++) {
            isOK = false;
            while (!(isOK)) {
                isOK = true;
                // prompt the user
                try {
                    if (j == 0) {
                        System.out.println("Bienvenue dans le programme d'enregistrement d'employes.");
                        System.out.println("Quelle est votre nom");
                        name = scanner.nextLine();
                    }
                    if (j == 1) {
                        System.out.println("Quelle est votre nombre d'heures");
                        hours = scanner.nextInt();
                    }
                    if (j == 2) {
                        System.out.println("Quelle est votre salaire par heures");
                        rate = scanner.nextDouble();
                    }
                    if (j == 3) {
                        System.out.println("Combien d'addresses Avez vous");
                        nbr = scanner.nextInt();
                        for (int i = 1; i <= nbr; i++) {
                            String street;
                            String postal;
                            int number;
                            System.out.println("Entrez l'adresse numero" + " " + i);
                            System.out.println("Street:");
                            street = scanner.nextLine();
                            System.out.println("Code postal:");
                            postal = scanner.nextLine();
                            System.out.println("numero:");
                            number = scanner.nextInt();
                            Address adr = new Address(street, number, postal);
                            Addresslist[i - 1] = adr;

                        }
                    }
                } catch (Exception e) {
                    System.out.println("Incorrect input");
                    isOK = false;
                }
            }
        }
        System.out.println("Profil cree!");
        Employee p = new Employee(name, hours, rate, Addresslist);
        return p;
    }

}
