package week05Interface;

public class AdditionOperation implements MathOperation {

	@Override
	public double evaluate(double a, double b) {
		
		return a + b;
		
	}
}
