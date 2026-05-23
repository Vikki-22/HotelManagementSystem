package Controller;

import java.util.Scanner;

import ModelDAO.ReservationDAO;
import Entity.Reservation;
import View.ReservationView;

public class ReservationController {

    public static void start() {

        ReservationView view =
                new ReservationView();

        ReservationDAO dao =
                new ReservationDAO();

        Scanner sc = new Scanner(System.in);

        while (true) {

            int ch = view.menu();

            switch (ch) {

            case 1:

                Reservation r =
                        view.getReservationData();

                dao.addReservation(r);

                break;

            case 2:

                dao.viewReservations();

                break;

            case 3:

                System.out.print("Enter Reservation ID : ");

                int id = sc.nextInt();

                dao.deleteReservation(id);

                break;

            case 4:

                return;

            default:

                System.out.println("Invalid Choice");
            }
        }
    }
}