import java.util.ArrayList;
import java.util.Scanner;

class Expense {
    String category;
    double amount;

    Expense(String category, double amount) {
        this.category = category;
        this.amount = amount;
    }

    void displayExpense() {
        System.out.println("Category: " + category);
        System.out.println("Amount: ₹" + amount);
    }
}

public class ExpenseTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Expense> expenses = new ArrayList<>();

        int choice;
        double total = 0;

        do {
            System.out.println("\n===== STUDENT EXPENSE TRACKER =====");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. View Total Spending");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter expense category: ");
                    String category = sc.nextLine();

                    System.out.print("Enter amount: ");
                    double amount = sc.nextDouble();

                    Expense e = new Expense(category, amount);

                    expenses.add(e);

                    total += amount;

                    System.out.println("Expense added successfully!");
                    break;

                case 2:

                    if (expenses.isEmpty()) {
                        System.out.println("No expenses recorded.");
                    } else {

                        System.out.println("\n----- Expense History -----");

                        for (Expense exp : expenses) {
                            exp.displayExpense();
                            System.out.println();
                        }
                    }

                    break;

                case 3:

                    System.out.println("Total Spending: ₹" + total);
                    break;

                case 4:

                    System.out.println("Exiting program...");
                    break;

                default:

                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
