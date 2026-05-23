package View;

import java.util.Scanner;

import Entity.Customer;

public class CustomerView {

    Scanner sc = new Scanner(System.in);

    // MENU
    public int menu() {

        System.out.println("\n===== CUSTOMER MENU =====");

        System.out.println("1. Add Customer");
        System.out.println("2. View Customer");
        System.out.println("3. Update Customer");
        System.out.println("4. Delete Customer");
        System.out.println("5. Back");

        System.out.print("Enter Choice : ");

        return sc.nextInt();
    }

    // GET CUSTOMER DATA
    public Customer getCustomerData() {

        Customer c = new Customer();

        sc.nextLine();

        System.out.print("Enter Customer Name : ");
        c.setCustomerName(sc.nextLine());

        System.out.print("Enter Gender : ");
        c.setGender(sc.nextLine());

        System.out.print("Enter Phone : ");
        c.setPhone(sc.nextLine());

        System.out.print("Enter Email : ");
        c.setEmail(sc.nextLine());

        System.out.print("Enter Address : ");
        c.setAddress(sc.nextLine());

        System.out.print("Enter ID Proof : ");
        c.setIdProof(sc.nextLine());

        return c;
    }
}