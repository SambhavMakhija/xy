import java.util.Scanner;

public class BankApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 0;
        int choice;

        System.out.println("🔥 Welcome to Chill Bank 🔥");

        while (true) {
            System.out.println("\nWhat you wanna do? 💼");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Cash");
            System.out.println("3. Withdraw Cash");
            System.out.println("4. Exit");

            System.out.print("Your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("💰 Your Balance: ₹" + balance);
                    break;
                
                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    double deposit = sc.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("✅ ₹" + deposit + " deposited successfully!");
                    } else {
                        System.out.println("Bruh, enter a valid amount 😑");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdraw = sc.nextDouble();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("✅ ₹" + withdraw + " withdrawn successfully!");
                    } else if (withdraw > balance) {
                        System.out.println("You broke fam, insufficient funds 🥲");
                    } else {
                        System.out.println("Bruh, enter a valid amount 😑");
                    }
                    break;

                case 4:
                    System.out.println("👋 Thanks for banking with us, peace out!");
                    return;

                default:
                    System.out.println("Invalid option, pick again fam 🚫");
            }
        }
    }
}
