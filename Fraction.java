
public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction(int num, int denom) {
		numerator = num;
		denominator=denom;
		
	}
	public Fraction() {
		numerator = 0;
		denominator = 1;
	}
	public Fraction (int number) {
		numerator = number;
		denominator = 1;
	}
	public int getNumerator() {
		return numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	public void setNumerator(int num) {
		numerator=num;
	}
	public void setDenominator(int denom) {
		denominator = denom;
	}
	public Fraction add(Fraction f) {
		int num = numerator * f.getDenominator() + f.getNumerator() * denominator;
		int denom = denominator * f.getDenominator();
		return new Fraction(num, denom);
	}
	public Fraction subtract(Fraction f) {
		int num = numerator * f.getDenominator() - f.getNumerator() * denominator;
		int denom = denominator * f.getDenominator();
		return new Fraction(num, denom);
	}
	public Fraction multiply(Fraction f) {
		int num = numerator*f.getNumerator();
		int denom = denominator* f.getDenominator();
		return new Fraction(num, denom);
	}
	public Fraction divide(Fraction f) {
		int num = numerator * f.denominator;
		int denom = denominator * f.numerator;
		return new Fraction(num, denom);
		
	}
	public String toString() {
		return numerator + " / "+ denominator;
	}

}
