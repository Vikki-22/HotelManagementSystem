package View;

import java.util.Scanner;

import Entity.Payment;

public class PaymentView {

    Scanner sc = new Scanner(System.in);

    // MENU
    public int menu() {

        System.out.println("\n===== PAYMENT MENU =====");

        System.out.println("1. Add Payment");
        System.out.println("2. View Payment");
        System.out.println("3. Back");

        System.out.print("Enter Choice : ");

        return sc.nextInt();
    }

    // GET PAYMENT DATA
    public Payment getPaymentData() {

        Payment p = new Payment();

        System.out.print("Enter Reservation ID : ");
        p.setReservationId(sc.nextInt());

        sc.nextLine();

        System.out.print("Enter Payment Date : ");
        p.setPaymentDate(sc.nextLine());

        System.out.print("Enter Payment Amount : ");
        p.setPaymentAmount(sc.nextDouble());

        sc.nextLine();

        System.out.print("Enter Payment Method : ");
        p.setPaymentMethod(sc.nextLine());

        System.out.print("Enter Payment Status : ");
        p.setPaymentStatus(sc.nextLine());

        return p;
    }
}