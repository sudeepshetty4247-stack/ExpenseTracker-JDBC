package jdbcproject;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AddExpense add = new AddExpense();
        ViewExpense view = new ViewExpense();
        DeleteExpense del = new DeleteExpense();
        TotalExpense total = new TotalExpense();

        while (true) {

            System.out.println("\n---- Expense Tracker ----");
            System.out.println("1 Add Expense");
            System.out.println("2 View Expenses");
            System.out.println("3 Delete Expense");
            System.out.println("4 Show Total Expense");
            System.out.println("5 Exit");

            System.out.print("Enter choice: ");

            int ch = sc.nextInt();

            if (ch == 1) {
                add.add();
            }

            else if (ch == 2) {
                view.view();
            }

            else if (ch == 3) {
                del.delete();
            }

            else if (ch == 4) {
                total.showTotal();
            }

            else if (ch == 5) {
                System.out.println("Program ended");
                break;
            }

            else {
                System.out.println("Invalid option");
            }

        }

    }
}