public class Deposit extends Transaction {
    private double cashAmount; // Amount of cash in the deposit
    private double checkAmount; // Amount of check in the deposit

    public Deposit(int tId, int tAmt, int tCount, double cashAmount, double checkAmount) {
        super(tId, tAmt, tCount);
        this.cashAmount = cashAmount;
        this.checkAmount = checkAmount;
    }

    public double getCashAmount() {
        return cashAmount;
    }

    public double getCheckAmount() {
        return checkAmount;
    }
}