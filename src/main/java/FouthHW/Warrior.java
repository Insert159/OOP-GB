package PracticaOpp3;

public class Warrior<T,S> {
    private String name;
    private T weapon;
    private S shield;
    private int healthPoint;


    public Warrior(String name, int healthPoint, T weapon, S shield) {
        this.name = name;
        this.weapon = weapon;
        this.shield = shield;
        this.healthPoint = healthPoint;

    }

    public Warrior(String name, int healthPoint, T weapon) {
        this.name = name;
        this.weapon = weapon;
        this.healthPoint = healthPoint;

    }

    public String getName() {
        return name;
    }

    public T getWeapon() {
        return weapon;
    }

    public S getShield() {
        return shield;
    }

    public int getHealthPoint() {
        return healthPoint;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }

    public void setShield(S shield) {
        this.shield = shield;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }



    @Override
    public String toString() {
        if(shield==null)
        return
                "имя = " + name  +" ,"+ weapon +

                ", здоровье =" + healthPoint ;


        return
                " имя = " + name  +" ,"+
                  weapon +", "+ shield +
                ", здоровье =" + healthPoint ;
    }
}
