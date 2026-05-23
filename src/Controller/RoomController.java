package Controller;

import java.util.Scanner;

import ModelDAO.RoomDAO;
import Entity.Room;
import View.RoomView;

public class RoomController {

    public static void start() {

        RoomView view = new RoomView();

        RoomDAO dao = new RoomDAO();

        try (Scanner sc = new Scanner(System.in)) {
			while (true) {

			    int ch = view.menu();

			    switch (ch) {

			    case 1:

			        Room r = view.getRoomData();

			        dao.addRoom(r);

			        break;

			    case 2:

			        dao.viewRooms();

			        break;

			    case 3:

			        System.out.print("Enter Room ID : ");
			        int id = sc.nextInt();

			        System.out.print("Enter New Price : ");
			        double price = sc.nextDouble();

			        dao.updateRoomPrice(id, price);

			        break;

			    case 4:

			        System.out.print("Enter Room ID : ");
			        int did = sc.nextInt();

			        dao.deleteRoom(did);

			        break;

			    case 5:

			        return;

			    default:

			        System.out.println("Invalid Choice");
			    }
			}
		}
    }
}