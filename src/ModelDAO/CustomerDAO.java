package ModelDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Entity.Customer;
import ModelDAO.DBUtil;

public class CustomerDAO {

    // INSERT
    public void addCustomer(Customer c) {

        try {

            Connection con = DBUtil.makeConnection();

            String sql =
            "INSERT INTO customers(customer_name, gender, phone, email, address, id_proof) VALUES(?,?,?,?,?,?)";

            PreparedStatement pst =
                    con.prepareStatement(sql);

            pst.setString(1, c.getCustomerName());
            pst.setString(2, c.getGender());
            pst.setString(3, c.getPhone());
            pst.setString(4, c.getEmail());
            pst.setString(5, c.getAddress());
            pst.setString(6, c.getIdProof());

            int i = pst.executeUpdate();

            if(i > 0) {
                System.out.println("Customer Added Successfully");
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    // VIEW
    public void viewCustomers() {

        try {

            Connection con = DBUtil.makeConnection();

            String sql = "SELECT * FROM customers";

            PreparedStatement pst =
                    con.prepareStatement(sql);

            ResultSet rs = pst.executeQuery();

            while(rs.next()) {

                System.out.println(
                        rs.getInt("customer_id") + " "
                      + rs.getString("customer_name") + " "
                      + rs.getString("gender") + " "
                      + rs.getString("phone"));
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    // UPDATE
    public void updateCustomerPhone(int id, String phone) {

        try {

            Connection con = DBUtil.makeConnection();

            String sql =
            "UPDATE customers SET phone=? WHERE customer_id=?";

            PreparedStatement pst =
                    con.prepareStatement(sql);

            pst.setString(1, phone);
            pst.setInt(2, id);

            int i = pst.executeUpdate();

            if(i > 0) {
                System.out.println("Customer Updated");
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void deleteCustomer(int id) {

        try {

            Connection con = DBUtil.makeConnection();

            String sql =
            "DELETE FROM customers WHERE customer_id=?";

            PreparedStatement pst =
                    con.prepareStatement(sql);

            pst.setInt(1, id);

            int i = pst.executeUpdate();

            if(i > 0) {
                System.out.println("Customer Deleted");
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}