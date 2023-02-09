package PracticaOpp3;

public class MainOpp3 {

    public static void main(String[] args) {
        Hero hero1=new Hero("Большой Герой",150,new Bow(),new LightShield());
        Team<Archer> red = new Team<>(hero1);
        red.add(new Archer("Стреломант", 100, new Bow(), 20));
        red.add(new Archer("Великий Рейнджер", 100, new Bow(), new LightShield(), 19));
        red.add(new Archer("Робин Гуд", 100, new Bow(), 17));
        Hero hero2=new Hero("Необедимый",170,new Pikestaff(),new RoundShield());
        Team< Mage>blue=new Team<>(hero2);
        blue.add(new Mage("Мэрлин",75,new Pikestaff(),new RoundShield(),25,115));
        blue.add(new Mage("Гари Потер",70,new Pikestaff(),20,105));
        blue.add(new Mage("Чернокнижник",65,new Pikestaff(),new RoundShield(),22,150));
        Hero hero3=new Hero("Длинный лук",new LongBow(),170);
        Team<Warrior>mixed=new Team<>(hero3);
        mixed.add(new Hero("Высший маг",new Pikestaff(),115));
        mixed.add(new Archer("Лесной Рейнджер",100,new Bow(),new LightShield(),20));
        mixed.add(new Mage("Боевой маг",70,new Pikestaff(),new RoundShield(),20,100));
        System.out.println("Первая команда \n");
        System.out.println(red);
        System.out.println("Вторая команда \n");
        System.out.println(blue);
        System.out.println("Третья команда \n");
        System.out.println(mixed);
        System.out.println("Общее здоровье первой команды  "+red.getTeamHealthPoint());
        System.out.println("Общее здоровье второй команды  "+blue.getTeamHealthPoint());
        System.out.println("Общее здоровье третей команды  "+mixed.getTeamHealthPoint());



    }

}
