import java.util.Scanner;

public class ATMMachine {

    float Balance = 50000;
    int PIN = 5950;

    public static void main(String[] args) {
        
        ATMMachine obj = new ATMMachine(); 
        obj.checkpin();
    }

    public void checkpin() {

        System.out.println("\nWelcome to SBI Atm....\n");
        System.out.println("Please insert your Debit card\n");
        System.out.println("Please Wait while we are fetching your Details.....\n");
        
        System.out.print("Enter your pin: ");
        Scanner sc = new Scanner(System.in);
        int inputPIN = sc.nextInt();

        while (inputPIN != PIN ) {
            System.out.println("\nInvalid Pin! Try Again.\n");
            System.out.print("Enter your pin: ");
            inputPIN = sc.nextInt();
        }
           menu();
           sc.close();
    }  
        public void menu() {
        System.out.println();
        System.out.print("1. Deposit Money");
        System.out.println("    2. Withdraw Money");
        System.out.print("3. Check Balance");
        System.out.println("    4. Exit\n");
        System.out.print("\nEnter Your Choice: ");

        Scanner sc = new Scanner(System.in);
        int Choice = sc.nextInt();
        
        switch(Choice) {
            case 1 : deposit(); 
                    break;
            case 2 : withdraw(); 
                    break;
            case 3 : checkBalance(); 
                    break;
            case 4 : 
                System.out.println("Thank you for using the ATM.Goodbye!");
                System.exit(0);
            default :
                System.out.println("Invalid choice.Please try again");
                menu();
        }
            sc.close();
    }
        public void deposit() {
            System.out.print("\nEnter the Amount: ");
            Scanner sc = new Scanner(System.in);
            float amount = sc.nextFloat();  
            Balance += amount;
            
            System.out.println("Do You Want To Check Current Balance ( Yes / No )\n");
            String check = "Yes";
            check = sc.next();
            if (check.equalsIgnoreCase("yes")) {
                System.out.println("\nYour current balance is " +Balance+". Thank You.");
            }
            else {
                System.out.println("\nThank you for using the ATM.Goodbye!");
        }
            sc.close();
    }
        public void withdraw() {
            System.out.print("\nEnter Amount to Withdraw: ");
            Scanner sc = new Scanner(System.in);
            float amount = sc.nextFloat();
            if (amount > Balance) {
                System.out.println("\nInsufficient Balance");
            } 
            else {
                Balance -= amount;
                System.out.println("\nAmount withdrawn Successfully.");
            }
            System.out.println("\nDo You Want To Check Current Balance ( Yes / No )");
            String check = "Yes";
            check = sc.next();
            if (check.equalsIgnoreCase("yes")) {
                System.out.println("\nYour current balance is " +Balance+". Thank You.");
            }
            else{
                System.out.println("\nThank you for using the ATM.Goodbye!");
            }
            sc.close();
    }
        public void checkBalance() {
            System.out.println("\nYour Current Balance is: " + Balance);
            Scanner sc = new Scanner(System.in);

            System.out.println("\nDo You Want To Make Any Other Transaction ( Yes / No ) ");
            String check = "Yes";
            check = sc.next();

            if (check.equalsIgnoreCase("yes")) {
               menu();
            }
            else{
                System.out.println("\nThank you for using the ATM.Goodbye!");
            }
             sc.close();
    }
}   