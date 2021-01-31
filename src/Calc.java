import java.util.ArrayList;

public class Calc implements Sets {

    static private ArrayList<Integer> number;

    protected Calc() {
        number = new ArrayList<>();
    }

    private void set(int num) {
        number.add(num);
    }

    protected int getSum() {
        int result = 0;
        for (Integer num : number) {
            result += num;
        }
        return result;
    }

    @Override
    public void setA(int num) {
        set(num);
    }
    @Override
    public void setB(int num) {
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
