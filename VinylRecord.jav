// VinylRecord.java

public class VinylRecord extends RecordShop {
    private int releaseYear;
    private String genre;

    // No-argument constructor
    public VinylRecord() {
        super();
        this.releaseYear = 0;
        this.genre = "Unknown";
    }

    // Parameterized constructor
    public VinylRecord(String name, String description, double price, int releaseYear, String genre) {
        super(name, description, price);
        this.releaseYear = releaseYear;
        this.genre = genre;
    }

    // Accessor methods
    public int getReleaseYear() {
        return releaseYear;
    }

    public String getGenre() {
        return genre;
    }

    // Mutator methods
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    // toString method
    public String toString() {
        return super.toString() + " || Release Year: " + releaseYear + " || Genre: " + genre;
    }
}
