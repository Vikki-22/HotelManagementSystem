package ModelDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Entity.Reservation;
import ModelDAO.DBUtil;

public class ReservationDAO {

    // INSERT
    public void addReservation(Reservation r) {

        try {

            Connection con = DBUtil.makeConnection();

            String sql =
            "INSERT INTO reservations(customer_id, room_id, check_in_date, check_out_date, total_days, total_amount, booking_status) VALUES(?,?,?,?,?,?,?)";

            PreparedStatement pst =
                    con.prepareStatement(sql);

            pst.setInt(1, r.getCustomerId());
            pst.setInt(2, r.getRoomId());
            pst.setString(3, r.getCheckInDate());
            pst.setString(4, r.getCheckOutDate());
            pst.setInt(5, r.getTotalDays());
            pst.setDouble(6, r.getTotalAmount());
            pst.setString(7, r.getBookingStatus());

            int i = pst.executeUpdate();

            if(i > 0) {
                System.out.println("Reservation Added");
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    // VIEW
    public void viewReservations() {

        try {

            Connection con = DBUtil.makeConnection();

            String sql = "SELECT * FROM reservations";

            PreparedStatement pst =
                    con.prepareStatement(sql);

            ResultSet rs = pst.executeQuery();

            while(rs.next()) {

                System.out.println(
                        rs.getInt("reservation_id") + " "
                      + rs.getInt("customer_id") + " "
                      + rs.getInt("room_id") + " "
                      + rs.getString("check_in_date") + " "
                      + rs.getDouble("total_amount"));
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void deleteReservation(int id) {

        try {

            Connection con = DBUtil.makeConnection();

            String sql =
            "DELETE FROM reservations WHERE reservation_id=?";

            PreparedStatement pst =
                    con.prepareStatement(sql);

            pst.setInt(1, id);

            int i = pst.executeUpdate();

            if(i > 0) {
                System.out.println("Reservation Deleted");
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}