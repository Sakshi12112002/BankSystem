import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account Holder Name:");
        String name = sc.nextLine();
        System.out.println("Enter Account Number:");
        String accNo = sc.nextLine();
        System.out.println("Enter Initial Deposit Amount:");
        double deposit = sc.nextDouble();

        BankAccount account = new BankAccount(name, accNo, deposit);
        System.out.println("\nAccount created successfully!\n");

        int choice;
        do {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Display Account Info");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double d = sc.nextDouble();
                    account.deposit(d);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double w = sc.nextDouble();
                    account.withdraw(w);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    account.displayAccountInfo();
                    break;
                case 5:
                    System.out.println("Thank you for using the system.");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);

        sc.close();
    }
}
