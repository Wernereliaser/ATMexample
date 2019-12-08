package atmSample;

import java.util.Scanner;

public class atmsample {

    public static Account accounts = new Account();//Instatiating  classes
    public static Deposit deposits = new Deposit();
    public static Withdraw withdraws = new Withdraw();

    public static String green = "\u001B[32m";
  public static  String yellow = "\u001B[33m";
       public static String blue = "\u001B[34m";
       public static String purple = "\u001B[35m";
    public static  String cyan = "\u001B[36m";
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) { //Main methos starts

        DisplayMenu();

    }// Main method ends

    public static double DepositAmount(int accountNumber, int pin, double deposit) { //Deposit cash method starts

        double balance = accounts.getCurrentBalance();
        System.out.println("Enter Account number");
        accountNumber = scan.nextInt();
        System.out.println("Enter pin number");
        pin = scan.nextInt();
        System.out.println("Enter Deposit Amount");
        deposit = scan.nextDouble();
        if (deposit > 0) {
            if (accountNumber == deposits.getAccountNumber() && pin == deposits.getPinNumber()) {
                balance += deposit;
                accounts.setCurrentBalance(balance);

                System.out.println(cyan+"Amount of N$" + deposit + " succesfully deposited");
                System.out.printf(cyan+"Your new balance is N$%.2f ", balance);
                System.out.println("\n");
                DisplayMenu();
            } else {
                System.out.println(green + "Account number not found\n");
                DisplayMenu();
            }
        } else {
            System.out.println(yellow+"Deposit cannot be 0 or less");
            DisplayMenu();
        }

        return balance;
    }  //Deposit method ends here

    public static void DisplayMenu() {   //The display of user choice
        System.out.println(green + "Main menu");
        System.out.println(green + "1. View my Balance");
        System.out.println(green + "2. Withdraw Cash");
        System.out.println(green + "3. Deposit Fund");
        System.out.println(green + "4. Exit\n");
        System.out.println(green + "Enter your choice:");
        int choice;
        choice = scan.nextInt();

        do {

            switch (choice) {

                case 1:
                    viewBalance();
                    DisplayMenu();
                    break;
                case 2:
                    menuAmount();
                    break;
                case 3:
                    DepositAmount(5, 0, 0); 
                    break;
                case 4:
                    System.exit(0); 
                default:
                    System.out.println(cyan + "Invalid choice\n");
                    DisplayMenu();
            }
        } while (choice != 5);
    }

    public static void viewBalance() {   //view balance method
        System.out.println("Enter your pin number");
        int pinNumber = scan.nextInt();
        if (accounts.getPinNumber() == pinNumber) {  //Atuthentication user

            System.out.println("Account number  :" + accounts.getAccountNumber());

            double balance = accounts.getCurrentBalance() - withdraws.getWithdrawAmount();
            accounts.setCurrentBalance(balance);
            if (balance <= 0) {
                System.out.println("Your Balance is " + balance + " please make a deposit.");
                DisplayMenu();

            } else {
                System.out.printf("Current Balance N$%.2f  ", balance);
                System.out.println("\n");
                DisplayMenu();
            }
        } else {
            System.out.println(cyan+"Invalid pin number");
            DisplayMenu();
        }
    }

  

    public static int menuAmount() {      //The menu Amont methods starts here
        System.out.println("Enter  your Account number");
        int accountNumber = scan.nextInt();
        System.out.println("Enter your pin number");
        int pinNumber = scan.nextInt();
        if (accounts.getAccountNumber() == accountNumber && accounts.getPinNumber() == pinNumber) { //Authentications

            double curentBalance = accounts.getCurrentBalance();
            double balance = curentBalance;

            System.out.println(cyan + "1. N$ 50  2. N$ 100  3.N$ 200");  //ATM prefered amounts
            System.out.println(cyan + "4. N$ 250            5.N$ 500");
            System.out.println(cyan + "6. Own Amount        7.Cancel\n");
            System.out.println(cyan + "Enter your choice:");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:   //winthdrawing 50
                    if (accounts.getCurrentBalance() > 50) {  
                        balance = curentBalance - 50;
                        accounts.setCurrentBalance(balance);
                        System.out.printf("Amount of " + 50 + " withdrawed,  available balance is N$%.2f ", balance,"\n");
                        DisplayMenu();
                    } else {
                        System.out.println("Insufficient balance");
                        DisplayMenu();
                    }
                    break;

                case 2:  //withdrawing 100
                    if (accounts.getCurrentBalance() > 100) {
                        balance = curentBalance - 100;
                        accounts.setCurrentBalance(balance);
                        System.out.printf("Amount of " + 100 + " withdrawed,  available balance is N$%.2f ", balance);
                        DisplayMenu();
                    } else {
                        System.out.println("Insufficient balance");
                        DisplayMenu();
                    }
                    break;

                case 3: //withdrawing 200
                    if (accounts.getCurrentBalance() > 200) {
                        balance = curentBalance - 200;
                        accounts.setCurrentBalance(balance);
                        System.out.printf("Amount of " + 200 + " withdrawed,  available balance is N$%.2f ", balance);
                        DisplayMenu();
                    } else {
                        System.out.println("Insufficient balance");
                        DisplayMenu();
                    }
                    break;

                case 4: //withdrawing 250
                    if (accounts.getCurrentBalance() > 250) {
                        balance = curentBalance - 250;
                        accounts.setCurrentBalance(balance);
                        System.out.printf("Amount of " + 250 + " withdrawed,  available balance is N$%.2f ", balance);
                        DisplayMenu();
                    } else {
                        System.out.println("Insufficient balance");
                        DisplayMenu();
                    }
                    break;

                case 5:   //withdrawing 500
                    if (accounts.getCurrentBalance() > 500) {
                        balance = curentBalance - 500;
                        accounts.setCurrentBalance(balance);
                        System.out.printf("Amount of " + 500 + " withdrawed,  available balance is N$%.2f ", balance);
                        DisplayMenu();
                    } else {
                        System.out.println("Insufficient balance");
                        DisplayMenu();
                    }
                    break;

                case 6:   //user chooses to enter own amount
                    System.out.println("Enter your prefered amount");
                    double Amount = scan.nextDouble();
                    balance = curentBalance - Amount;
                    if (accounts.getCurrentBalance() > Amount) {
                        accounts.setCurrentBalance(balance);
                        System.out.printf("Amount of " + Amount + " withdrawed,  available balance is N$%.2f ", balance);
                        DisplayMenu();
                    } else {
                        System.out.println("Insufficient balance");
                        DisplayMenu();
                    } 
                   
                case 7: //user choosesnot to pefon any transaction
                    System.exit(0);
                default:
                    System.out.println("Enter a valid choice\n");
                    DisplayMenu();

            }

        } else {
            System.out.println(green + "Incorrect account number or pin\n");
            DisplayMenu();

        }
        int balance = 0;
        return balance;
    }
}
