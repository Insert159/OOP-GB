package PracticaOpp3;

public class RoundShield implements Shield {


    @Override
    public int absorb() {
        return 20;
    }

    @Override
    public String toString() {
        return " Круглый щит поглащает урон " + 20;

    }



}
