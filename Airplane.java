package javaPack;

public class Airplane {
    private String callSign;
    private double distance;
    private int direction;
    private int altitude;

    // Default Constructor
    public Airplane() {
        callSign = "AAA01";
        distance = 1.0;
        direction = 0;
        altitude = 0;
    }

    // Parametric Constructor
    public Airplane(String cs, double dist, int dir, int alt) {
        callSign = cs;
        
        // Keep distance positive
        if (dist < 0) {
            distance = -dist;
        } else {
            distance = dist;
        }
        
        // Keep bearing between 0 and 360
        direction = dir % 360;
        if (direction < 0) {
            direction = direction + 360;
        }
        
        // Keep altitude positive
        if (alt < 0) {
            altitude = -alt;
        } else {
            altitude = alt;
        }
    }

    public void move(double dist, int dir) {
        // Simple position shift calculation
        double rad1 = Math.toRadians(90 - direction);
        double x1 = distance * Math.cos(rad1);
        double y1 = distance * Math.sin(rad1);

        double rad2 = Math.toRadians(90 - dir);
        double x2 = dist * Math.cos(rad2);
        double y2 = dist * Math.sin(rad2);

        double newX = x1 + x2;
        double newY = y1 + y2;

        distance = Math.sqrt(newX * newX + newY * newY);
        double angleRad = Math.atan2(newX, newY);
        int angleDeg = (int) Math.round(Math.toDegrees(angleRad));

        if (angleDeg < 0) {
            angleDeg += 360;
        }
        direction = angleDeg % 360;
    }

    public void gainAlt() {
        altitude = altitude + 1000;
    }

    public void loseAlt() {
        altitude = altitude - 1000;
        if (altitude < 0) {
            altitude = 0;
        }
    }

    public int getAlt() {
        return altitude;
    }

    public double getDistance() {
        return distance;
    }

    public String getCallSign() {
        return callSign;
    }

    public double distTo(Airplane other) {
        double r1 = distance;
        double a1 = Math.toRadians(direction);

        double r2 = other.distance;
        double a2 = Math.toRadians(other.direction);

        double x1 = r1 * Math.sin(a1);
        double y1 = r1 * Math.cos(a1);

        double x2 = r2 * Math.sin(a2);
        double y2 = r2 * Math.cos(a2);

        double dx = x1 - x2;
        double dy = y1 - y2;

        return Math.sqrt(dx * dx + dy * dy);
    }

    public String toString() {
        // Formatting direction to 3 digits (e.g. 059 or 000)
        String dirStr = "" + direction;
        if (direction < 10) {
            dirStr = "00" + direction;
        } else if (direction < 100) {
            dirStr = "0" + direction;
        }
        
        // Rounding distance to two decimal places using basic math
        double roundedDist = (int)(distance * 100 + 0.5) / 100.0;
        
        return roundedDist + " miles away at bearing " + dirStr + "°, altitude " + altitude + " feet";
    }
}