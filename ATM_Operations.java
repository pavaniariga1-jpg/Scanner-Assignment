package scanner;

import java.util.Scanner;

public class ATM_Operations {
	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
	    int pin = 2066;
	    int balance = 50000;

	    System.out.println("Enter the PIN : ");
	    int newPin = sc.nextInt();

	    if (pin == newPin) {

	        System.out.println("1. Balance Checking");
	        System.out.println("2. Withdraw Money");
	        System.out.println("3. Deposit Money");

	        System.out.println("Enter the Choice : ");
	        int choice = sc.nextInt();

	        if (choice == 1) {
	            System.out.println("Balance of your account is : " + balance);
	        } 
	        else if (choice == 2) {
	            System.out.println("Enter the amount to withdraw: ");
	            int withdrawal = sc.nextInt();

	            if (balance >= withdrawal) {
	                System.out.println("Money you have withdrawn : " + withdrawal);
	                balance = balance - withdrawal;
	                System.out.println("Remaining balance is : " + balance);
	            } else {
	                System.out.println("Insufficient Balance to withdraw");
	            }
	        } 
	        else if (choice == 3) {
	            System.out.println("Enter the amount to deposit: ");
	            int deposit = sc.nextInt();

	            if (deposit > 0) {
	                balance = balance + deposit;
	                System.out.println("Money deposited successfully: " + deposit);
	                System.out.println("Updated balance is : " + balance);
	            } else {
	                System.out.println("Invalid deposit amount");
	            }
	        } 
	        else {
	            System.out.println("Invalid Choice");
	        }

	    } 
	    else {
	        System.out.println("Invalid PIN");
	    }

	    sc.close();
	}
}
