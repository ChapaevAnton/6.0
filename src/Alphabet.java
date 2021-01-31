public class Alphabet {

    static private int[] number;
    static private int count;

    Alphabet() {
        number = new int[26];
        count = 0;
    }

    public void set(int num) {
        number[count] = num;
        count++;
    }

    public int getSum() {
        int result = 0;
        for (int num : number) {
            result += num;
        }
        return result;
    }
}
