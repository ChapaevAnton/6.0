public class App6 {

    public static void main(String[] args) {
        Alphabet alphabet = new Alphabet();
        alphabet.set(5);
        System.out.println(alphabet.getSum());

        alphabet = new Alphabet();
        alphabet.set(5);
        alphabet.set(7);
        alphabet.set(7);
        System.out.println(alphabet.getSum());

    }
}
