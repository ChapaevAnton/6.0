import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
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
//

//        Arrays.sort(str, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if (o1==null) return 1;
//                if (o2==null) return -1;
//                return o1.compareTo(o2);
//            }
//        });
//        System.out.println(Arrays.toString(str));


//        MyJFrame myJFrame = new MyJFrame("My programm", 500, 500);
//        myJFrame.setJFrame();

        MyJFrame2 myJFrame2 = new MyJFrame2();

//        MotherBoard.USB usb = new MotherBoard.USB(5,5);
//        System.out.println(MotherBoard.USB.wikilink);
//        System.out.println(usb.getTotalPorts());
//
//        MotherBoard motherBoard = new MotherBoard();
//        MotherBoard.USB usb1 = motherBoard.usb;
//        System.out.println(usb1.getTotalPorts());
//        System.out.println(motherBoard.usb.getTotalPorts());

    }


}


class MotherBoard {

    // static nested class
    static class USB {
        public static String wikilink = "https://en.wikipedia.org/wiki/USB";
        int usb2;
        int usb3;

        int getTotalPorts() {
            return usb2 + usb3;
        }

        USB(int usb2, int usb3) {
            this.usb2 = usb2;
            this.usb3 = usb3;
        }
    }

    USB usb = new USB(2, 3);

}

//TODO 7.5.2
class MyJFrame2 extends JFrame {
    public MyJFrame2() {
        setTitle("name");
        setSize(150, 150);
        setLocationRelativeTo(null);
        setVisible(true);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                setLocation(e.getXOnScreen() - getWidth() / 2, e.getYOnScreen() - getHeight() / 2);
            }
        });


    }
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

    public void setJFrame() {
        jFrame.setTitle(name);
        jFrame.setSize(width, height);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        setClickMouse();
    }

    private void setClickMouse() {

        jFrame.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                System.out.printf("Dragged x-> %d , y-> %d \n", e.getX(), e.getY());
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                System.out.printf("Moved x-> %d , y-> %d \n", e.getXOnScreen(), e.getYOnScreen());
            }
        });
        //jFrame.addMouseListener(this);

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
