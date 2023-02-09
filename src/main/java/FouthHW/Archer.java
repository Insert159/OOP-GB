package PracticaOpp3;

public class Archer extends Warrior<Bow,LightShield> {
private int range;

    public Archer(String name, int healthPoint, Bow weapon, LightShield shield, int range) {
        super(name, healthPoint, weapon, shield );
        this.range = range;
    }

    public Archer(String name, int healthPoint, Bow weapon,  int range) {
        super(name, healthPoint, weapon);
        this.range = range;
    }

    @Override
    public String toString() {
        if(getShield()!=null)
        { return "Лучник "+" имя "+getName() +", здоровье " +getHealthPoint()+", "+getWeapon()+" , "+getShield() + ", диапазон= " + range ;}
        return "Лучник "+" имя "+getName() +", здоровье " +getHealthPoint()+ ", "+getWeapon() + ", диапазон= " + range ;
    }
}
