import java.util.List;

public class PictureBuilder {
    protected Picture picture;

    public PictureBuilder() {
        this.picture = new Picture();
    }

    public PictureBuilder setBasicParams(String name, short year, String author) {
        picture.setName(name);
        picture.setYear(year);
        picture.setAuthor(author);
        return this;
    }
    public PictureBuilder setSizeParams(String size) {
        picture.setSize(size);
        return this;
    }


    public PictureBuilder setColorParams(List<String> colors, boolean withFrames, String canvas) {
        picture.setColors(colors);
        picture.setWithFrames(withFrames);
        picture.setCanvas(canvas);
        return this;
    }

    public PictureBuilder setCategoryParams(String theme, String category) {
        picture.setTheme(theme);
        picture.setCategory(category);
        return this;
    }

    public Picture build() {
        return picture;
    }
}
