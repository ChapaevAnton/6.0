import calc.Sets;

public class App6 {

    public static void main(String[] args) {
        //TODO 6.3.1
//        Sets alphabet = new Alphabet();
//        alphabet.setW(5);
//        System.out.println(alphabet.getSum());
//
//        alphabet = new Alphabet();
//        alphabet.setA(5);
//        alphabet.setS(7);
//        alphabet.setD(7);
//        alphabet.setB(10);
//        System.out.println(alphabet.getSum());

        //TODO 7.5.2
        Player player = new Player("Tourist");
        Player.Backpack pb = player.getBackpack();
        System.out.println(pb);
        player.take("rope");
        player.takeTv("Sony","2021");
        System.out.println(pb);
        player.take("bottle");
        player.take("flower");
        System.out.println(pb);

    }
}
