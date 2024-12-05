import java.util.ArrayList;
import java.util.List;

public class Picture {

    private String name = "Portraits";
    private short year = 2000;
    private String author = "Nard";
    private String theme = "Portrait";
    private String category = "Portrait";
    private List<String> colors = new ArrayList<>(List.of("Black", "White"));
    private String size = "100x100"; // Размеры в формате строки
    private boolean isWithFrames = false;
    private String canvas = "Default Canvas";


    public Picture(String name, short year, String author, String theme, String category,
                   List<String> colors, String size, boolean isWithFrames, String canvas) {
        this.name = name;
        this.year = year;
        this.author = author;
        this.theme = theme;
        this.category = category;
        this.colors = colors;
        this.size = size;
        this.isWithFrames = isWithFrames;
        this.canvas = canvas;
    }

    public Picture(String name, short year, String author, String canvas) {
        this.name = name;
        this.year = year;
        this.author = author;
        this.canvas = canvas;

        // Остальные поля инициализируются значениями по умолчанию
        this.theme = "Portrait";
        this.category = "Portrait";
        this.colors = new ArrayList<>(List.of("Black", "White"));
        this.size = "100x100";
        this.isWithFrames = false;
    }

    public Picture() {
    }

    public String getName() {
        return name;
    }

    public short getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public String getTheme() {
        return theme;
    }

    public String getCategory() {
        return category;
    }

    public List<String> getColors() {
        return colors;
    }

    public String getSize() {
        return size;
    }

    public boolean isWithFrames() {
        return isWithFrames;
    }

    public String getCanvas() {
        return canvas;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setColors(List<String> colors) {
        this.colors = colors;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setWithFrames(boolean isWithFrames) {
        this.isWithFrames = isWithFrames;
    }

    public void setCanvas(String canvas) {
        this.canvas = canvas;
    }
}
