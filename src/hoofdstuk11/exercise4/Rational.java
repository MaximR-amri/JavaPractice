package hoofdstuk11.exercise4;

public class Rational {
    int denom;
    int numer;

    public Rational() {
        this.denom = 1;
        this.numer = 0;
    }

    public Rational( int numer, int denom) {
        this.denom = denom;
        this.numer = numer;
    }

    public void printRational(){
        System.out.printf("%d/%d%n", this.numer, this.denom);
    }
    public void negate(){
        this.numer = -this.numer;
    }
    public void invert(){
        int temp = this.numer;
        this.numer = this.denom;
        this.denom = temp;
    }

    public String toDouble(){
        double num = this.numer;
        double denom = this.denom;
        return num + "/" + denom;
    }
    @Override
    public String toString() {
        return this.numer + "/" + this.denom;
    }

    public static void main(String[] args) {
        Rational rational = new Rational();
        rational.numer = 3;
        rational.denom = 7;
        Rational rat = new Rational(1,6);
        rat.printRational();
        System.out.println(rat);
        rat.negate();
        System.out.println(rat);
        rat.invert();
        System.out.println(rat);
        System.out.println(rat.toDouble());
    }
}
