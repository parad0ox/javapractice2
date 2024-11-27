public class Main {
    public static void main(String[] args) {
        Gallery gallery = Gallery.getInstance("My Gallery");

        Picture picture1 = new Picture("Portraits ", (short) 1849, "Nard", "images/painting1.jpg");
        gallery.addPicture(picture1);

        System.out.println(gallery.getPictureDescription(picture1));
    }
}