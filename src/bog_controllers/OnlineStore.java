package bog_controllers;

import java.util.Scanner;
import static java.lang.System.exit;

import bog_views.GestionOS;

public class OnlineStore {
    private static GestionOS gestionOS = new GestionOS();

    public static void printMenu(String[] options) {
        System.out.println("");
        System.out.println("            ONLINE STORE MENU          ");
        System.out.println("---------------------------------------\n");
        for (String option : options) {
            System.out.println("    " + option);
        }
    }

    public static void main(String[] args) throws Exception {

        // Show menu
        String[] options = {
                "Create new customer.........: [1]",
                "Create new product..........: [2]",
                "Create new order............: [3]",
                "Delete order................: [4]",
                "Exit........................: [0]",
        };
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        int option = 1;
        while (option != 0) {
            printMenu(options);
            try {
                option = scanner.nextInt();
                switch (option) {
                    case 1:
                        gestionOS.createCustomer(scanner);
                        break;
                    case 2:
                        gestionOS.createProduct(scanner);
                        break;
                    case 3:
                        gestionOS.createOrder(scanner);
                        break;
                    case 0:
                        scanner.close();
                        exit(0);
                }
            } catch (Exception e) {
                System.out.println("Please select a valid menu option");
                scanner.next();
            }
        }

    }
}
