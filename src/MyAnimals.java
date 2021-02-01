public class MyAnimals{
    public static void main(String[] args) {
        Animal animal = new Cat();
        Animal animal1 = new Dog();
        Animal animal2 = new Reptile();
        animal.print();
        animal1.print();
        animal2.print();
        System.out.println(animal instanceof Cat);
        System.out.println(animal instanceof Dog);
        System.out.println(animal2 instanceof Mammal);
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

class Cat extends Mammal{
    @Override
    public void print(){
        System.out.println("Я кошка");
    }
}

class Dog extends Mammal{
    @Override
    public void print(){
        System.out.println("Я собака");
    }
}

class Reptile extends Animal{
    @Override
    public void print(){
        System.out.println("Рептилии");
    }
}

