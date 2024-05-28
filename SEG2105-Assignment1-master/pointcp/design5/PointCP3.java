package pointcp.design5;

public class PointCP3 extends PointCP5 {

    // Constructors ******************************************************

    /**
     * Constructs a coordinate object, with a type identifier.
     */
    public PointCP3(double x, double y) {
        this.xOrRho = x;
        this.yOrTheta = y;
    }

    // Instance methods **************************************************

    public double getX() {

        return xOrRho;
    }

    public double getY() {

        return yOrTheta;
    }

    public double getRho() {

        return (Math.sqrt(Math.pow(xOrRho, 2) + Math.pow(yOrTheta, 2)));

    }

    public double getTheta() {

        return Math.toDegrees(Math.atan2(yOrTheta, xOrRho));
    }

    public PointCP5 convertStorageToPolar() {
        double temp = getRho();
        yOrTheta = getTheta();
        xOrRho = temp;
        PointCP5 a = new PointCP3(xOrRho, yOrTheta);
        return a;
    }

    public PointCP5 convertStorageToCartesian() {
        PointCP5 a = new PointCP3(xOrRho, yOrTheta);
        return a;
    }

    /**
     * Returns information about the coordinates.
     *
     * @return A String containing information about the coordinates.
     */
    public String toString() {
        return "Stored as Cartesian (" + getX() + "," + getY() + ")\n";
    }
}
