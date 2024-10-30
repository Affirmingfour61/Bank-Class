//import javax.lang.model.type.NullType;
//import javax.swing.*;
//import java.lang.reflect.GenericDeclaration;
//import java.util.ArrayList;
//
//public class CheckingAccount {
//
//
//    private double balance;
//    private double totalServiceCharge;
//    private boolean below500Warning;
//    private boolean below50Warning;
//
//    private ArrayList<Transaction> transList;
//    private int transCount; // the count of Transaction objects and used as the ID for each transaction
//
//
//    public CheckingAccount(double initialBalance) {
//        balance = initialBalance;
//        totalServiceCharge = 0.0;
//        below500Warning = false;
//        below50Warning = false;
//        transList = new ArrayList<>();
//        transCount = 0;
//    }
//
//    public void addTrans(int transId, double transAmt) {
//        Transaction newTrans = new Transaction(transCount, transId, transAmt);
//        transList.add(newTrans);
//        transCount++;
//    }   // adds a transaction object to the transList
//
//    public void transMessage(int transId, double transAmt) {
//
//        if (transId == 1) {
//            StringBuilder sb = new StringBuilder();
//            setBalance(transAmt, transId);
//            sb.append("Transaction: ").append("Check in the amount of ").append(transAmt).append("\n");
//
//            sb.append("Current Balance: ($" + (getBalance()) + ")" + "\n");
//
//            sb.append("Service Charge: Check---charge $0.15\n");
//
//
//            sb.append("Total Service Charges: $" + getServiceCharge() + "\n");
//
//            JOptionPane.showMessageDialog(null, sb.toString(), "Information", JOptionPane.INFORMATION_MESSAGE);
//
//        } else if (transId == 2) {
//            setBalance(transAmt, transId);
//            StringBuilder sb = new StringBuilder();
//
//            sb.append("Transaction: ").append("Deposit in the amount of ").append(transAmt).append("\n");
//            sb.append("Current Balance: ($" + getBalance() + ")" + "\n");
//            sb.append("Service Charge: Check---charge $0.10\n");
//
//            //getBalanceWarning(account, transactionDetails);
//            sb.append("Total Service Charges: $" + getServiceCharge() + "\n");
//
//            JOptionPane.showMessageDialog(null, sb.toString(), "Information", JOptionPane.INFORMATION_MESSAGE);
//
//        }
//        return;
//    }
//
//
//
//    public int getTransCount(){
//        return transCount;
//    } //returns the current value of transCount;
//
//    public Transaction getTrans(int i) {
//        if (i >= 0 && i < transList.size()) {
//            return transList.get(i);
//        } else {
//            return null; // or throw an exception
//        }
//    }// returns the i-th Transaction object in the list
//
//
//
//    public double getBalance() {
//
//        return balance;
//    }
//
//
//
//    public void setBalance(double transAmt, int tCode) {
//        if (tCode == 1) { // Check
//            balance -= transAmt;
//            totalServiceCharge += 0.15;
//            if (balance < 500) {
//                totalServiceCharge += 5.0;
//                StringBuilder sb=new StringBuilder();
//                sb.append("Service Charge: Below $500 --- charge $5.00\n");
//                //JOptionPane.showMessageDialog(null, sb.toString(), "Information", JOptionPane.INFORMATION_MESSAGE);
//                below500Warning = true;
//            }
//            else if(balance<50) {
//                totalServiceCharge += 10.0;
//                StringBuilder sb=new StringBuilder();
//                sb.append("Service Charge: Below $50 --- charge $10.00\n");
//                // JOptionPane.showMessageDialog(null, sb.toString(), "Information", JOptionPane.INFORMATION_MESSAGE);
//                below50Warning = true;
//            }
//        } else if (tCode == 2) { // Deposit
//            balance += transAmt;
//            totalServiceCharge += 0.10; // Adjusting totalServiceCharge for deposit
//        }
//        else return;
//    }
//
//
//
//    public double getServiceCharge() {
//        return totalServiceCharge;
//    }
//
//
//
//    public boolean isBelow50Warning() {
//        return below50Warning;
//    }
//
//
//
//    public void setBelow50Warning(boolean below50Warning) {
//        this.below50Warning = below50Warning;
//    }
//
//
//
//    public boolean isBelow500Warning() {
//        return below500Warning;
//    }
//
//
//
//    public void setBelow500Warning(boolean below500Warning) {
//        this.below500Warning = below500Warning;
//    }
//}
import javax.swing.*;
import java.util.ArrayList;

