package pl.comarch.szkolenia.enumy;

import java.util.Comparator;

public enum Console {
    PS4("Sony", "PlayStation4", 2013, "Intel"),
    PS5("Sony", "PlayStation5", 2020, "Intel"),
    XBOX("Microsoft", "XBox One X", 2015, "AMD"),
    SWITCH("Nintendo", "Switch", 2011, "Intel");

    private String brand;
    private String model;
    private int releaseDate;
    private String cpu;

    Console(String brand, String model, int releaseDate, String cpu) {
        this.brand = brand;
        this.model = model;
        this.releaseDate = releaseDate;
        this.cpu = cpu;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
}
