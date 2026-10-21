package javaPack;

public class RidePass {
    
    private double balance; // current pass balance in dollars
    private boolean isVIP;  // true if pass has VIP status for peak access
    private int age;        // age of pass holder in years

    //Constructs a RidePass with balance b, VIP status v, and age a
    public RidePass(double b, boolean v, int a) {
        balance = b;
        isVIP = v;
        age = a;
    }

    public double getBalance() 
    { 
        return balance; //returns values
    }
    
    public boolean getVIP() 
    { 
        return isVIP; 
    }
    
    public int getAge() 
    { 
        return age; 
    }

     //Deducts cost from balance. Guaranteed balance >= cost[cite: 12]
    public void charge(double cost) 
    {
        balance = balance - cost;
    }

     //Returns true if the pass holder meets all criteria to board the ride or returns false otherwise
    public boolean canRide(double rideCost, int minAge, boolean isPeakHour, boolean requiresVIP) {
        //Pass holder's age is at least equal to minAge
        boolean ageValid = (age >= minAge);
        
        //Current pass balance is greater than or equal to rideCost
        boolean balanceValid = (balance >= rideCost);
        
        //If isPeakHour is true, visitor must be VIP OR ride must not require VIP
        boolean peakValid = !isPeakHour || isVIP || !requiresVIP;

        // All conditions must be met
        return ageValid && balanceValid && peakValid;
    }

     //Calculates the final discounted cost based on age and processes the charge
    public void processRide(double baseCost) {
        double finalCost = baseCost;

        // Children (age 12 or under) receive a 20% discount (pay 80%
        if (age <= 12) {
            finalCost = baseCost * 0.80;
        }
        // Seniors (age 65 or older) receive a 30% discount (pay 70%)
        else if (age >= 65) {
            finalCost = baseCost * 0.70;
        }
        // All other age groups pay the full baseCost

        // Deduct the final cost from the pass balance
        charge(finalCost);
    }
}