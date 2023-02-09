package PracticaOpp3;

public class Bow implements Weapon {


    @Override
    public int damage() {

        return 30;

    }

    @Override
    public String toString() {
        return " лук наносит урон "+damage();
    }
}
