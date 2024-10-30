public class Check extends Transaction
{
    private int checkNumber; // check number for each check transaction
    public Check(int tId, int tAmt, int tCount, int checkNumber)
    {
        super(tId, tAmt, tCount);
        this.checkNumber = checkNumber;
    }
    public int getCheckNumber() {
        return checkNumber;
    }
    public void setCheckNumber(int checkNumber) {
        this.checkNumber = checkNumber;
    }
}
/*
As a follow up to Assignment #3, modify the CheckingAccount class again, to
become a simple derived class of the parent class Account.

 The Account class contains the instance variables String name (the name of the person who owns the account) and double balance
  (the current balance of the account).
 There should be appropriate get methods in Account class to get the name and balance fields.
 The account name should appear in all reports and dialogue.

 The CheckingAccount class will still have the instance variables double totalServiceCharges, and Transaction [ ] transList
 (or ArrayList<Transaction>transList).
 Also, create a Check class, a simple derived class of the Transaction class.
 The Check class will include the check number for each check transaction.
 The check number will be prompted for as the check is entered, and displayed in the checks listing.

 Also, create a Deposit class, a simple derived class of the Transaction class.
 The Deposit class will include the cash amount and check amount that total to the transaction amount.
  The cash and check amount for each deposit will be input in a new Deposit input screen. (See sample run below.)
In this application’s design, you should have the following classes:

*/
