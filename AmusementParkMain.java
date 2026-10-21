package javaPack;

public class AmusementParkMain {
    
    public static void main(String[] args) {
        //Create a RidePass 
        // specifics: balance (50.0), isVIP (false), age (15)
        RidePass visitorPass = new RidePass(50.0, false, 15);
        
        // specifics: rideCost (20.0), minAge (10), isPeakHour (false), requiresVIP (false)
        boolean result = visitorPass.canRide(20.0, 10, false, false);
        System.out.println("Can the visitor board the ride? " + result);
        
        //Display balance before processing the ride payment
        System.out.println("Current balance: $" + visitorPass.getBalance());
        
        //base cost of 30.0
        // (Age 15 pays full baseCost since they are not a child <= 12 or senior >= 65)
        visitorPass.processRide(30.0);
        
        //Display the updated balance after the charge
        System.out.println("Balance after ride payment: $" + visitorPass.getBalance());
    }
}