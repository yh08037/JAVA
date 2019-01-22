
class Date {
    private int year;
    private int month;
    private int day;

    final private static String[] monthName = {"January", "Febuary", "March", "April", "May", "June", "July",
                                              "August", "September", "October", "November", "December"};

    Date(int y, int m, int d) {
        this.year = y;
        this.month = m;
        this.day = d;
    }

    void print1() {
        System.out.println(year + "." + month + "." + day);
    }
    void print2() {
        System.out.println(monthName[month-1] + " " + day + ", " + year);
    }
}

public class DateTest {
    public static void main(String[] args) {
        Date myDate = new Date(2012, 7, 12);
        myDate.print1();
        myDate.print2();
    }
}
