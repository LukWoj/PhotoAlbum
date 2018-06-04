package app.model;

public class PicturesProperties {

    private String name;
    private String username;
    private boolean isFavourite;
    private int categoryId;


    public PicturesProperties(String filename) {
        this.name = filename;
        this.isFavourite = false;
    }

    public PicturesProperties(String filename, boolean isFavourite) {
        this.name = filename;
        this.isFavourite = isFavourite;
    }

    public String getName() {
        return name;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isFavourite() {
        return isFavourite;
    }

    public void setFavourite(boolean favourite) {
        isFavourite = favourite;
    }

    public String getThymeleafFilePath(){
        return "/gifs/" + getName() + ".jpg";
    }

    @Override
    public String toString() {
        return "PicturesProperties{" +
                "name='" + name + '\'' +
                '}';
    }
}
