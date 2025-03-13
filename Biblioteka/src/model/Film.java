package model;

public class Film extends LibraryItem {
    private String director;
    private double durationMinute;
    private static int filmCount = 0;

    public Film(String title, String director, double durationMinute) {
        super(title);
        this.director = director;
        this.durationMinute = durationMinute;
        filmCount++;
    }

    public static int getFilmCount() {
        return filmCount;
    }

    @Override
    public String toString() {
        return super.toString() +  " Reżyser " + director + " " + "Czas trwania " + durationMinute;
    }
}
