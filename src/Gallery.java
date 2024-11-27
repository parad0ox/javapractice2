import java.util.ArrayList;
import java.util.List;

public class Gallery {
    private static Gallery instance;
    private List<Picture> pictures = new ArrayList<>();
    private String name;
    private String article; // Corrected field declaration

    private Gallery(String name) { // Single constructor
        this.name = name;
    }

    public static Gallery getInstance(String name) {
        if (instance == null) {
            instance = new Gallery(name);
        }
        return instance;
    }

    public void addPicture(Picture picture) {
        pictures.add(picture);
    }

    public void removePicture(Picture picture) {
        pictures.remove(picture);
    }

    public Picture getPictureByName(String name) {
        for (Picture picture : pictures) {
            if (picture.getName().equals(name)) {
                return picture;
            }
        }
        return null;
    }

    public List<Picture> getAllPictures() {
        return new ArrayList<>(pictures);
    }

    public void saveToFile(String filePath) {
        // Implement logic to save pictures to a file
    }

    public void loadFromFile(String filePath) {
        // Implement logic to load pictures from a file
    }

    public String getPictureDescription(Picture picture) {
        return "Name: " + picture.getName() + ", Year: " + picture.getYear() + ", Author: " + picture.getAuthor();
    }

    public List<Picture> searchByAuthor(String author) {
        List<Picture> results = new ArrayList<>();
        for (Picture picture : pictures) {
            if (picture.getAuthor().equals(author)) {
                results.add(picture);
            }
        }
        return results;
    }

    public List<Picture> searchByYear(short year) {
        List<Picture> results = new ArrayList<>();
        for (Picture picture : pictures) {
            if (picture.getYear() == year) {
                results.add(picture);
            }
        }
        return results;
    }

    public String getArticle() { // Added semicolon
        return article;
    }

    public String getArticleDescription(Picture picture) {
        return "Name: " + picture.getName() + ", Year: " + picture.getYear() + ", Author: " + picture.getAuthor() + "\n Опис: Це захоплюючий портрет, що зображує партію в нарди. На картині детально промальовані дошка, фішки та вирази обличчя гравців, які передають напруження та зосередженість, притаманні цій грі.";
    }


}