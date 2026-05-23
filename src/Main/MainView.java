package Main;

import java.util.Scanner;

public class MainView {

    Scanner sc = new Scanner(System.in);

    public int mainMenu() {

        System.out.println("\n===== HOTEL RESERVATION SYSTEM =====");

        System.out.println("1. Customer Management");
        System.out.println("2. Room Management");
        System.out.println("3. Reservation Management");
        System.out.println("4. Payment Management");
        System.out.println("5. Staff Management");
        System.out.println("6. Exit");

        System.out.print("Enter Choice : ");

        return sc.nextInt();
    }
}