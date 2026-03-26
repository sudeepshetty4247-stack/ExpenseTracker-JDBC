package jdbcproject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class TotalExpense {

    public void showTotal() {

        try {

            Connection con = DBConnection.getConnection();

            Statement st = con.createStatement();

            String sql = "select sum(amount) as total from expenses";

            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {

                double total = rs.getDouble("total");

                System.out.println("\nTotal Expense = " + total);

            }

        } catch (Exception e) {

            System.out.println("Error calculating total");

        }

    }

}