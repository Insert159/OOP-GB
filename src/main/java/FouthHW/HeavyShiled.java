package PracticaOpp3;

public class HeavyShiled implements Shield {


    @Override
    public int absorb() {
        return 30;
    }


    @Override
    public String toString() {
        return  "  Тяжёлый щит поглащает урон " +absorb();
    }


}
