package spacecoding.data;

public class BankAccount {
    private String socialSecurityNumber;
    private String firstName;
    private String lastName;
    private double balance;

    public BankAccount(String socialSecurityNumber, String firstName, String lastName, double initialBalance) {
        this.socialSecurityNumber = socialSecurityNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = initialBalance;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public boolean withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
            return true;
        }
        return false;
    }
    public void deposit(double amount){
        balance+=amount;
    }
}


