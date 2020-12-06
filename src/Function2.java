import java.text.DecimalFormat;

public class Function2 extends Function {

	@Override
	public String answerString(double optVal, double x, double y, double z) {
		DecimalFormat numberFormat = new DecimalFormat("#.00");
		return "The fastest time that the dog can reach the ball is "+numberFormat.format(optVal)+
				" seconds and it will occur at the distance of "+numberFormat.format(x)+"m";
				}

	@Override
	public double fnValue(double x) {
		return (x/3) + (2 *  Math.sqrt(Math.pow(x,2)- 8 * x + 25));
	}

	@Override
	public double getXVal(double x) {
		return x;
	}

	@Override
	public double getYVal(double x) {
		return -1.0;
	}

	@Override
	public double getZVal(double x) {
		return -1.0;
	}
	@Override
	public String toString() {
	    return "Minimize the distance a dog will run and swim to retrieve a ball in the ocean";

	}
}
