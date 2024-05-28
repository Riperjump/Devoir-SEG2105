package pointcp.design5;

/**
 * 
 * This class represents the abstract idea of a point. It will be specialized
 * using PointCP2 and PointCP3
 * which represent polar and cartesian points respectively.
 * 
 *
 */

public abstract class PointCP5Test {
	/**
	 * Contains the current value of X or RHO
	 */
	protected double xOrRho;

	/**
	 * Contains the current value of Y or THETA
	 */
	protected double yOrTheta;

	/**
	 * Constructs a coordinate object
	 */
	public PointCP5Test(double xOrRho, double yOrTheta) {

		this.xOrRho = xOrRho;
		this.yOrTheta = yOrTheta;

	}

	public abstract double getX();

	public abstract double getY();

	public abstract double getRho();

	public abstract double getTheta();

	public abstract PointCP5Test convertStorageToCartesian();

	public abstract PointCP5Test convertStorageToPolar();

	public abstract String toString();

	/**
	 * Calculates the distance in between two points using the Pythagorean
	 * theorem (C ^ 2 = A ^ 2 + B ^ 2).
	 *
	 * @param pointA The first point.
	 * @param pointB The second point.
	 * @return The distance between the two points.
	 */
	public double getDistance(PointCP5Test pointB) {

		double deltaX = getX() - pointB.getX();
		double deltaY = getY() - pointB.getY();

		return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
	}

}