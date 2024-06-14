
public class RewardValue{
    private double cashValue;
    private double milesValue;

    public static final double MILES_TO_CASH_RATE = 0.0035;

    /**
     * @param cashValue
     */
    public RewardValue (double cashValue){
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH_RATE;

    }
    /**
     * @param milesValue
     */
    public RewardValue (double milesValue){
            this.milesValue = milesValue;
            this.cashValue = milesValue * MILES_TO_CASH_RATE;
    }

    public double getCashValue(){
        return cashValue;
    }

    public double getMilesValue(){
        return milesValue;
    }
}