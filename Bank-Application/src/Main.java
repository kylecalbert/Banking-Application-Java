import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;
public class Main {
	
	
	
	public static void main(String args[]) {
	 

		BankAccount account1 = new BankAccount("Kyle", 123);
		account1.Menu();
		
	}
}
	   

class BankAccount{
	int balance;
	int previousTransaction;
	String customerName;
	int customerId;
	
	
	public BankAccount(String customerName, int customerId) {
		this.customerName = customerName;
		this.customerId = customerId;
		
	}
	
	void deposit(int amount) {
		if(amount!=0) {
			balance = balance+amount;
			previousTransaction = amount;
		}
		
	}
	
	void withdraw(int amount) {
		
		if(amount!=0) {
			balance = balance-amount;
			previousTransaction = -amount; ///come back to this
		}
		
		
	}
	
	void getBalance(){
		System.out.println("Your balance is " + balance);
		
	}
	
	
	void getPreviousTransaction() {
		if(previousTransaction>0) {
			System.out.println("Deposited: " +previousTransaction);
		}else 
			if(previousTransaction<0) {
				
				System.out.println("Withdrew: " + Math.abs(previousTransaction));
			}else {
				System.out.println("No transactions made yet");

			}
	}
	
	void Menu() {
		
		System.out.println("Welcome " + customerName);
		System.out.println("your id is " + customerId);

		
		char option = 'i';
		Scanner scanner = new Scanner(System.in);
		System.out.println("YOUR OPTIONS ARE A = GET BALANCE    B = DEPOSIT   C = WITHDRAW   D = GET PREVIOUS TRANSACTION   E = EXIT");

		
		do {

	    System.out.println("YOUR OPTIONS ARE A = GET BALANCE    B = DEPOSIT   C = WITHDRAW   D = GET PREVIOUS TRANSACTION   E = EXIT");

		option = scanner.next().charAt(0); 


		switch(option) {
		 
		case'A':
			getBalance();
			break;
			
		case 'B':
			System.out.println("Please enter the amount to deposit: ");
			int deposit = scanner.nextInt();
			deposit(deposit);
			break;
			
		case 'C':
			System.out.println("Please enter the amount to withdraw: ");
			int withdraw = scanner.nextInt();
			deposit(withdraw);
			break;
			

		case 'D':
			getPreviousTransaction();
			break;
			
		case 'E':
			System.exit(0);

			break;
		default:
			System.out.println("Invalid input , please try again");
			break;
			
			
			
		}
		}while(option!='E');
		
	
	
		
		
		
		
		
	}
	
}

