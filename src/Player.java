//TODO 7.5.2
import java.util.ArrayList;

public class Player {

    private Backpack backpack = new Backpack();
    private String name;

    Player(String name) {
        this.name = name;
    }

    public void take(Object item) {
        backpack.layItems(item);
    }

    public Backpack getBackpack() {
        return backpack;
    }

    public void takeTv(String name, String modelTv) {
        class Tv extends MyTv {

            Tv(String nameTv, String modelTv) {
                super(nameTv, modelTv);
            }
        }

        Tv tv = new Tv(name, modelTv);
        Remote myRemote = tv.getTvRemote();
        myRemote.powerOn();
        backpack.layItems(tv);
    }


    class Backpack {

        private ArrayList<Object> staff = new ArrayList<>();

        private void layItems(Object item) {
            backpack.staff.add(item);
        }

        public String toString() {
            if (staff.isEmpty()) return "the backpack is empty";
            else return staff.toString() + " in the backpack";
        }
    }


}



