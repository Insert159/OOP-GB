package PracticaOpp3;

public class LightShield  implements Shield{


    @Override
    public int absorb() {
        return 10;
    }

    @Override
    public String toString() {
        return " Лёгкий щит поглащает урон  "+absorb() ;
    }



}
