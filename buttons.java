//import javax.swing.JOptionPane;
//import javax.swing.JFrame;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//public class buttons {
//    private JFrame frame;
//    private JLabel label;
//    private JRadioButton enterTransactionButton, listTransactionsButton, listChecksButton,listDepositsButton;
//    private ButtonGroup buttonGroup;
//
//    // Instance of the CheckingAccount class
//    private CheckingAccount checkingAccount;
//
//    public buttons(CheckingAccount account) {
//        this.checkingAccount = account;
//        // Create and set up the window.
//        frame = new JFrame("Checking Account");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(300,200);
//
//
//
//        // Create components
//        label = new JLabel("Choose an option");
//
//        label.setFont(new Font("Helvetica",Font.ITALIC,28));
//
//        label.setBackground (Color.green);
//
//        enterTransactionButton = new JRadioButton("Enter Transaction");
//        listTransactionsButton = new JRadioButton("List all Transactions");
//        // listTransactionsButton.setBackground (Color.green);
//        listChecksButton = new JRadioButton("List all Checks");
//        //listChecksButton.setBackground (Color.green);
//        listDepositsButton = new JRadioButton("List all Deposits");
//        listDepositsButton.setBackground (Color.green);
//        enterTransactionButton.setBackground(Color.green);
//        listChecksButton.setBackground (Color.green);
//        listTransactionsButton.setBackground (Color.green);
//
//        buttonGroup = new ButtonGroup();
//        buttonGroup.add(enterTransactionButton);
//        buttonGroup.add(listTransactionsButton);
//        buttonGroup.add(listChecksButton);
//        buttonGroup.add(listDepositsButton);
//
//        //StringBuilder transactionDetails = new StringBuilder();
//        //transactionDetails.setLength(0);
//        // Add listeners to the radio buttons
//        enterTransactionButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String transTypeString = JOptionPane.showInputDialog("Enter your Transaction code");
//                int transType = Integer.parseInt(transTypeString);
//                String amountString = JOptionPane.showInputDialog("Enter the transaction amount");
//                double amount = Double.parseDouble(amountString);
////double transAmt= account.getBalance();
//
//                // Add transaction to the account
//                checkingAccount.addTrans(transType, amount);
//                checkingAccount.transMessage(transType,amount);
//
//            }
//        });
//
//        listTransactionsButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                StringBuilder sb = new StringBuilder();
//                sb.append("List All Transactions \n");
//                sb.append("ID     "+"Type     "+"Amount\n");
//                for(int i = 0; i < checkingAccount.getTransCount(); i++) {
//                    Transaction transaction = checkingAccount.getTrans(i);
//                    sb.append( "\n"+transaction.getTransNumber() + "       ");
//                    if(transaction.getTransId()==1){
//                        sb.append("check     $"+transaction.getTransAmount() + "\n");
//                    }
//                    else {
//                        sb.append("deposit   $"+transaction.getTransAmount() + "\n");
//                    }
//                }
//                JOptionPane.showMessageDialog(frame, sb.toString(), "Message", JOptionPane.INFORMATION_MESSAGE);
//            }
//        });
//
//        listChecksButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                StringBuilder sb = new StringBuilder();
//                sb.append("List All Checks \n");
//                sb.append("\nId         " + "Amount \n");
//                for(int i = 0; i < checkingAccount.getTransCount(); i++) {
//                    Transaction transaction = checkingAccount.getTrans(i);
//
//
//                    if(transaction.getTransId() == 1) {
//                        sb.append(transaction.getTransNumber() +"          ");
//                        sb.append("$"+transaction.getTransAmount() + "\n");
//                    }
//                }
//                JOptionPane.showMessageDialog(frame, sb.toString(), "Message", JOptionPane.INFORMATION_MESSAGE);
//            }
//        });
//
//        listDepositsButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                StringBuilder sb = new StringBuilder();
//                sb.append("List All Deposits \n");
//                sb.append("\nId         " + "Amount \n");
//                for(int i = 0; i < checkingAccount.getTransCount(); i++) {
//                    Transaction transaction = checkingAccount.getTrans(i);
//
//
//
//                    if(transaction.getTransId() == 2) {
//                        sb.append(transaction.getTransNumber() +"          ");
//                        sb.append("$"+transaction.getTransAmount() + "\n");
//                    }
//                }
//                JOptionPane.showMessageDialog(frame, sb.toString(), "Deposits", JOptionPane.INFORMATION_MESSAGE);
//            }
//        });
//
//        // Add components to the frame
//        frame.getContentPane().add(label, BorderLayout.NORTH);
//        frame.getContentPane().add(enterTransactionButton, BorderLayout.WEST);
//        frame.getContentPane().add(listTransactionsButton, BorderLayout.CENTER);
//        frame.getContentPane().add(listChecksButton, BorderLayout.EAST);
//        frame.getContentPane().add(listDepositsButton, BorderLayout.SOUTH);
//
//        // Display the window
//        frame.pack();
//        frame.setVisible(true);
//    }
//
//}
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class buttons {
    private JFrame frame;
    private JLabel label;
    private JRadioButton enterTransactionButton, listTransactionsButton, listChecksButton,listDepositsButton;
    private ButtonGroup buttonGroup;

    // Instance of the CheckingAccount class
    private CheckingAccount checkingAccount;

    public buttons(CheckingAccount account) {
        this.checkingAccount = account;
        // Create and set up the window.
        frame = new JFrame("Checking Account");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,200);



        // Create components
        label = new JLabel("Choose an option");

        label.setFont(new Font("Helvetica",Font.ITALIC,28));

        label.setBackground (Color.green);

        enterTransactionButton = new JRadioButton("Enter Transaction");
        listTransactionsButton = new JRadioButton("List all Transactions");
        // listTransactionsButton.setBackground (Color.green);
        listChecksButton = new JRadioButton("List all Checks");
        //listChecksButton.setBackground (Color.green);
        listDepositsButton = new JRadioButton("List all Deposits");
        listDepositsButton.setBackground (Color.green);
        enterTransactionButton.setBackground(Color.green);
        listChecksButton.setBackground (Color.green);
        listTransactionsButton.setBackground (Color.green);

        buttonGroup = new ButtonGroup();
        buttonGroup.add(enterTransactionButton);
        buttonGroup.add(listTransactionsButton);
        buttonGroup.add(listChecksButton);
        buttonGroup.add(listDepositsButton);

        //StringBuilder transactionDetails = new StringBuilder();
        //transactionDetails.setLength(0);
        // Add listeners to the radio buttons
        enterTransactionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String transTypeString = JOptionPane.showInputDialog("Enter your Transaction code");
                int transType = Integer.parseInt(transTypeString);
                String amountString = JOptionPane.showInputDialog("Enter the transaction amount");
                double amount = Double.parseDouble(amountString);
//double transAmt= account.getBalance();

                // Add transaction to the account
                checkingAccount.addTrans(transType, amount);
                checkingAccount.transMessage(transType,amount);

            }
        });

        listTransactionsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Account Belongs to \n"+checkingAccount.getName()+"\n");
                sb.append("List All Transactions \n");
                sb.append("ID     "+"Type     "+"Amount\n");

                for(int i = 0; i < checkingAccount.getTransCount(); i++) {
                    Transaction transaction = checkingAccount.getTrans(i);
                    sb.append( "\n"+transaction.getTransNumber() + "       ");
                    if(transaction.getTransId()==1){
                        sb.append("check     $"+String.format("%.2f", transaction.getTransAmount()) + "\n");
                    }
                    else {
                        sb.append("deposit   $"+String.format("%.2f", transaction.getTransAmount()) + "\n");
                    }
                }
                JOptionPane.showMessageDialog(frame, sb.toString(), "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        listChecksButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Account Belongs to \n"+checkingAccount.getName()+"\n");
                sb.append("List All Checks \n");
                sb.append("\nId         " + "Amount \n");

                for(int i = 0; i < checkingAccount.getTransCount(); i++) {
                    Transaction transaction = checkingAccount.getTrans(i);


                    if(transaction.getTransId() == 1) {
                        sb.append(transaction.getTransNumber() +"          ");
                        sb.append("$"+String.format("%.2f", transaction.getTransAmount()) + "\n");
                    }
                }
                JOptionPane.showMessageDialog(frame, sb.toString(), "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        listDepositsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Account Belongs to \n"+checkingAccount.getName()+"\n");
                sb.append("List All Deposits \n");
                sb.append("\nId         " + "Amount \n");

                for(int i = 0; i < checkingAccount.getTransCount(); i++) {
                    Transaction transaction = checkingAccount.getTrans(i);



                    if(transaction.getTransId() == 2) {
                        sb.append(transaction.getTransNumber() +"          ");
                        sb.append("$"+String.format("%.2f", transaction.getTransAmount()) + "\n");
                    }
                }
                JOptionPane.showMessageDialog(frame, sb.toString(), "Deposits", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Add components to the frame
        frame.getContentPane().add(label, BorderLayout.NORTH);
        frame.getContentPane().add(enterTransactionButton, BorderLayout.WEST);
        frame.getContentPane().add(listTransactionsButton, BorderLayout.CENTER);
        frame.getContentPane().add(listChecksButton, BorderLayout.EAST);
        frame.getContentPane().add(listDepositsButton, BorderLayout.SOUTH);

        // Display the window
        frame.pack();
        frame.setVisible(true);
    }

}


