
class Movie {
    private String title;
    private String director;
    private double rate;
    private int year;

    Movie(String t, String d, double r, int y) {
        title = t;
        director = d;
        rate = r;
        year = y;
    }

    void print() {
        System.out.println("제목 : " + title);
        System.out.println("감독 : " + director);
        System.out.println("평점 : " + rate);
        System.out.println("연도 : " + year);
    }
}

public class MovieTest {
    public static void main(String[] args) {
        Movie movie = new Movie("ABC", "Kim", 4.37, 2015);
        movie.print();
    }
}
