package ModelDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Entity.Payment;

public class PaymentDAO {

    // INSERT
    public void addPayment(Payment p) {

        try {

            Connection con = DBUtil.makeConnection();

            String sql =
            "INSERT INTO payments(reservation_id, payment_date, payment_amount, payment_method, payment_status) VALUES(?,?,?,?,?)";

            PreparedStatement pst =
                    con.prepareStatement(sql);

            pst.setInt(1, p.getReservationId());
            pst.setString(2, p.getPaymentDate());
            pst.setDouble(3, p.getPaymentAmount());
            pst.setString(4, p.getPaymentMethod());
            pst.setString(5, p.getPaymentStatus());

            int i = pst.executeUpdate();

            if(i > 0) {
                System.out.println("Payment Added");
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    // VIEW
    public void viewPayments() {

        try {

            Connection con = DBUtil.makeConnection();

            String sql = "SELECT * FROM payments";

            PreparedStatement pst =
                    con.prepareStatement(sql);

            ResultSet rs = pst.executeQuery();

            while(rs.next()) {

                System.out.println(
                        rs.getInt("payment_id") + " "
                      + rs.getInt("reservation_id") + " "
                      + rs.getDouble("payment_amount") + " "
                      + rs.getString("payment_status"));
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void deletePayment(int id) {

        try {

            Connection con = DBUtil.makeConnection();

            String sql =
            "DELETE FROM payments WHERE payment_id=?";

            PreparedStatement pst =
                    con.prepareStatement(sql);

            pst.setInt(1, id);

            int i = pst.executeUpdate();

            if(i > 0) {
                System.out.println("Payment Deleted");
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}