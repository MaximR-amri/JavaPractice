package hoofdstuk11.c;

public class Date {
    int year;
    int month;
    int day;

    public Date() {
        this.year = 2021;
        this.month = 3;
        this.day = 8;
    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return year + " " + month + " " + day;
    }


}
