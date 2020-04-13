package org.example.inheritance.partsShop;

public class ExhaustPart extends Part {
    private String euroStandard;

    public ExhaustPart(String name, String model, String series, int partId, String euroStandard) {
        super(name, model, series, partId);
        this.euroStandard = euroStandard;
    }

    public String getEuroStandard() {
        return euroStandard;
    }

    public void setEuroStandard(String euroStandard) {
        this.euroStandard = euroStandard;
    }

    @Override
    public String toString() {
        return "Name : " + getName()+ ", Model : " + getModel()+ ", Series : "
                + getSeries() + ", PartId : " + getPartId() +
                ", Euro Standard : " + getEuroStandard();
    }
}