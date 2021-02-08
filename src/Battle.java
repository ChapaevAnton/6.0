import java.util.Arrays;
import java.util.Random;

//TODO 6.4.7
public class Battle {

    public static void main(String[] args) {
        //TODO 6.4.7
        Battle battle = new Battle();
        battle.add(new Zombie("Alice"));
        battle.add(new Zombie("Maik"));
        battle.add(new Zombie("Bob"));
        battle.add(new GiantSnake("Kaa"));
        battle.add(new GiantSnake("Son of Kaa"));


        battle.start(true);


    }

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

    //TODO 7.2.2
    public void start(boolean turnCarnage) {
        run(turnCarnage);
    }

    private void run() {
        for (Monster monster : monsterPool) {

            if (monster != null) monster.attack();
        }
    }

    private void run(boolean turnCarnage) {

        if (turnCarnage) {
            Monster[] versusMonsterPool = shufflePool(monsterPool);
            for (int i = 0; i < monsterPool.length; i++) {
                if (monsterPool[i] != null && versusMonsterPool[i] != null) monsterPool[i].attack(versusMonsterPool[i]);
            }
        } else run();
    }

    private Monster[] shufflePool(Monster[] monsterPool) {
        Random random = new Random();
        Monster[] versusMonsterPool = new Monster[monsterPool.length];
        for (int i = 0; i < monsterPool.length; i++) {
            int index = random.nextInt(monsterPool.length - 1);
             Monster monster = monsterPool[index];
             versusMonsterPool[i] = monster;
             monsterPool[i] = versusMonsterPool[index];
        }

        System.out.println(Arrays.toString(versusMonsterPool));
        return versusMonsterPool;
    }
}

abstract class Monster {

    private String name;
    private int levelDamage;
    private int hp;
    private boolean destroyed = false;

    public Monster(String name, int levelDamage, int hp) {
        this.name = name;
        this.levelDamage = levelDamage;
        this.hp = hp;
        System.out.println("Monster " + name + " was created");
    }

    public void growl() {
        System.out.println(name + " growled ");
    }

    //TODO 7.2.2
    public int getLevelDamage() {
        return levelDamage;
    }

    public int getLevelHP() {
        return hp;
    }

    public String getNameMonster() {
        return name;
    }

    public void attack() {
        System.out.println("\u2694 Monster " + name + " attacked with damage " + levelDamage);
    }

    //TODO 7.2.2
    abstract public void attack(Monster monster);

    protected boolean damage(int levelDamage) {
        if (isDestroyed()) {
            destroyed = true;
            hp = 0;
            return true;
        } else {
            hp -= levelDamage;
            return false;
        }
    }

    public boolean isDestroyed() {
        return (hp <= 0 || hp <= levelDamage);
    }

    @Override
    public String toString() {
        return name + ", ";
    }
}

class GiantSnake extends Monster {

    public static String scream = "Ssssss ";

    public GiantSnake(String name) {
        super(name + " the GiantSnake", 10, 100);
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

    //TODO 7.2.2
    @Override
    public void attack(Monster monster) {
        this.attack();
        System.out.printf("\u2756 Monster %s \n", monster.getNameMonster());
        if (damage(this.getLevelDamage())) {
            System.out.printf("\u2620 %s killed!!! is \u2764 %d health unit \n", monster.getNameMonster(), monster.getLevelHP());
        } else {
            System.out.printf("\u2691 %s remaining life level is \u2764 %d health unit \n", monster.getNameMonster(), monster.getLevelHP());
        }

    }

}

class Zombie extends Monster {

    public static String scream = "Raaaauuughhhh ";

    public Zombie(String name) {
        super(name + " the Zombie", 10, 100);
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
        growl();
        super.attack();
    }

    //TODO 7.2.2
    @Override
    public void attack(Monster monster) {
        this.attack();
        System.out.printf("\u2756 Monster %s \n", monster.getNameMonster());
        if (damage(this.getLevelDamage())) {
            System.out.printf("\u2620 %s killed!!! is \u2764 %d health unit \n", monster.getNameMonster(), monster.getLevelHP());
        } else {
            System.out.printf("\u2691 %s remaining life level is \u2764 %d health unit \n", monster.getNameMonster(), monster.getLevelHP());
        }

    }

}