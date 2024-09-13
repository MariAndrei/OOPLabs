package Lab1Project;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        String investment;
        int fund;
        double sharePrice;

        String investment2;
        int fund2;
        double sharePrice2;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the investment type: ");
        investment = input.nextLine();

        System.out.print("Enter the fund: ");
        fund = input.nextInt();

        System.out.print("Enter the share price: ");
        sharePrice = input.nextDouble();

        System.out.print("Enter the second investment type: ");
        investment2 = input.nextLine();

        System.out.print("Enter the second fund: ");
        fund2 = input.nextInt();

        System.out.print("Enter the second share price: ");
        sharePrice2 = input.nextDouble();



        System.out.println(String.format("%-20s%-15s%s\n%-20s%-15s%s",
                "Investment Type", "# Shares", "Share Price",
                "---------------", "--------", "-----------"));

        System.out.println(String.format("%-20s-15f%.3f\n%-20s-15f%.3f",
                investment, fund, sharePrice, investment2, fund2, sharePrice2));

    }
}
