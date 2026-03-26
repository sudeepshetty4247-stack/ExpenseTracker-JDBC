package jdbcproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class AddExpense {

    public void add() {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter title: ");
            String title = sc.nextLine();

            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter category: ");
            String category = sc.nextLine();

            Connection con = DBConnection.getConnection();

            String sql = "insert into expenses(title,amount,category) values(?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, title);
            ps.setDouble(2, amount);
            ps.setString(3, category);

            ps.executeUpdate();

            System.out.println("Expense added");

        } catch (Exception e) {
            System.out.println("Error adding expense");
        }

    }
}