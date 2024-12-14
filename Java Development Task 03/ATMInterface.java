import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

import java.util.*;

class ATM{
    private BankAccount account;
    public ATM(BankAccount account){
        this.account = account;
    }
    public void DisplayMenu(){
        System.out.println("\n** WELCOME TO THE ATM MACHINE **\n");
        System.out.println("1) Withdraw Money");
        System.out.println("2) Deposit Money");
        System.out.println("3) Check Balance");
        System.out.println("4) Exit\n");
    }
    public void Withdraw(double amount){
        if(amount <= 0 ){
            System.out.println("Please, Enter a Positive Number...");
            return;
        }
        else if(amount >= account.getBalance()){
            System.out.println("Insufficient Funds. Cannot Withdraw Money...");
            return;
        }
        else{
            account.setBalance(account.getBalance() - amount);
            System.out.printf("Successfully Withdrew : $%.2f. Updated Account Balance : $%.2f%n",amount, account.getBalance());
        }
    }
    public void Deposit(double amount){
        if(amount <= 0){
            System.out.println("Please, Enter a Positive Number...");
            return;
        }
        else{
            account.setBalance(account.getBalance() + amount);
            System.out.printf("Successfully Deposited : $%.2f. Updated Account Balance : $%.2f%n",amount, account.getBalance());
        }
    }
    public void showBalance(){
        System.out.printf("Your current Balance : $%.2f%n",account.getBalance());
    }
}
class BankAccount{
    private double Balance;
    BankAccount(double intialBal){
        this.Balance = intialBal;
    }
    public double getBalance(){
        return Balance;
    }
    public void setBalance(double bal){
        this.Balance = bal;
    }
}

public class ATMInterface {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(5000);
        ATM atm = new ATM(account);
        while(true){
            atm.DisplayMenu();
            System.out.print("Please, Select an Option from Above : ");
            int ch =  sc.nextInt();
            System.out.println();
            switch (ch) {
                case 1:
                    System.out.println("Enter the Amount to Withdraw.");
                    double WithdrawAmount = sc.nextDouble();
                    atm.Withdraw(WithdrawAmount);
                    break;
                
                case 2:
                    System.out.println("Enter the Amount to Deposit.");
                    double DepositAmount = sc.nextDouble();
                    atm.Deposit(DepositAmount);
                    break;
                case 3:
                    atm.showBalance();
                    break;
                case 4:
                    System.out.println("Thank You for using the ATM Machine...\n");
                    sc.close();
                    return;
                default:
                    System.out.println("Incorrect Option. Please Select from Above Option...");
                    break;
            }
        }
    }
}
