package PracticaOpp3;

public class Mage extends Warrior<Pikestaff,RoundShield>  {
    private int range;
    private int mana;

    public Mage(String name,  int healthPoint,Pikestaff weapon, RoundShield shield, int range, int mana) {
        super(name,healthPoint,weapon,shield);
        this.range = range;
        this.mana = mana;
    }

    public Mage(String name,  int healthPoint,Pikestaff weapon, int range, int mana) {
        super(name,healthPoint, weapon );
        this.range = range;
        this.mana = mana;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public String toString() {

      if(getShield()==null)
        return "Маг "+" имя "+getName() +", здоровье "+getHealthPoint()+" , "+
                getWeapon()+
                ", диапозон= " + range +
                ", мана= " + mana ;

      else  return "Маг "+" имя "+getName() +", здоровье "+getHealthPoint()+" , "+
              getWeapon()+",  "+getShield()+
              ", диапозон= " + range +
              ", мана= " + mana ;



    }
}
