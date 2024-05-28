package pointcp.design5;

public class PointCP2 extends PointCP5 {

    // Constructors ******************************************************

    /**
     * Constructs a coordinate object
     */
    public PointCP2(double rho, double theta) {

        this.xOrRho = rho;
        this.yOrTheta = theta;
    }

    // Instance methods **************************************************

    public double getX() {

        return (Math.cos(Math.toRadians(yOrTheta)) * xOrRho);
    }

    public double getY() {

        return (Math.sin(Math.toRadians(yOrTheta)) * xOrRho);
    }

    public double getRho() {

        return xOrRho;

    }

    public double getTheta() {

        return yOrTheta;
    }

    public PointCP5 convertStorageToPolar() {
        PointCP5 a = new PointCP2(xOrRho, yOrTheta);
        return a;
    }

    public PointCP5 convertStorageToCartesian() {
        double temp = getX();
        yOrTheta = getY();
        xOrRho = temp;
        PointCP5 a = new PointCP2(xOrRho, yOrTheta);
        return a;
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
