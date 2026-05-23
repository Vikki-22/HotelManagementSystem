package Controller;

import java.util.Scanner;

import ModelDAO.StaffDAO;
import Entity.Staff;
import View.StaffView;

public class StaffController {

    public static void start() {

        StaffView view = new StaffView();

        StaffDAO dao = new StaffDAO();

        try (Scanner sc = new Scanner(System.in)) {
			while (true) {

			    int ch = view.menu();

			    switch (ch) {

			    case 1:

			        Staff s = view.getStaffData();

			        dao.addStaff(s);

			        break;

			    case 2:

			        dao.viewStaff();

			        break;

			    case 3:

			        System.out.print("Enter Staff ID : ");

			        int id = sc.nextInt();

			        dao.deleteStaff(id);

			        break;

			    case 4:

			        return;

			    default:

			        System.out.println("Invalid Choice");
			    }
			}
		}
    }
}