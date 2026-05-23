package View;

import java.util.Scanner;

import Entity.Room;

public class RoomView {

    Scanner sc = new Scanner(System.in);

    // MENU
    public int menu() {

        System.out.println("\n===== ROOM MENU =====");

        System.out.println("1. Add Room");
        System.out.println("2. View Rooms");
        System.out.println("3. Update Room");
        System.out.println("4. Delete Room");
        System.out.println("5. Back");

        System.out.print("Enter Choice : ");

        return sc.nextInt();
    }

    // GET ROOM DATA
    public Room getRoomData() {

        Room r = new Room();

        sc.nextLine();

        System.out.print("Enter Room Number : ");
        r.setRoomNumber(sc.nextLine());

        System.out.print("Enter Room Type : ");
        r.setRoomType(sc.nextLine());

        System.out.print("Enter Price Per Day : ");
        r.setPricePerDay(sc.nextDouble());

        sc.nextLine();

        System.out.print("Enter Room Status : ");
        r.setRoomStatus(sc.nextLine());

        return r;
    }
}