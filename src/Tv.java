interface Remote {
    void setChannel(int channel);

    void powerOn();

    void powerOff();

}

class MyTv {

    private String nameTv;
    private String modelTv;
    private int channel = 5;
    private boolean isOn;
    private TvRemote tvRemote = new TvRemote();

    public MyTv(String nameTv, String modelTv) {
        this.nameTv = nameTv;
        this.modelTv = modelTv;
    }

    public TvRemote getTvRemote() {
        return tvRemote;
    }

    private MyTv getTv() {
        return MyTv.this;
    }

    private class TvRemote implements Remote {

        public void setChannel(int channel) {
            getTv().channel = channel;
        }

        public void powerOn() {
            getTv().isOn = true;
        }

        public void powerOff() {
            getTv().isOn = false;
        }

        @Override
        public String toString() {
            return String.format("Which TV remote control %s %s", getTv().nameTv, getTv().modelTv);
        }
    }

    @Override
    public String toString() {

        if (getTv().isOn)
            return "MyTv{" +
                    "nameTv='" + nameTv + '\'' +
                    ", modelTv='" + modelTv + '\'' +
                    ", channel=" + channel +
                    ", isOn=" + isOn +
                    '}';
        else
            return "Please turn on the TV...";
    }
}


public class Tv {
    public static void main(String[] args) {

        MyTv myTv = new MyTv("Samsung", "2021АК47");

        Remote tvRemote = myTv.getTvRemote();

        //TODO Инкапсуляция
        //MyTv.TvRemote tvRemote2 = myTv.new TvRemote();

        System.out.println(myTv);
        tvRemote.powerOn();
        tvRemote.setChannel(1);
        System.out.println(myTv);
        tvRemote.powerOff();
        System.out.println(myTv);


        //TODO Пульт без конкретного телека, просто им щелкаем...

        Remote tvRemote1 = new MyTv("Samsung", "2021АК47").getTvRemote();
        tvRemote1.setChannel(2);
        tvRemote1.powerOn();
        System.out.println(tvRemote1);


    }
}


