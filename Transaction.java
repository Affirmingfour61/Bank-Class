
public class Transaction
{
    private int transNumber;
    private int transId;
    private double transAmt;

    public Transaction(int transNumber, int transId, double transAmt)
    {
        this.transNumber = transNumber;
        this.transId = transId;
        this.transAmt = transAmt;

    }

    public int getTransNumber()
    {
        return transNumber;
    }


    public int getTransId()
    {
        return transId;
    }


    public double getTransAmount()
    {
        return transAmt;
    }
}
