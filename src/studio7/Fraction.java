public class Fraction {
    private int numerator; 
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public addFraction(Fraction other) {
        int newNumerator = this.numerator * other.denominator + this.denominator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return newNumerator, newDenominator;
    }

    public static void main(String[] args) {
        Fraction F1 = new Fraction(2,3 );
        Fraction F2 = new Fraction(3,4 );

    }


}



/*
 * if (this.denominator == other.denominator) {
            int newNumerator = this.numerator + other.numerator;
            return newNumerator + " / "  + this.denominator;
       } else {
 */