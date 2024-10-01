
class BankAccounts {
   
    private String accountNumber;
    private double balance;
    private double interestRate;
    
   
    public BankAccounts(String accountNumber, double balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;
    }
    
    
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
        System.out.println("New Balance: $" + balance);
    }
    public double getBalance() {
        return balance;
    }
    
   
}


class SavingAccount extends BankAccounts {
    
    private double minimumBalance;
    
    
    public SavingAccount(String accountNumber, double balance, double interestRate, double minimumBalance) {
        super(accountNumber, balance, interestRate);
        this.minimumBalance = minimumBalance;
    }
    
    
    public void withdraw(double amount) {
        if (getBalance() - amount >= minimumBalance) {
            super.balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            System.out.println("New Balance: $" + getBalance());
        } else {
            System.out.println("Insufficient funds. Minimum balance requirement not met.");
        }
    }
}


public class bankaccount {
    public static void main(String[] args) {
        
        BankAccounts bankAccount = new BankAccounts("123456789", 1000.0, 0.05);
        
     
        bankAccount.deposit(500.0);
        
        System.out.println(); 
        
        
        SavingAccount savingAccount = new SavingAccount("987654321", 2000.0, 0.03, 500.0);
        
       
        savingAccount.deposit(1000.0);
        
        System.out.println(); 
        
     
        savingAccount.withdraw(1500.0);
    }
}

