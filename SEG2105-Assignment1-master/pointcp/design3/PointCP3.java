package pointcp.design3;

public class PointCP3 {
    // Instance variables ************************************************

    /**
     * Contains the current value of X
     */
    private double X;

    /**
     * Contains the current value of Y
     */
    private double Y;

    // Constructors ******************************************************

    /**
     * Constructs a polar coordinate object
     */
    public PointCP3(double X, double Y) {
        this.X = X;
        this.Y = Y;
    }

    // Instance methods **************************************************

    public double getX() {

        return X;
    }

    public double getY() {

        return Y;
    }

    public double getRho() {

        return (Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2)));

    }

    public double getTheta() {

        return Math.toDegrees(Math.atan2(Y, X));
    }

    /**
     * Converts Polar coordinates to Cartesian coordinates.
     */
    public void convertStorageToCartesian() {
    }

    /**
     * Converts Cartesian coordinates to Polar coordinates.
     */
    public void convertStorageToPolar() {
        double temp = getRho();
        double Y = getTheta();
        double X = temp;
    }

    /**
     * Rotates the specified point by the specified number of degrees.
     * Not required until E2.30
     *
     * @param point    The point to rotate
     * @param rotation The number of degrees to rotate the point.
     * @return The rotated image of the original point.
     */
    public PointCP3 rotatePoint(double rotation) {
        double radRotation = Math.toRadians(rotation);
        double Xa = getX();
        double Ya = getY();

        return new PointCP3(
                (Math.cos(radRotation) * Xa) - (Math.sin(radRotation) * Ya),
                (Math.sin(radRotation) * Xa) + (Math.cos(radRotation) * Ya));
    }

    /**
     * Calculates the distance in between two polar points using the Pythagorean
     * theorem (C ^ 2 = A ^ 2 + B ^ 2).
     *
     * @param pointA The first point.
     * @param pointB The second point.
     * @return The distance between the two points.
     */
    public double getDistance(PointCP3 pointB) {
        // Obtain differences in X and Y, sign is not important as these values
        // will be squared later.
        double deltaX = getX() - pointB.getX();
        double deltaY = getY() - pointB.getY();

        return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
    }

    /**
     * Returns information about the coordinates.
     *
     * @return A String containing information about the coordinates.
     */
    public String toString() {
        return "Stored as Cartesian [" + getX() + "," + getY() + "]\n";
    }
}
