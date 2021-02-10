import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;
import java.util.Comparator;

public class MySort {

    static String[] str = {"баркас", "C", "D", "A", "B", "ёлка", "f", "а", "баржа", "арбузы", "ежики", "тыква", "Г", "Д", "В", "Б", "А"};

    public static void main(String[] args) {


        //TODO Нестандартная сортировка массива строк
//        Arrays.sort(str);
//        System.out.println(Arrays.toString(str));
//        //Arrays.sort(str,new ComparatorByLength());
//        ComparatorByLength comparatorByLength = new ComparatorByLength();
//        Arrays.sort(str,comparatorByLength);
//        System.out.println(Arrays.toString(str));


//        MyJFrame myJFrame = new MyJFrame("My programm", 500, 500);
//        myJFrame.clickMouse();

        MotherBoard.USB usb = new MotherBoard.USB(5,5);
        System.out.println(MotherBoard.USB.wikilink);
        System.out.println(usb.getTotalPorts());

        MotherBoard motherBoard = new MotherBoard();
        MotherBoard.USB usb1 = motherBoard.usb;
        System.out.println(usb1.getTotalPorts());
        System.out.println(motherBoard.usb.getTotalPorts());

    }


}

class MotherBoard {

    // static nested class
    static class USB{
        public static String wikilink = "https://en.wikipedia.org/wiki/USB";
        int usb2;
        int usb3;
        int getTotalPorts(){
            return usb2 + usb3;
        }
        USB(int usb2, int usb3){
            this.usb2 = usb2;
            this.usb3 = usb3;
        }
    }

    USB usb = new USB(2, 3);

}


class MyJFrame extends JFrame implements MouseListener {

    private JFrame jFrame = new JFrame();
    private String name;
    private int width, height;

    MyJFrame(String name) {
        this.name = name;
        this.width = 300;
        this.height = 300;

    }

    MyJFrame(String name, int width, int height) {
        this.name = name;
        this.width = width;
        this.height = height;
    }


    public void clickMouse() {

        jFrame.setTitle(name);
        jFrame.setSize(width, height);
        jFrame.setLocationRelativeTo(null);
        jFrame.addMouseListener(this);
        jFrame.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.printf("x-> %d , y-> %d \n", e.getX(), e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}


//TODO symbol Ё ё
class ComparatorByLength implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {

        if (o1 == null)
            return 1;
        if (o2 == null)
            return -1;

        return o2.length() - o1.length();
    }
}
