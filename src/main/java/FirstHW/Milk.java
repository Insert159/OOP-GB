package FirstHW;

public class Milk extends Product {
    private double fatContent;

    public Milk(String name, double cost, double fatContent) {
        super(name, cost);
        this.fatContent = fatContent;
    }

    public double getFatContent() {
        return this.fatContent;
    }

    public String toString() {
        return String.format(super.toString() + " Fat Content: %f", this.fatContent);
    }
}
