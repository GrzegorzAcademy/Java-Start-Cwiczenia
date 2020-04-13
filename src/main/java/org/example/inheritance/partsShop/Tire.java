package org.example.inheritance.partsShop;

public class Tire extends Part {
    private int size;
    private int width;
    private int diameter;

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public Tire(String name, String model, String series, int partId, int size, int width, int diameter) {
        super(name, model, series, partId);
        this.size = size;
        this.width = width;
        this.diameter = diameter;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return  "Name : " + getName() + ", Model : " +getModel()+
               ", Series : " + getSeries() + ", PartID : " + getPartId() +
                ", Size : " + size +
                ", Width : " + width + ", Diameter : " + diameter ;
    }
}
