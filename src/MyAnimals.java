import java.util.Arrays;

public class MyAnimals {

    private Object[] zoo;

    public MyAnimals() {
        zoo = new Object[5];
        for (int i = 0; i < zoo.length; i++) {
            if (Math.random() < .5) zoo[i] = new Cat();
            else zoo[i] = new Dog();
        }
    }

    @Override
    public String toString() {
        return "Zoo: "+Arrays.toString(zoo);
    }

    public void print() {
        for (Object animal : zoo) {
            System.out.println(animal);
            ;
        }
    }

    public void replacementAnimal(Object animal, int position) {
        if (position < zoo.length && position >= 0) zoo[position] = animal;
    }

    public static void main(String[] args) {

        MyAnimals myZoo = new MyAnimals();
        myZoo.print();
        System.out.println(myZoo);

        System.out.println("===================");
        myZoo.replacementAnimal(new Reptile(), 2);
        myZoo.replacementAnimal(new Animal(), 3);
        myZoo.replacementAnimal(new PopCorn(), 0);
        myZoo.print();

        Animal animal2 = new Dog();
        Animal animal3 = new Reptile();

        animal2.print();
        animal3.print();

        System.out.println(animal2 instanceof Dog);
        System.out.println(animal3 instanceof Mammal);


    }
}

class PopCorn {
    @Override
    public String toString() {
        return "Ларек с попкорном...";
    }
}

class Animal {

    protected void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Животные";
    }
}

class Mammal extends Animal {

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
}

class Reptile extends Animal {
    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Рептилии";
    }
}

