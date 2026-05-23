package View;

import java.util.Scanner;

import Entity.Reservation;

public class ReservationView {

    Scanner sc = new Scanner(System.in);

    // MENU
    public int menu() {

        System.out.println("\n===== RESERVATION MENU =====");

        System.out.println("1. Book Room");
        System.out.println("2. View Reservation");
        System.out.println("3. Cancel Reservation");
        System.out.println("4. Back");

        System.out.print("Enter Choice : ");

        return sc.nextInt();
    }

    // GET RESERVATION DATA
    public Reservation getReservationData() {

        Reservation r = new Reservation();

        System.out.print("Enter Customer ID : ");
        r.setCustomerId(sc.nextInt());

        System.out.print("Enter Room ID : ");
        r.setRoomId(sc.nextInt());

        sc.nextLine();

        System.out.print("Enter Check In Date (yyyy-mm-dd) : ");
        r.setCheckInDate(sc.nextLine());

        System.out.print("Enter Check Out Date (yyyy-mm-dd) : ");
        r.setCheckOutDate(sc.nextLine());

        System.out.print("Enter Total Days : ");
        r.setTotalDays(sc.nextInt());

        System.out.print("Enter Total Amount : ");
        r.setTotalAmount(sc.nextDouble());

        sc.nextLine();

        System.out.print("Enter Booking Status : ");
        r.setBookingStatus(sc.nextLine());

        return r;
    }
}