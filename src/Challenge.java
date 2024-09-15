import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String client = "Steve Jobs";
        String accountType = "Current";
        double balance = 10000;
        int opc = 0;

        System.out.println("=============================================");
        System.out.printf("            Client name %s%n", client);
        System.out.printf("            Account type: %s%n", accountType);
        System.out.printf("            Available balance: $%f%n", balance);
        System.out.println("=============================================");

        while (opc != 9) {
            System.out.println("\n||Write the number of your option||");
            System.out.println("1 - Check balance");
            System.out.println("2 - Withdraw");
            System.out.println("3 - Deposit");
            System.out.println("9 - Log off");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    System.out.printf("\n--Your current balance is: $%f%n", balance);
                    break;
                case 2:
                    System.out.println("\n--How much do you want to withdraw?");
                    double withdraw = sc.nextDouble();
                    if (withdraw > balance) {
                        System.out.println("Insufficient balance--");
                    } else {
                        balance -= withdraw;
                        System.out.printf("--Remaining balance: $%f%n", balance);
                    }
                    break;
                case 3:
                    System.out.println("\n--How much do you want to deposit?");
                    double depositedBalance = sc.nextDouble();
                    System.out.printf("--Actual balance: $%f%n", depositedBalance);
                    break;
                case 9:
                    System.out.println("\nLogging off... see you!");
                    break;
                default:

            }
        }
    }
}
