package FirstHW;

public class Chocolate extends Product {
    private double cocoContent;

    public Chocolate(String name, double cost, double cocoContent) {
        super(name, cost);
        this.cocoContent = cocoContent;
    }

    public String toString() {
        return String.format(super.toString() + " Coco Content: %f", this.cocoContent);
    }
}
