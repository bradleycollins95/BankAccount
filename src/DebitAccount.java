import java.util.Scanner;

/**
 * Class that allows a user to deposit into and withdraw out of their bank account
 *
 * @author brad_
 */
public class DebitAccount {

    /**
     * @param args - user input data into variables (Scanner, bankAccount, withdrawAmount, depositAmount)
     */
    public static void main(String[] args) {

        int bankAccount = 0; // set initial bank balance
        Scanner scan = new Scanner(System.in); // grab user input

        System.out.println("Welcome to my make-believe bank account simulator.\n"); // display welcome message

        System.out.printf("Account balance: $%d\n\n", bankAccount); // display account balance
        System.out.println("Please enter an amount to deposit: \n");
        bankAccount = scan.nextInt(); // reads the value from user and adds it to the initial bankAccount variable
        System.out.printf("\nAccount balance: $%d\n\n", bankAccount); // displays new variable total

        System.out.println("Please enter an amount to withdraw: \n");
        int withdrawAmount = scan.nextInt(); // reads the withdrawAmount value from user and stores it in separate variable

        // display the remainder balance after subtracting the withdrawAmount value from the bankAccount value stored previously
        System.out.printf("\nAccount balance: $%d\n", bankAccount - withdrawAmount);

    }
}