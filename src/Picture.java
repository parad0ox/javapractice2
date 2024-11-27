public class Picture {
    private String name;
    private short year;
    private String author;
    private String filePath;

    // Constructor
    public Picture(String name, short year, String author, String filePath) {
        this.name = name;
        this.year = year;
        this.author = author;
        this.filePath = filePath;
    }

    public String getName() { // Existing getter method
        return name;
    }

    public short getYear() { // New getter method for year
        return year;
    }

    public String getAuthor() { // New getter method for author
        return author;
    }

    public String getFilePath() { // New getter method for filePath
        return filePath;
    }
}