package design.singleton;

import javax.swing.*;
import java.awt.*;

/**
 * @Author: wy
 * @Date: 2021/3/4 19:31
 * @Description: 饿汉模式例子
 */
public class HungrySingletonTest {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("饿汉单例模式测试");
        jFrame.setLayout(new GridLayout(1, 2));
        Container contentPane = jFrame.getContentPane();
        BaJie obj1 = BaJie.getInstance();
        contentPane.add(obj1);
        BaJie obj2 = BaJie.getInstance();
        contentPane.add(obj2);
        if (obj1 == obj2) {
            System.out.println("他们是同一人！");
        } else {
            System.out.println("他们不是同一人！");
        }
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class BaJie extends JPanel{

    private static BaJie instance = new BaJie();

    private BaJie(){
        JLabel label = new JLabel(new ImageIcon("src/image/Bajie.jpg"));
        this.add(label);
    }

    public static BaJie getInstance(){
        return instance;
    }
}