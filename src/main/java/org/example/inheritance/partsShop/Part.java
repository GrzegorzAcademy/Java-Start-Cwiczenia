package org.example.inheritance.partsShop;

public class Part {
    private int partId;
    private String name;
    private String series;
    private String model;

    public Part(String name, String model,  String series,  int partId) {
        this.partId = partId;
        this.name = name;
        this.series = series;
        this.model = model;
    }

    public int getPartId() {
        return partId;
    }

    public void setPartId(int partId) {
        this.partId = partId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
