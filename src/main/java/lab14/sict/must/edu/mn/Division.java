package lab14.sict.must.edu.mn;

/**
 * Simple division class.
 */
public class Division {
    /**
     * Divides two numbers.
     * @param a numerator
     * @param b denominator
     * @return result of division
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}
