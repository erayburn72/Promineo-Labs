package week05Interface;

public class MultiplicationOperation implements MathOperation {

	@Override
	public double evaluate(double a, double b) {
		
		return a * b;
		
	}
}
