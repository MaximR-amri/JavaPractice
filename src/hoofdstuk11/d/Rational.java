package hoofdstuk11.d;

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


}
