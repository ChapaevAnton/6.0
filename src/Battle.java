//TODO 6.4.7
public class Battle {

    private Monster[] monsterPool;
    private int count = 0;
    final private static int MAX_POOL = 5;

    public Battle() {
        monsterPool = new Monster[MAX_POOL];
    }

    //TODO
    public void add(Monster monster) {
        if (count >= 0 && count < monsterPool.length)
            monsterPool[count++] = monster;
        else System.out.println("No more monsters!");

    }

    public void start() {
        run();
    }

    private void run() {
        for (Monster monster : monsterPool) {

            if (monster != null) monster.attack();
        }
    }
}

class Monster {

    private String name;
    private int damage;

    public Monster(String name, int damage) {
        this.name = name;
        this.damage = damage;
        System.out.println("Monster " + name + " was created");
    }

    public void growl() {
        System.out.println(name + " growled ");
    }

    public void attack() {
        System.out.println("Monster " + name + " attacked with damage " + 5);
    }
}

class GiantSnake extends Monster {

    public static String scream = "Ssssss ";

    public GiantSnake(String name) {
        super(name + " the GiantSnake", 5);
    }

    @Override
    public void growl() {
        System.out.print(scream);
        super.growl();
    }

    public void growl(boolean loud) {
        if (!loud) {
            growl();
        } else {
            System.out.print(scream.toUpperCase());
            super.growl();
        }
    }

    @Override
    public void attack() {
        growl(true);
        super.attack();
        System.out.println("     ...and hid in the grass");
    }

}

class Zombie extends Monster {

    public static String scream = "Raaaauuughhhh ";

    public Zombie(String name) {
        super(name + " the Zombie", 5);
    }

    @Override
    public void growl() {
        System.out.print(scream);
        super.growl();
    }

    public void growl(boolean loud) {
        if (!loud) {
            growl();
        } else {
            System.out.print(scream.toUpperCase());
            super.growl();
        }
    }

    @Override
    public void attack() {
        super.attack();
        growl();
    }

}