public class RewardValue {
    private double cashValue;
    private double milesValue;
    public static final double conversion_rate = 0.0035;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = cashValue / conversion_rate; // convert cash to miles
    }

    // Constructor that accepts a miles value
    public RewardValue(int milesValue){
        this.milesValue = milesValue;
        this.cashValue = milesValue * conversion_rate; // convert miles to cash
    }

    // getter method for cash value
    public double getCashValue(){
        return cashValue;
    }

    // getter method for miles value
    public double getMilesValue(){
        return milesValue;
    }
}
