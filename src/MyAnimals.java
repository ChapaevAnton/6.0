public class MyAnimals {

    private Animal[] zoo;

    public MyAnimals() {
        zoo = new Animal[10];
        for (int i = 0; i < zoo.length; i++) {
            if (Math.random() < .5)
                zoo[i] = new Cat();
            else zoo[i] = new Dog();
        }
    }

    public void print() {
        for (Animal animal : zoo) {
            animal.print();
        }
    }

    public void replacementAnimal(Animal animal, int position) {
        if (position < zoo.length && position >= 0) zoo[position] = animal;
    }

    public static void main(String[] args) {

        MyAnimals myZoo = new MyAnimals();
        myZoo.print();

        myZoo.replacementAnimal(new Reptile(),2);
        myZoo.print();

        myZoo.replacementAnimal(new Animal(),3);
        myZoo.print();

        Animal animal2 = new Dog();
        Animal animal3 = new Reptile();

        animal2.print();
        animal3.print();

        System.out.println(animal2 instanceof Dog);
        System.out.println(animal3 instanceof Mammal);


    }
}

class Animal {

    protected void print() {
        System.out.println("Животное");
    }
}

class Mammal extends Animal {

    @Override
    protected void print() {
        System.out.println("Млекопитающее");
    }
}

class Cat extends Mammal {

    @Override
    public void print() {
        System.out.println("Я кошка");
    }
}

class Dog extends Mammal {
    @Override
    public void print() {
        System.out.println("Я собака");
    }
}

class Reptile extends Animal {
    @Override
    public void print() {
        System.out.println("Рептилии");
    }
}

