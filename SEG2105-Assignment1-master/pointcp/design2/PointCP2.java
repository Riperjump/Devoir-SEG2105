package pointcp.design2;

public class PointCP2 {
    // Instance variables ************************************************

    /**
     * Contains the current value of RHO
     */
    private double rho;

    /**
     * Contains the current value of THETA
     */
    private double theta;

    // Constructors ******************************************************

    /**
     * Constructs a polar coordinate object
     */
    public PointCP2(double rho, double theta) {
        this.rho = rho;
        this.theta = theta;
    }

    // Instance methods **************************************************

    public double getX() {

        return (Math.cos(Math.toRadians(theta)) * rho);
    }

    public double getY() {

        return (Math.sin(Math.toRadians(theta)) * rho);
    }

    public double getRho() {

        return rho;

    }

    public double getTheta() {

        return theta;
    }

    /**
     * Converts Polar coordinates to Cartesian coordinates.
     */
    public void convertStorageToCartesian() {
        // calculate X and Y
        double temp = getX();
        double Y = getY();
        double X = temp;

    }

    /**
     * Converts Cartesian coordinates to Polar coordinates.
     */
    public void convertStorageToPolar() {
    }

    /**
     * Rotates the specified point by the specified number of degrees.
     * Not required until E2.30
     *
     * @param point    The point to rotate
     * @param rotation The number of degrees to rotate the point.
     * @return The rotated image of the original point.
     */
    public PointCP2 rotatePoint(double rotation) {
        double radRotation = Math.toRadians(rotation);
        double X = getX();
        double Y = getY();

        return new PointCP2(
                (Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
                (Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
    }

    /**
     * Calculates the distance in between two polar points using the Pythagorean
     * theorem (C ^ 2 = A ^ 2 + B ^ 2).
     *
     * @param pointA The first point.
     * @param pointB The second point.
     * @return The distance between the two points.
     */
    public double getDistance(PointCP2 pointB) {
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
        return "Stored as Polar [" + getRho() + "," + getTheta() + "]\n";
    }
}
