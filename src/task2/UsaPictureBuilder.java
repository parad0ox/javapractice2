import java.util.List;

public class UsaPictureBuilder extends PictureBuilder {

    public UsaPictureBuilder() {
        super();
    }

    @Override
    public PictureBuilder setBasicParams(String name, short year, String author) {
        super.setBasicParams(name, year, author);
        
        picture.setCategory("USA Art");
        return this;
    }

    @Override
    public PictureBuilder setCategoryParams(String theme, String category) {
        super.setCategoryParams(theme, category);
        
        picture.setTheme("American Theme");
        return this;
    }
}
