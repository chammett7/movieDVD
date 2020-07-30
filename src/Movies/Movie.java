package Movies;

public class Movie {
    private String title, starring, director,releaseDate, classification, genre, duration;
    private boolean borrowed;

    public void setBorrowed(boolean borrowed) {
        if(borrowed) {
        this.borrowedCount++;
        }
        this.borrowed = borrowed;
    }

    public int getBorrowedCount() {
        return borrowedCount;
    }

    private int borrowedCount;


    public Movie(String title, String director, String starring, String genre, String classification,
                 String releaseDate, String duration, int borrowedCount) {
        this.title = title;
        this.director = director;
        this.starring = starring;
        this.genre = genre;
        this.classification = classification;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.borrowed = false;
        this.borrowedCount = borrowedCount;

    }

    public String getTitle() { return title; }

    public String getDirector() { return director; }

    public String getStarring() { return starring; }

    public String getGenre() { return genre; }

    public String getClassification() { return classification; }

    public String getReleaseDate() { return releaseDate; }

    public String getDuration() { return duration; }



}



