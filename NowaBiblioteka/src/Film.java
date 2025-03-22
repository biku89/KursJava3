public class Film extends LibraryItem {
    private String directory;
    private double durationFilm;
    private static int countFilm;

    public Film(String title, String directory, double durationFilm) {
        super(title);
        this.directory = directory;
        this.durationFilm = durationFilm;
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public double getDurationFilm() {
        return durationFilm;
    }

    public void setDurationFilm(double durationFilm) {
        this.durationFilm = durationFilm;
    }

    public static int getCountFilm() {
        return countFilm;
    }

    public static void setCountFilm(int countFilm) {
        Film.countFilm = countFilm;
    }
}
