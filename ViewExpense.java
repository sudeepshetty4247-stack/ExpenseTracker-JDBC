package jdbcproject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ViewExpense {

    public void view() {

        try {

            Connection con = DBConnection.getConnection();

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("select * from expenses");

            System.out.println("\nExpenses List:");

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("title") + " | " +
                        rs.getDouble("amount") + " | " +
                        rs.getString("category")
                );

            }

        } catch (Exception e) {
            System.out.println("Error showing expenses");
        }

    }
}