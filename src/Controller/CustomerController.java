package Controller;

import java.util.Scanner;

import ModelDAO.CustomerDAO;
import Entity.Customer;
import View.CustomerView;

public class CustomerController {

    public static void start() {

        CustomerView view = new CustomerView();

        CustomerDAO dao = new CustomerDAO();

        Scanner sc = new Scanner(System.in);

        while (true) {

            int ch = view.menu();

            switch (ch) {

            case 1:

                Customer c = view.getCustomerData();

                dao.addCustomer(c);

                break;

            case 2:

                dao.viewCustomers();

                break;

            case 3:

                System.out.print("Enter Customer ID : ");
                int id = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter New Phone : ");
                String phone = sc.nextLine();

                dao.updateCustomerPhone(id, phone);

                break;

            case 4:

                System.out.print("Enter Customer ID : ");
                int did = sc.nextInt();

                dao.deleteCustomer(did);

                break;

            case 5:

                return;

            default:

                System.out.println("Invalid Choice");
            }
        }
    }
}