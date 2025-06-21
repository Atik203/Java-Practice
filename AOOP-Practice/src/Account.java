abstract class Account {
    String accountNumber;
    String accountHolderName;
    double balance;

    Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    abstract void displayAccountInfo();
}

class SavingsAccount extends Account {
    public double interestRate;

    SavingsAccount(String accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate);
    }
}

class CheckingAccount extends Account {
    public double additionalBalance;

    CheckingAccount(String accountNumber, String accountHolderName, double balance, double additionalBalance) {
        super(accountNumber, accountHolderName, balance);
        this.additionalBalance = additionalBalance;
    }

    @Override
    void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Additional Balance: " + additionalBalance);
    }
}

class Bank {
    void showAccountDetails(Account account) {
        account.displayAccountInfo();
    }
}

 class TestAccount {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("SAV-001", "John Doe", 1000, 5);
        CheckingAccount checkingAccount = new CheckingAccount("CHK-001", "Jane Doe", 2000, 100);

        Bank bank = new Bank();

        System.out.println("Savings Account Details:");
        bank.showAccountDetails(savingsAccount);

        System.out.println("\nChecking Account Details:");
        bank.showAccountDetails(checkingAccount);
    }
}


