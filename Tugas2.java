public class Tugas2 {

    private String accountNumber;

    private double balance;

    private String customerName;

    private String customerEmail;

    private String customerPhone;

    // Constructor to provide initial values to attributes

    public Tugas2(String accountNumber, double balance, String customerName, String customerEmail, String customerPhone) {

        this.accountNumber = accountNumber;

        this.balance = balance;

        this.customerName = customerName;

        this.customerEmail = customerEmail;

        this.customerPhone = customerPhone;

    }

    // Getter and setter methods for each attribute

    public String getAccountNumber() {

        return accountNumber;

    }

    public void setAccountNumber(String accountNumber) {

        this.accountNumber = accountNumber;

    }

    public double getBalance() {

        balance += amount;

        // Displaying a confirmation message

        System.out.println("Deposit successful. Your balance is now: $" + balance);

    }

    // Method to withdraw balance

    public void withdraw(double amount) {

        // Checking if the balance is sufficient for withdrawal

        if (balance >= amount) {

            // Subtracting the withdrawn amount from the balance

            balance -= amount;

            // Displaying a confirmation message

            System.out.println("Withdrawal successful. Your balance is now: $" + balance);

        } else {

            // Displaying an error message

            System.out.println("Insufficient funds. Your balance is only: $" + balance);

        }

    }

    // Main method for testing the Tugas2 class

    public static void main(String[] args) {
// Creating a Tugas2 object and testing its functionality

        Tugas2 myAccount = new Tugas2("123456789", 5000.0, "Agung Romadhon", "agungromadhon1200@gmail.com", "123-456-7890");

        myAccount.deposit(500.0);

        myAccount.withdraw(200.0);

        // Displaying final account information

        System.out.println("Account Number: " + myAccount.getAccountNumber());

        System.out.println("Customer Name: " + myAccount.getCustomerName());

        System.out.println("Customer Email: " + myAccount.getCustomerEmail());

        System.out.println("Customer Phone: " + myAccount.getCustomerPhone());

        System.out.println("Final Balance: $" + myAccount.getBalance());

    }

}




