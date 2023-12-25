package ru.netology.domain;
public class Poster {
    private int id;
    private String name;
    private String genre;
    private String imageURL;
    public Poster() {
    }

    public Poster(int id, String name, String genre, String imageURL) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.imageURL = imageURL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
