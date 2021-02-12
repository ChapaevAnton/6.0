//TODO 7.5.3

@FunctionalInterface
interface Formatter {
    String format(String line);
}

public class CoolPrinter {

    int x;
    static int y = 1;

    static void getString() {
        System.out.println(StaticNested.z);
    }

    static class StaticNested {

        static int z = 5;

        static int getTest() {
            return y;
        }
    }

    class InnerClass{
        //static int w;
    }


    public static void main(String[] args) {
        getString();

        System.out.println(StaticNested.getTest());

    }

}
