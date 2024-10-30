import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        double acctName = Double.parseDouble(JOptionPane.showInputDialog("Enter the user name:"));
        double initialBalance = Double.parseDouble(JOptionPane.showInputDialog("Enter initial balance for the month:"));

        CheckingAccount account = new CheckingAccount(initialBalance, acctName);
        // Create an instance of the buttons class
        buttons buttonsGUI = new buttons(account);
    }
}

