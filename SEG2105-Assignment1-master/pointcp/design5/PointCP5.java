package pointcp.design5;

/**
 * 
 * CLass abstraite pour Cp2 et Cp3
 * 
 *
 */
public abstract class PointCP5 {

    protected double xOrRho;

    protected double yOrTheta;

    public abstract double getX();

    public abstract double getY();

    public abstract double getRho();

    public abstract double getTheta();

    public abstract PointCP5 convertStorageToCartesian();

    public abstract PointCP5 convertStorageToPolar();

    public abstract String toString();

    /**
     * Calculates the distance in between two points using the Pythagorean
     * theorem (C ^ 2 = A ^ 2 + B ^ 2).
     *
     * @param pointA The first point.
     * @param pointB The second point.
     * @return The distance between the two points.
     */
    public double getDistance(PointCP5 pointB) {

        double deltaX = getX() - pointB.getX();
        double deltaY = getY() - pointB.getY();

        return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
    }

}