public class CheckingAccount extends Account {

    private double totalServiceCharge;
    private boolean below500Warning;
    private boolean below50Warning;
    private ArrayList<Transaction> transList;
    private int transCount; // the count of Transaction objects and used as the ID for each transaction

    public CheckingAccount(double initialBalance, double acctName) {
        super(String.valueOf(acctName), initialBalance);
        totalServiceCharge = 0.0;
        below500Warning = false;
        below50Warning = false;
        transList = new ArrayList<>();
        transCount = 0;
    }

    public void addTrans(int transId, double transAmt) {
        Transaction newTrans = new Transaction(transCount, transId, transAmt);
        transList.add(newTrans);
        transCount++;
    } // adds a transaction object to the transList

    public void transMessage(int transId, double transAmt) {

        if (transId == 1) {
            StringBuilder sb = new StringBuilder();
            setBalance(transAmt, transId);
            sb.append("Account Belongs to "+getName()+"\n");
            sb.append("Transaction: ").append("Check")/*.append(Transaction.getCheckNumber())*/.append("in the amount of ").append(transAmt).append("\n");

            sb.append("Current Balance: ($" + (getBalance()) + ")" + "\n");

            sb.append("Service Charge: Check---charge $0.15\n");

            sb.append("Total Service Charges: $" + getServiceCharge() + "\n");

            JOptionPane.showMessageDialog(null, sb.toString(), "Information", JOptionPane.INFORMATION_MESSAGE);

        } else if (transId == 2) {
            setBalance(transAmt, transId);
            StringBuilder sb = new StringBuilder();
            sb.append("Account Belongs to "+getName()+"\n");
            sb.append("Transaction: ").append("Deposit in the amount of ").append(transAmt).append("\n");
            sb.append("Current Balance: ($" + getBalance() + ")" + "\n");
            sb.append("Service Charge: Check---charge $0.10\n");

            sb.append("Total Service Charges: $" + getServiceCharge() + "\n");

            JOptionPane.showMessageDialog(null, sb.toString(), "Information", JOptionPane.INFORMATION_MESSAGE);

        }
        else
        return;
    }

    public int getTransCount() {
        return transCount;
    } //returns the current value of transCount;

    public Transaction getTrans(int i) {
        if (i >= 0 && i < transList.size()) {
            return transList.get(i);
        } else {
            return null; // or throw an exception
        }
    }// returns the i-th Transaction object in the list

    public double getBalance() {

        return balance;
    }

    public void setBalance(double transAmt, int tCode) {
        if (tCode == 1) { // Check
            balance -= transAmt;
            totalServiceCharge += 0.15;
            if (balance < 500) {
                totalServiceCharge += 5.0;
                StringBuilder sb = new StringBuilder();
                sb.append("Service Charge: Below $500 --- charge $5.00\n");
                below500Warning = true;
            } else if (balance < 50) {
                totalServiceCharge += 10.0;
                StringBuilder sb = new StringBuilder();
                sb.append("Service Charge: Below $50 --- charge $10.00\n");
                below50Warning = true;
            }
        } else if (tCode == 2) { // Deposit
            balance += transAmt;
            totalServiceCharge += 0.10; // Adjusting totalServiceCharge for deposit
        } else return;
    }

    public double getServiceCharge() {
        return totalServiceCharge;
    }

    public boolean isBelow50Warning() {
        return below50Warning;
    }

    public void setBelow50Warning(boolean below50Warning) {
        this.below50Warning = below50Warning;
    }

    public boolean isBelow500Warning() {
        return below500Warning;
    }

    public void setBelow500Warning(boolean below500Warning) {
        this.below500Warning = below500Warning;
    }
}
