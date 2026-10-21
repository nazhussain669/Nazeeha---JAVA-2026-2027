package javaPack;

import java.util.Scanner; 

public class CollectRideInfo {
    Scanner allinput = new Scanner(System.in);

    public CollectRideInfo() {
        gatherInfo();
    }

    public void gatherInfo() {
        System.out.print("Enter your pass balance: "); //Collect pass balance
        double balance = allinput.nextDouble();

        System.out.print("Are you a VIP? (true/false): "); //vip status
        boolean isVIP = allinput.nextBoolean();

        System.out.print("Enter your age: ");
        int age = allinput.nextInt();

        RidePass userPass = new RidePass(balance, isVIP, age); // Create the RidePass using user inputs

        System.out.print("Enter ride cost: "); //ask for  and store ride cost
        double rideCost = allinput.nextDouble();

        System.out.print("Enter minimum age required: ");
        int minAge = allinput.nextInt();

        System.out.print("Is it peak hour? (true/false): ");
        boolean isPeakHour = allinput.nextBoolean();

        System.out.print("Does the ride require VIP? (true/false): ");
        boolean requiresVIP = allinput.nextBoolean();

        // Test the canRide method
        boolean result = userPass.canRide(rideCost, minAge, isPeakHour, requiresVIP); //canrdie checks if the visotr can ride
        System.out.println("\n--- Results ---"); //print results
        System.out.println("Can the visitor board the ride? " + result);
        System.out.println("Starting balance: $" + userPass.getBalance());

        // 3. Process the ride payment
        System.out.print("\nEnter base cost of the ride to process payment: ");
        double baseCost = allinput.nextDouble();

        userPass.processRide(baseCost);
        System.out.println("Balance after ride payment: $" + userPass.getBalance());
        
        allinput.close();
    }
}