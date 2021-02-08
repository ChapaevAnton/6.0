import java.util.Arrays;


public class MyAnimals {

    //TODO 7.1
    private Object[] zoo;

    public MyAnimals() {
        zoo = new Object[5];
        for (int i = 0; i < zoo.length; i++) {
            if (Math.random() < .5) zoo[i] = new Cat();
            else zoo[i] = new Dog();
        }
    }

    //TODO 7.1.1
    @Override
    public String toString() {
        return "Zoo: " + Arrays.toString(zoo);
    }

    public void print() {
        for (Object animal : zoo) {
            System.out.println(animal);
            if (animal instanceof Animal) ((Animal) animal).getEat();
            else if (animal instanceof PopCorn) System.out.println("Попкорн нельзя накормить");
            else System.out.println("Незнаем что это...");
        }
    }

    public void replacementAnimal(Object animal, int position) {
        if (position < zoo.length && position >= 0) zoo[position] = animal;
    }

    public static void main(String[] args) {

        MyAnimals myZoo = new MyAnimals();
        myZoo.print();
        System.out.println(myZoo);

        System.out.println();

        myZoo.replacementAnimal(new Dog(), 2);
        myZoo.replacementAnimal(new Cat(), 3);
        myZoo.replacementAnimal(new PopCorn(), 0);
        myZoo.print();

        Animal animal2 = new Dog();
        Animal animal3 = new Cat();

        animal2.print();
        animal3.print();

        System.out.println(animal2 instanceof Dog);
        System.out.println(animal3 instanceof Mammal);


        //TODO down-casting

        Mammal mammal = new Cat();
        mammal.print();

        Cat cat = (Cat) mammal;
        cat.print();
        cat.getVoice();

    }
}

class PopCorn {
    @Override
    public String toString() {
        return "Ларек с попкорном...";
    }
}

//TODO 7.2.1 abstract class
abstract class Animal {

    protected void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {

        return "Животные";
    }

    abstract protected void getEat();

}

abstract class Mammal extends Animal {

    @Override
    protected void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {

        return "Млекопитающее";
    }
}

class Cat extends Mammal {

    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Я кошка";
    }

    @Override
    protected void getEat() {
        System.out.println("Ест как кошка");
    }

    public void getVoice() {
        System.out.println("МЯУ!!!!!!!!");


    }
}

class Dog extends Mammal {
    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Я собака";
    }

    public void getVoice() {
        System.out.println("ГАВ!!!!!!!!!!");
    }

    @Override
    protected void getEat() {
        System.out.println("Ест как собака");
    }
}

abstract class Reptile extends Animal {
    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Рептилии";
    }

    abstract protected void getEat();
}

