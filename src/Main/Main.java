package Main;

import Controller.CustomerController;
import Controller.PaymentController;
import Controller.ReservationController;
import Controller.RoomController;
import Controller.StaffController;



public class Main {

    public static void main(String[] args) {

        MainView view = new MainView();

        while(true) {

            int ch = view.mainMenu();

            switch(ch) {

            case 1:
                CustomerController.start();
                break;

            case 2:
                RoomController.start();
                break;

            case 3:
                ReservationController.start();
                break;

            case 4:
                PaymentController.start();
                break;

            case 5:
                StaffController.start();
                break;

            case 6:
                System.out.println("Thank You...");
                System.exit(0);

            default:
                System.out.println("Invalid Choice");
            }
        }
    }
}