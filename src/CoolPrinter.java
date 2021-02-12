//TODO 7.5.3

@FunctionalInterface
interface Formatter {
    String format(String line);
}

public class CoolPrinter {

    int x;
    static int y = 1;
    public static String line = "TEST";

    static void getString(Formatter formatter) {
        System.out.println(StaticNested.z);
        System.out.println(formatter.format(line));
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
        getString(new Formatter() {
            @Override
            public String format(String line) {
                return "** "+line+" **";
            }
        });

        getString((line)->"** "+line+" **");
        System.out.println(StaticNested.getTest());

    }

}
