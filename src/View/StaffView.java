package View;

import java.util.Scanner;

import Entity.Staff;

public class StaffView {

    Scanner sc = new Scanner(System.in);

    // MENU
    public int menu() {

        System.out.println("\n===== STAFF MENU =====");

        System.out.println("1. Add Staff");
        System.out.println("2. View Staff");
        System.out.println("3. Delete Staff");
        System.out.println("4. Back");

        System.out.print("Enter Choice : ");

        return sc.nextInt();
    }

    // GET STAFF DATA
    public Staff getStaffData() {

        Staff s = new Staff();

        sc.nextLine();

        System.out.print("Enter Staff Name : ");
        s.setStaffName(sc.nextLine());

        System.out.print("Enter Role : ");
        s.setRole(sc.nextLine());

        System.out.print("Enter Phone : ");
        s.setPhone(sc.nextLine());

        System.out.print("Enter Salary : ");
        s.setSalary(sc.nextDouble());

        sc.nextLine();

        System.out.print("Enter Shift Timing : ");
        s.setShiftTiming(sc.nextLine());

        return s;
    }
}