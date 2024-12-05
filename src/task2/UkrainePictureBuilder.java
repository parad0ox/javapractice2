import java.util.List;

public class UkrainePictureBuilder extends PictureBuilder {

    public UkrainePictureBuilder() {
        super();
    }

    @Override
    public PictureBuilder setBasicParams(String name, short year, String author) {
        super.setBasicParams(name, year, author);
        picture.setCategory("Ukrainian Art");
        return this;
    }

    @Override
    public PictureBuilder setCategoryParams(String theme, String category) {
        super.setCategoryParams(theme, category);
        picture.setTheme("Ukrainian Theme");
        return this;
    }
}
