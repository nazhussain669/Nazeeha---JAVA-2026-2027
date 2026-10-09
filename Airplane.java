package javaPack; 

// reference from https://youtu.be/cPb7rDeZ8nA
// https://youtu.be/GsHb7GnUQAA
// codewithc.com
// githubgist
// w3schools & codeacademy

public class Airplane 
{ 
    private String callSign; // Stores plane call sign
    private double distance; // Stores plane distance
    private int direction; // Stores plane bearing angle
    private int altitude; // Stores plane altitude

    public Airplane() {
        callSign = "AAA01"; // Sets default call sign
        distance = 1.0; // Sets default distance
        direction = 0; // Sets default bearing
        altitude = 0; // Sets default altitude
    }

    public Airplane(String cs, double dist, int dir, int alt) 
    {
        callSign = cs; // Sets call sign
        distance = dist; // Sets distance
        direction = dir % 360; // Limits bearing to 0-360
        altitude = alt; // Sets altitude
    }

    // Moves plane position
    public void move(double dist, int dir) {
        double rad1 = Math.toRadians(90 - direction); // flips the compass bearing into a standard math angle
        double x1 = distance * Math.cos(rad1); // Calculates current X position
        double y1 = distance * Math.sin(rad1); // Calculates current Y position
        //Since airplanes move on a 2D map, every movement has two parts: horizontal shift (X) and vertical shift (Y)

        // x1 and y1 are the airplane's current position on an X/Y grid based on its starting distance and angle.
        // x2 and y2 are how far east/west (X) and north/south (Y) the plane is moving
        
        double rad2 = Math.toRadians(90 - dir); // Converts movement angle
        double x2 = dist * Math.cos(rad2); // Calculates movement X shift
        double y2 = dist * Math.sin(rad2); // Calculates movement Y shift

        double newX = x1 + x2; // Finds new X position
        double newY = y1 + y2; // Finds new Y position

        distance = Math.sqrt(newX * newX + newY * newY); // uses the Pythagorean theorem to calculate the straight-line distance from the tower
        double angleRad = Math.atan2(newX, newY); // takes the x and y coordinates and calculates the angle in radians pointing from the tower to the plane
        int angleDeg = (int) Math.round(Math.toDegrees(angleRad)); // Converts angle to degrees

        if (angleDeg < 0) { // Checks for negative angle
            angleDeg += 360; // Adjusts angle to positive
        }
        direction = angleDeg % 360; // Keeps bearing within 360 degrees
    }

    // Increases altitude
    public void gainAlt() {
        altitude = altitude + 1000; // Adds 1000 feet
    }

    // Decreases altitude
    public void loseAlt() {
        altitude = altitude - 1000; // Subtracts 1000 feet
        if (altitude < 0) { // Checks if altitude is below 0
            altitude = 0; // Caps lowest altitude at 0
        }
    }

    // Getter for altitude
    public int getAlt() {
        return altitude; // Returns current altitude
    }

    // Getter for call sign
    public String getCallSign() {
        return callSign; // Returns current call sign
    }

    // Calculates distance to another plane
    public double distTo(Airplane other) {
        double r1 = distance; // Gets distance of this plane
        double a1 = Math.toRadians(direction); // Gets angle of this plane

        double r2 = other.distance; // Gets distance of other plane
        double a2 = Math.toRadians(other.direction); // Gets angle of other plane

        double x1 = r1 * Math.sin(a1); // Converts this plane to X
        double y1 = r1 * Math.cos(a1); // Converts this plane to Y

        double x2 = r2 * Math.sin(a2); // Converts other plane to X
        double y2 = r2 * Math.cos(a2); // Converts other plane to Y

        double dx = x1 - x2; // Finds difference in X
        double dy = y1 - y2; // Finds difference in Y

        return Math.sqrt(dx * dx + dy * dy); // Calculates straight-line distance
    }

    // Formats plane details into text
    public String toString() {
        String dirStr = "" + direction; // Converts direction to string
        if (direction < 10) { // Checks if under 10
            dirStr = "00" + direction; // Adds two leading zeros
        } else if (direction < 100) { // Checks if under 100
            dirStr = "0" + direction; // Adds one leading zero
        }

        double roundedDist = (int)(distance * 100 + 0.5) / 100.0; // Rounds distance to 2 decimals

        return roundedDist + " miles away at bearing " + dirStr + "°, altitude " + altitude + " feet"; // Returns formatted string
    }
}