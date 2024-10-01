 class Account {
    private int balance = 0;

    
    public synchronized void deposit(int amount) {
        System.out.println(Thread.currentThread().getName() + " depositing " + amount);
        balance += amount;
        System.out.println("New balance after deposit: " + balance);
    }

   
    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " withdrawing " + amount);
            balance -= amount;
            System.out.println("New balance after withdrawal: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " attempted to withdraw " + amount + " but insufficient funds");
        }
    }

    
    public synchronized int getBalance() {
        return balance;
    }
}

class DepositThread extends Thread {
    private Account account;
    private int amount;

    public DepositThread(Account account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.deposit(amount);
    }
}

class WithdrawalThread extends Thread {
    private Account account;
    private int amount;

    public WithdrawalThread(Account account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(amount);
    }
}

class BalanceEnquiryThread extends Thread {
    private Account account;

    public BalanceEnquiryThread(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " balance enquiry: " + account.getBalance());
    }
}

public class ThreadExample {
    public static void main(String[] args) {
       
        Account account = new Account();

       
        Thread depositThread = new DepositThread(account, 1000);
        Thread withdrawalThread = new WithdrawalThread(account, 500);
        Thread balanceEnquiryThread = new BalanceEnquiryThread(account);

        depositThread.setName("DepositThread");
        withdrawalThread.setName("WithdrawalThread");
        balanceEnquiryThread.setName("BalanceEnquiryThread");

        
        depositThread.start();
        withdrawalThread.start();
        balanceEnquiryThread.start();

       
        try {
            depositThread.join();
            withdrawalThread.join();
            balanceEnquiryThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        
        System.out.println("Final account balance: " + account.getBalance());
    }
}
