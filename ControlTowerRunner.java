package javaPack;

import java.util.Scanner;

public class ControlTowerRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input prompt matching Tutorial 2 & 3 style
        System.out.println("Enter the details of the third airplane (call-sign, distance, bearing and altitude):");
        String cs3 = input.nextLine();
        double dist3 = input.nextDouble();
        int dir3 = input.nextInt();
        int alt3 = input.nextInt();

        // Convert call sign to uppercase (Tutorial 1)
        cs3 = cs3.toUpperCase();

        // Object creation (Tutorial 2)
        Airplane plane1 = new Airplane();
        Airplane plane2 = new Airplane("AAA02", 15.8, 128, 30000);
        Airplane plane3 = new Airplane(cs3, dist3, dir3, alt3);

        // Print Initial Positions
        System.out.println("\nInitial Positions:");
        System.out.println("\"Airplane 1\": " + plane1.getCallSign());
        System.out.println("\"Airplane 2\": " + plane2.getCallSign());
        System.out.println("\"Airplane 3\": " + plane3.getCallSign());

        System.out.println("\nInitial Distances:");
        System.out.println(plane1.toString());
        System.out.println(plane2.toString());
        System.out.println(plane3.toString());

        // Distance Calculations
        double dist12 = plane1.distTo(plane2);
        double dist13 = plane1.distTo(plane3);
        double dist23 = plane2.distTo(plane3);

        // Rounding using basic integer casting (Tutorial 3 concept)
        dist12 = (int)(dist12 * 100 + 0.5) / 100.0;
        dist13 = (int)(dist13 * 100 + 0.5) / 100.0;
        dist23 = (int)(dist23 * 100 + 0.5) / 100.0;

        System.out.println("\nThe distance between Airplane 1 and Airplane 2 is " + dist12 + " miles.");
        System.out.println("The distance between Airplane 1 and Airplane 3 is " + dist13 + " miles.");
        System.out.println("The distance between Airplane 2 and Airplane 3 is " + dist23 + " miles.");

        // Initial Height Differences
        System.out.println("\nInitial Height Differences:");
        System.out.println("The difference in height between Airplane 1 and Airplane 2 is " + Math.abs(plane1.getAlt() - plane2.getAlt()) + " feet.");
        System.out.println("The difference in height between Airplane 1 and Airplane 3 is " + Math.abs(plane1.getAlt() - plane3.getAlt()) + " feet.");
        System.out.println("The difference in height between Airplane 2 and Airplane 3 is " + Math.abs(plane2.getAlt() - plane3.getAlt()) + " feet.");

        // Move airplanes
        plane1.move(dist23, 65);
        plane2.move(8.0, 135);
        plane3.move(5.0, 55);

        // Altitude Changes
        plane1.gainAlt();
        plane1.gainAlt();
        plane1.gainAlt();

        plane2.loseAlt();
        plane2.loseAlt();

        plane3.loseAlt();
        plane3.loseAlt();
        plane3.loseAlt();
        plane3.loseAlt();

        // Print New Positions
        System.out.println("\nNew Positions:");
        System.out.println("\"Airplane 1\": " + plane1.getCallSign());
        System.out.println("\"Airplane 2\": " + plane2.getCallSign());
        System.out.println("\"Airplane 3\": " + plane3.getCallSign());

        System.out.println("\nNew Distances:");
        System.out.println(plane1.toString());
        System.out.println(plane2.toString());
        System.out.println(plane3.toString());

        // Recalculate distances
        dist12 = (int)(plane1.distTo(plane2) * 100 + 0.5) / 100.0;
        dist13 = (int)(plane1.distTo(plane3) * 100 + 0.5) / 100.0;
        dist23 = (int)(plane2.distTo(plane3) * 100 + 0.5) / 100.0;

        System.out.println("\nThe distance between Airplane 1 and Airplane 2 is " + dist12 + " miles.");
        System.out.println("The distance between Airplane 1 and Airplane 3 is " + dist13 + " miles.");
        System.out.println("The distance between Airplane 2 and Airplane 3 is " + dist23 + " miles.");

        // New Height Differences
        System.out.println("\nNew Height Differences:");
        System.out.println("The difference in height between Airplane 1 and Airplane 2 is " + Math.abs(plane1.getAlt() - plane2.getAlt()) + " feet.");
        System.out.println("The difference in height between Airplane 1 and Airplane 3 is " + Math.abs(plane1.getAlt() - plane3.getAlt()) + " feet.");
        System.out.println("The difference in height between Airplane 2 and Airplane 3 is " + Math.abs(plane2.getAlt() - plane3.getAlt()) + " feet.");
    }
}