package ModelDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Entity.Room;

public class RoomDAO {

    // INSERT
    public void addRoom(Room r) {

        try {

            Connection con = DBUtil.makeConnection();

            String sql =
            "INSERT INTO rooms(room_number, room_type, price_per_day, room_status) VALUES(?,?,?,?)";

            PreparedStatement pst =
                    con.prepareStatement(sql);

            pst.setString(1, r.getRoomNumber());
            pst.setString(2, r.getRoomType());
            pst.setDouble(3, r.getPricePerDay());
            pst.setString(4, r.getRoomStatus());

            int i = pst.executeUpdate();

            if(i > 0) {
                System.out.println("Room Added");
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    // VIEW
    public void viewRooms() {

        try {

            Connection con = DBUtil.makeConnection();

            String sql = "SELECT * FROM rooms";

            PreparedStatement pst =
                    con.prepareStatement(sql);

            ResultSet rs = pst.executeQuery();

            while(rs.next()) {

                System.out.println(
                        rs.getInt("room_id") + " "
                      + rs.getString("room_number") + " "
                      + rs.getString("room_type") + " "
                      + rs.getDouble("price_per_day") + " "
                      + rs.getString("room_status"));
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    // UPDATE
    public void updateRoomPrice(int id, double price) {

        try {

            Connection con = DBUtil.makeConnection();

            String sql =
            "UPDATE rooms SET price_per_day=? WHERE room_id=?";

            PreparedStatement pst =
                    con.prepareStatement(sql);

            pst.setDouble(1, price);
            pst.setInt(2, id);

            int i = pst.executeUpdate();

            if(i > 0) {
                System.out.println("Room Updated");
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void deleteRoom(int id) {

        try {

            Connection con = DBUtil.makeConnection();

            String sql =
            "DELETE FROM rooms WHERE room_id=?";

            PreparedStatement pst =
                    con.prepareStatement(sql);

            pst.setInt(1, id);

            int i = pst.executeUpdate();

            if(i > 0) {
                System.out.println("Room Deleted");
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}