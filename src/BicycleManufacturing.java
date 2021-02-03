interface Cycle {
    void make();
    void move();
}

interface CycleFactory{
    Cycle getCycle();
}

class Unicycle implements Cycle {

    @Override
    public void make() {
        System.out.println("Процесс создания одноколесного велосипеда");
    }

    @Override
    public void move() {
        System.out.println("Движение одноколесного велосипеда");
    }

}

class Tricycle implements Cycle{

    @Override
    public void make() {
        System.out.println("Процесс создания трехколесного велосипеда");
    }

    @Override
    public void move() {
        System.out.println("Движение трехколосеного велосипеда");
    }
}

class UnicycleFactory implements CycleFactory{
    public Cycle getCycle(){
        return new Unicycle();
    }
}

class TricycleFactory implements CycleFactory{

    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
}

public class BicycleManufacturing {

    public static void makeCycles(CycleFactory cycleFactory)
    {
        System.out.println("Фабрика производи");
        Cycle cycle = cycleFactory.getCycle();
        cycle.make();
        cycle.move();
    }

    public static void main(String[] args) {
        makeCycles(new UnicycleFactory());
        makeCycles(new TricycleFactory());
    }

}
