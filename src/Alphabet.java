public class Alphabet implements Set{

    static private int[] number;
    static private int count;

    public Alphabet() {
        number = new int[26];
        count = 0;
    }

    private void set(int num) {
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

    @Override
    public void setA(int num) {
        set(num);
    }

    @Override
    public void setW(int num) {
        set(num);
    }

    @Override
    public void setS(int num) {
        set(num);
    }

    @Override
    public void setD(int num) {
        set(num);
    }
}
