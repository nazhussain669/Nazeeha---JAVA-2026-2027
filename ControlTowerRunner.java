package javaPack;

import java.util.Scanner; 

public class ControlTowerRunner 
{ 
    public static void main(String[] args) 
    { 
        Scanner input = new Scanner(System.in); 

        System.out.println("Enter the details of the third airplane (call-sign, distance, bearing and altitude):"); // Prompts user[cite: 1, 4, 5, 6, 7, 8, 9]
        String cs3 = input.nextLine(); // Reads call sign text
        double dist3 = input.nextDouble(); // Reads distance value
        int dir3 = input.nextInt(); // Reads bearing value
        int alt3 = input.nextInt(); // Reads altitude value

        cs3 = cs3.toUpperCase(); // Converts call sign to uppercase

        Airplane plane1 = new Airplane(); // Creates plane 1 with default values
        Airplane plane2 = new Airplane("AAA02", 15.8, 128, 30000); // Creates plane 2 with given values
        Airplane plane3 = new Airplane(cs3, dist3, dir3, alt3); // Creates plane 3 with user values

        System.out.println("\nInitial Positions:"); 
        System.out.println("\"Airplane 1\": " + plane1.getCallSign()); 
        System.out.println("\"Airplane 2\": " + plane2.getCallSign()); 
        System.out.println("\"Airplane 3\": " + plane3.getCallSign());

        System.out.println("\nInitial Distances:"); 
        System.out.println(plane1.toString()); // Prints plane 1 details[cite: 8, 9]
        System.out.println(plane2.toString()); 
        System.out.println(plane3.toString()); 

        double dist12 = plane1.distTo(plane2); // Calculates distance between plane 1 and 2
        double dist13 = plane1.distTo(plane3); 
        double dist23 = plane2.distTo(plane3); 

        dist12 = (int)(dist12 * 100 + 0.5) / 100.0; // Rounds distance 1-2 to 2 decimals
        dist13 = (int)(dist13 * 100 + 0.5) / 100.0; // Rounds distance 1-3 to 2 decimals
        dist23 = (int)(dist23 * 100 + 0.5) / 100.0; // Rounds distance 2-3 to 2 decimals

        System.out.println("\nThe distance between Airplane 1 and Airplane 2 is " + dist12 + " miles."); // Prints distance 1-2[cite: 9]
        System.out.println("The distance between Airplane 1 and Airplane 3 is " + dist13 + " miles."); 
        System.out.println("The distance between Airplane 2 and Airplane 3 is " + dist23 + " miles."); 

        System.out.println("\nInitial Height Differences:");
        System.out.println("The difference in height between Airplane 1 and Airplane 2 is " + Math.abs(plane1.getAlt() - plane2.getAlt()) + " feet."); // Prints height diff 1-2
        System.out.println("The difference in height between Airplane 1 and Airplane 3 is " + Math.abs(plane1.getAlt() - plane3.getAlt()) + " feet.");
        System.out.println("The difference in height between Airplane 2 and Airplane 3 is " + Math.abs(plane2.getAlt() - plane3.getAlt()) + " feet."); 

        plane1.move(dist23, 65); // Moves plane 1
        plane2.move(8.0, 135); // Moves plane 2
        plane3.move(5.0, 55); // Moves plane 3

        plane1.gainAlt(); // Adds 1000 ft to plane 1
        plane1.gainAlt(); // Adds 1000 ft to plane 1
        plane1.gainAlt(); // Adds 1000 ft to plane 1

        plane2.loseAlt(); // Subtracts 1000 ft from plane 2
        plane2.loseAlt(); // Subtracts 1000 ft from plane 2

        plane3.loseAlt(); // Subtracts 1000 ft from plane 3
        plane3.loseAlt(); // Subtracts 1000 ft from plane 3
        plane3.loseAlt(); // Subtracts 1000 ft from plane 3
        plane3.loseAlt(); // Subtracts 1000 ft from plane 3

        System.out.println("\nNew Positions:");
        System.out.println("\"Airplane 1\": " + plane1.getCallSign()); // Prints updated plane 1 call sign
        System.out.println("\"Airplane 2\": " + plane2.getCallSign()); 
        System.out.println("\"Airplane 3\": " + plane3.getCallSign()); 

        System.out.println("\nNew Distances:"); 
        System.out.println(plane1.toString()); // Prints new plane 1 details
        System.out.println(plane2.toString()); 
        System.out.println(plane3.toString()); 

        dist12 = (int)(plane1.distTo(plane2) * 100 + 0.5) / 100.0; // Recalculates rounded distance 1-2
        dist13 = (int)(plane1.distTo(plane3) * 100 + 0.5) / 100.0;  
        dist23 = (int)(plane2.distTo(plane3) * 100 + 0.5) / 100.0; 

        System.out.println("\nThe distance between Airplane 1 and Airplane 2 is " + dist12 + " miles."); // Prints new distance 1-2
        System.out.println("The distance between Airplane 1 and Airplane 3 is " + dist13 + " miles."); 
        System.out.println("The distance between Airplane 2 and Airplane 3 is " + dist23 + " miles."); 

        System.out.println("\nNew Height Differences:"); 
        System.out.println("The difference in height between Airplane 1 and Airplane 2 is " + Math.abs(plane1.getAlt() - plane2.getAlt()) + " feet."); // Prints new height diff 
        System.out.println("The difference in height between Airplane 1 and Airplane 3 is " + Math.abs(plane1.getAlt() - plane3.getAlt()) + " feet."); 
        System.out.println("The difference in height between Airplane 2 and Airplane 3 is " + Math.abs(plane2.getAlt() - plane3.getAlt()) + " feet."); 

        input.close(); 
    }
}