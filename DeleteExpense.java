package jdbcproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteExpense {

    public void delete() {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter expense ID to delete: ");
            int id = sc.nextInt();

            Connection con = DBConnection.getConnection();

            String sql = "delete from expenses where id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("Expense deleted");

        } catch (Exception e) {
            System.out.println("Delete error");
        }

    }
}