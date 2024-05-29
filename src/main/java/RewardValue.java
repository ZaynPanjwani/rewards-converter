import java.util.Scanner;

public class RewardValue{
    private double cashValue;
    private int milesValue;
    

    public RewardValue(double cashValue)
    {
        double rate = 0.0035;
        this.milesValue = (int)(cashValue/rate);
    }

    public RewardValue(int milesValue)
    {
        double rate = 0.0035;
        this.cashValue = ((double)milesValue) * rate;
    }

    public double getCashValue()
    {
        return this.cashValue;
    }

    public int getMilesValue()
    {
        return this.milesValue;
    }


}