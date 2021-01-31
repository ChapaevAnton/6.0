public class Calc implements Set{

    static protected int[] number;
    static protected int count;

    private void set(int num) {
        number[count] = num;
        count++;
    }

    protected int getSum() {
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
