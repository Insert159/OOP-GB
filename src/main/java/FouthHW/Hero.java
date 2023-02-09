package PracticaOpp3;

public class Hero extends Warrior<Weapon,Shield>{


    public Hero(String name,  int healthPoint,Weapon weapon, Shield shield) {
        super(name, healthPoint, weapon, shield);
    }

    public Hero(String name, Weapon weapon, int healthPoint) {
        super(name, healthPoint, weapon);
    }

    @Override
    public String toString() {
        return " Герой "+super.toString();
    }
}
