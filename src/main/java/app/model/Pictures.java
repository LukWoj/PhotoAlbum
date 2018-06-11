package app.model;

public class Pictures {

    private String fileName;
    private String username;
    private boolean favorite;
    private int categoryId;


    public Pictures(String fileName) {
        this.fileName = fileName;
    }

    public Pictures(String fileName, boolean favorite) {
        this(fileName);
        this.favorite = favorite;
    }

    public Pictures(String fileName, boolean favorite, int categoryId) {
        this(fileName,favorite);
        this.categoryId = categoryId;
    }

    public Pictures(String fileName, String username, boolean favorite, int categoryId) {
        this.fileName = fileName;
        this.username = username;
        this.favorite = favorite;
        this.categoryId = categoryId;
    }

    public String getFileName() {
        return fileName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public String getThymeleafFilePath() {
        return "/gifs/" + getFileName() + ".gif";
    }

    public void changeFavorite() {
        this.favorite = !this.favorite;
    }
}
