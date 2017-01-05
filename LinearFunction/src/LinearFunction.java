
public class LinearFunction implements LinearFunctionMethods {
	public double intercept;
	public double slope;
	
	public LinearFunction(double mx, double b) {
		slope = mx;
		intercept = b;
	}
	double y = 0;
	
	public double getSlope() {
		return slope;
	}
	public double getYintercept() {
		return intercept;
	}
	public double getRoot() {
		y -= intercept;
		y = (y / slope);
		return y;
		
	}
	public double getYvalue(double x) { //return the y value corresponding to x

		y = slope + intercept;
		return y;
	}
	public double getXvalue(double y) { //return the x value corresponding to y
		double x;
		x = intercept - y;
		return x;
	}

}
