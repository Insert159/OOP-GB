package PracticaOpp3;

public class LongBow extends Bow {


    @Override
    public int damage() {

        return 40;

    }

    @Override
    public String toString() {
        return "Длинный лук наносит урон "+damage();
    }
}
