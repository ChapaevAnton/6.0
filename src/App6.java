import calc.Sets;

public class App6 {

    public static void main(String[] args) {
        //TODO 6.3.1
        Sets alphabet = new Alphabet();
        alphabet.setW(5);
        System.out.println(alphabet.getSum());

        alphabet = new Alphabet();
        alphabet.setA(5);
        alphabet.setS(7);
        alphabet.setD(7);
        alphabet.setB(10);
        System.out.println(alphabet.getSum());

    }
}
