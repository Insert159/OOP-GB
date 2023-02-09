package PracticaOpp3;

public class Pikestaff implements Weapon {


    @Override
    public int damage() {
       return 45;

    }


    @Override
    public String toString() {
        return "Посох наносит урон "+damage();
    }
}
