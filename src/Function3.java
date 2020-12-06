import java.text.DecimalFormat;

public class Function3 extends Function {

	@Override
	public String answerString(double optVal, double x, double y, double z) {
		DecimalFormat numberFormat = new DecimalFormat("#.00");
		return "The smallest distance between point (0,1) and the function f(x) = x^2 is: "
				+numberFormat.format(optVal)+
				" and it occurs at the points ( "+numberFormat.format(x)+" , "+numberFormat.format(y)+")"+
				" and ("+numberFormat.format(-x)+" , "+numberFormat.format(y)+")";
	}

	@Override
	public double fnValue(double x) {
		return Math.sqrt(Math.pow(x, 4) - Math.pow(x, 2) + 1);
	}

	@Override
	public double getXVal(double x) {
		return x;
	}

	@Override
	public double getYVal(double x) {
		return Math.pow(x,2);
	}

	@Override
	public double getZVal(double x) {
		return -1.0;
	}
	@Override
	public String toString() {
	    return "Find the minimum distance between the function f(x)=x^2 and the point (0,1)"
	    		+ "\nThis distance is described by the function d(x)=sqrt(x^4-x^2+1)";

	}
}
