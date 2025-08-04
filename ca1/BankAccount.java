import java.util.Scanner;

class BankAccount{
       private String accountholder;
       private int accountNumber;
       private double balance;
       
       static int accountCount = 0;

       public BankAccount(){
           this.accountHolder = accountHolder;
           this.accountNumber = accountNumber;
           this.balance = balance;
       }
       public boolean withdraw(double amount){
              if(amount < balance){
                  balance -= amount;
                  return true;
              }
              else{
                  System.out.println("you dont have enough balance!");
                  return false;
              }
       } 

       public void deposit(double amount){
              balance += amount;
       }

       public Transaction transferTo(BankAccount target, double amount){
              
       }
         
}

class Transaction {
    private int fromAccount;
    private int toAccount;
    private double amount;
    private String status;

    public Transaction(int fromAccount, int toAccount, double amount) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
        this.status = "Pending";     }

     public void displayTransactionDetails() {
        System.out.println("--- Transaction Details ---");
        System.out.println("From Account: " + fromAccount);
        System.out.println("To Account:   " + toAccount);
        System.out.println("Amount:       " + String.format("%.2f", amount)); 
        System.out.println("Status:       " + status);
        System.out.println("---------------------------\n");
    }
}