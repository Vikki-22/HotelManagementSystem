package ModelDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Entity.Staff;


public class StaffDAO {

    // INSERT
    public void addStaff(Staff s) {

        try {

            Connection con = DBUtil.makeConnection();

            String sql =
            "INSERT INTO staff(staff_name, role, phone, salary, shift_timing) VALUES(?,?,?,?,?)";

            PreparedStatement pst =
                    con.prepareStatement(sql);

            pst.setString(1, s.getStaffName());
            pst.setString(2, s.getRole());
            pst.setString(3, s.getPhone());
            pst.setDouble(4, s.getSalary());
            pst.setString(5, s.getShiftTiming());

            int i = pst.executeUpdate();

            if(i > 0) {
                System.out.println("Staff Added");
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    // VIEW
    public void viewStaff() {

        try {

            Connection con = DBUtil.makeConnection();

            String sql = "SELECT * FROM staff";

            PreparedStatement pst =
                    con.prepareStatement(sql);

            ResultSet rs = pst.executeQuery();

            while(rs.next()) {

                System.out.println(
                        rs.getInt("staff_id") + " "
                      + rs.getString("staff_name") + " "
                      + rs.getString("role") + " "
                      + rs.getDouble("salary"));
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void deleteStaff(int id) {

        try {

            Connection con = DBUtil.makeConnection();

            String sql =
            "DELETE FROM staff WHERE staff_id=?";

            PreparedStatement pst =
                    con.prepareStatement(sql);

            pst.setInt(1, id);

            int i = pst.executeUpdate();

            if(i > 0) {
                System.out.println("Staff Deleted");
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}