public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035; // convert cash to miles
    }

    // Constructor that accepts a miles value
    public RewardValue(int milesValue){
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035; // convert miles to cash
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
