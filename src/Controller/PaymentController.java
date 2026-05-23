package Controller;

import java.util.Scanner;

import ModelDAO.PaymentDAO;
import Entity.Payment;
import View.PaymentView;

public class PaymentController {

    public static void start() {

        PaymentView view = new PaymentView();

        PaymentDAO dao = new PaymentDAO();

        Scanner sc = new Scanner(System.in);

        while (true) {

            int ch = view.menu();

            switch (ch) {

            case 1:

                Payment p = view.getPaymentData();

                dao.addPayment(p);

                break;

            case 2:

                dao.viewPayments();

                break;

          

            case 3:

                return;

            default:

                System.out.println("Invalid Choice");
            }
        }
    }
}