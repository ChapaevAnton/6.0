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


        battle.start();


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

    private void run() {

        Monster[] versusMonsterPool = shufflePool(monsterPool);
        for (int i = 0; i < monsterPool.length; i++) {
            if (monsterPool[i] != null && versusMonsterPool[i] != null) monsterPool[i].attack(versusMonsterPool[i]);
        }

    }

    private Monster[] shufflePool(Monster[] monsterPool) {
        Random random = new Random();
        Monster[] versusMonsterPool = new Monster[monsterPool.length];
        for (int i = monsterPool.length - 1; i >= 0; i--) {
            int index = random.nextInt(i + 1);
            Monster monster = monsterPool[index];
            versusMonsterPool[i] = monster;
            monsterPool[index] = versusMonsterPool[i];
        }

        System.out.println(Arrays.toString(versusMonsterPool));
        return versusMonsterPool;
    }
}

//TODO 7.3.2
interface Fighter {

    void attack(Monster monster);

}

interface Sounds {
    void growl();

    void growl(boolean loud);

}


//TODO class Entity
abstract class Entity {

    protected String name;
    protected boolean destroyed = false;
    protected int hp;

    public Entity(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    protected abstract boolean damage(int levelDamage);

    protected abstract boolean isDestroyed();


}


//TODO class Monster
class Monster extends Entity implements Fighter, Sounds {

    protected int levelDamage;
    protected String scream;

    public Monster(String name, int levelDamage, int hp, String scream) {
        super(name,hp);
        this.levelDamage = levelDamage;
        this.scream = scream;
        System.out.println("Monster " + name + " was created");
    }

    //TODO 7.2.2
    protected int getLevelDamage() {
        return levelDamage;
    }

    protected int getLevelHP() {
        return hp;
    }

    protected String getNameMonster() {
        return name;
    }

    //TODO 7.2.2


    @Override
    protected boolean damage(int levelDamage) {
        if (isDestroyed()) {
            destroyed = true;
            hp = 0;
        } else {
            hp -= levelDamage;
        }
        return destroyed;
    }

    protected boolean isDestroyed() {
        return (hp <= 0 || hp <= levelDamage);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void growl() {
        System.out.print(scream);
    }

    @Override
    public void growl(boolean loud) {
        if (loud) {
            System.out.print(scream.toUpperCase());
        }

    }

    @Override
    public void attack(Monster monster) {
        this.growl(true);
        System.out.printf("\n\u2694 Monster %s attacked with damage %d \n\u2756 Monster %s defends\n",
                this.getNameMonster(), this.getLevelDamage(), monster.getNameMonster());

        if (damage(this.getLevelDamage())) {
            System.out.printf("\u2620 %s killed!!! is \u2764 %d health unit \n", monster.getNameMonster(), monster.getLevelHP());
        } else {
            System.out.printf("\u2691 %s remaining life level is \u2764 %d health unit \n", monster.getNameMonster(), monster.getLevelHP());
        }

    }

}

//TODO class GiantSnake
class GiantSnake extends Monster {


    public GiantSnake(String name) {
        super(name + " the GiantSnake", 25, 100, "Ssssss ");
    }


}

//TODO class Zombie
class Zombie extends Monster {

    public Zombie(String name) {
        super(name + " the Zombie", 25, 100, "Raaaauuughhhh ");
    }

}