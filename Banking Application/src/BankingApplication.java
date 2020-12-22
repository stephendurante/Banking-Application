import java.util.Scanner;
public class BankingApplication {

    public static void main(String[] args) {

        BankAccount obj1 = new BankAccount("Damian Durante", "BA0001");
        obj1.signUp();
        obj1.showMenu();

        }
    }

    class BankAccount {
        int balance;
        int previousTransaction;
        int customerPin;
        String customerName;
        String customerId;

        BankAccount(String cname,String cid)
        {
            customerName = cname;
            customerId = cid;
        }

        void setCustomerName(String x) {
            x = customerName;

        }

        void setCustomerId(String y) {
            y = customerId;
        }

        void deposit(int amount) {                  /* Method #1 */
            if (amount > 0) {
                balance = balance + amount;
                previousTransaction = amount;
            }
        }

        void withdraw(int amount) {                 /* Method #2 */
            if (amount != 0) {
                balance = balance - amount;
                previousTransaction = -amount;
            }
        }

        void getPreviousTransaction() {              /* Method #3 */
            if (previousTransaction > 0) {
                System.out.println("Deposited: " + previousTransaction);
            } else if (previousTransaction < 0) {
                System.out.println("Withdrawn: " + Math.abs(previousTransaction));
            } else {
                System.out.println("No Transaction Occured.");
            }
        }

        void insertCard(String acc) {
            if (acc != "OK") {
                System.out.println("Loading...");
            } else if (acc == "OK") {
                System.out.println("Please Try again");
            }
        }
        void enterPin(int pin) {
            pin =

        }

        void signUp() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Welcome! Please enter Your First Name.");
            String first = scanner.nextLine();
            System.out.println("Last Name.");
            String last = scanner.nextLine();
            BankAccount obj2 = new BankAccount(first,last);
            System.out.println("Create Pin #. (4 characters)");
            int pin = scanner.nextInt();


        }



        void showMenu()                               /* Method #4 */
        {
            char option = '\0';
            Scanner scanner = new Scanner(System.in);

            System.out.println("Type OK after Card is inserted:");
             String accept = scanner.nextLine();
            insertCard(accept);
            System.out.println("Pin Number");
            int pin = scanner.nextInt();
            enterPin(pin);
            System.out.println("Welcome " + customerName);
            String id = scanner.nextLine();
            setCustomerId(id);
            System.out.println("Your ID is " + customerId);
            System.out.println("\n");
            System.out.println("A. Check Balance");
            System.out.println("B. Deposit");
            System.out.println("C. Withdraw");
            System.out.println("D. Previous Transaction");
            System.out.println("E. Exit");

            do {                                   /* Do/While loop */
                System.out.println("===================================================================================");
                System.out.println("Enter an option");
                System.out.println("===================================================================================");
                option = scanner.next().charAt(0);
                System.out.println("\n");

                switch (option) {                    /* Switch Statement */
                    case 'A':
                        System.out.println("--------------------------------------------------------");
                        System.out.println("Balance = " + balance);
                        System.out.println("--------------------------------------------------------");
                        System.out.println("\n");
                        break;

                    case 'B':
                        System.out.println("--------------------------------------------------------");
                        System.out.println("Enter an amount to deposit");
                        System.out.println("--------------------------------------------------------");
                        int amount = scanner.nextInt();
                        deposit(amount);
                        System.out.println("\n");
                        break;

                    case 'C':
                        System.out.println("--------------------------------------------------------");
                        System.out.println("Enter an amount to withdraw");
                        System.out.println("--------------------------------------------------------");
                        int amount2 = scanner.nextInt();
                        withdraw(amount2);
                        System.out.println("\n");
                        break;

                    case 'D':
                        System.out.println("--------------------------------------------------------");
                        getPreviousTransaction();
                        System.out.println("--------------------------------------------------------");
                        System.out.println("\n");
                        break;

                    case 'E':
                        System.out.println("--------------------------------------------------------");
                        break;

                    default:
                        System.out.println("Invalid Option! Please enter again");
                        break;

                }

                }while (option != 'E') ;

                    System.out.println("Thank you for using our services");
                }



            }





