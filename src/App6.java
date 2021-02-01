public class App6 {

    public static void main(String[] args) {
        //TODO 6.3.1
//        Alphabet alphabet = new Alphabet();
//        alphabet.setW(5);
//        System.out.println(alphabet.getSum());
//
//        alphabet = new Alphabet();
//        alphabet.setA(5);
//        alphabet.setS(7);
//        alphabet.setD(7);
//        alphabet.setB(10);
//        System.out.println(alphabet.getSum());

        //TODO 6.4.7
        Battle battle = new Battle();
        battle.add(new Zombie("Alice"));
        battle.add(new Zombie("Bob"));
        battle.add(new Zombie("Eve"));
        battle.add(new GiantSnake("Kaa"));
        battle.add(new GiantSnake("Son of Kaa"));

        battle.add(new Zombie("Noname"));
        battle.add(new GiantSnake("Noname"));

        battle.start();


    }
}
