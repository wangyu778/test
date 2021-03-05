package design.singleton;

/**
 * @Author: wy
 * @Date: 2021/3/4 19:22
 * @Description: 懒汉模式-示例
 */
public class LazySingletonTest {

    public static void main(String[] args) {
        President president1 = President.getInstance();
        President president2 = President.getInstance();
        if(president1 == president2){
            System.out.println("他们是同一个人");
        }
    }

}

class President {

    private static volatile President instance = null;

    private President(){
        System.out.println("大家好我是总统");
    }

    public static President getInstance() {
        if(instance == null){
            instance = new President();
        }else {
            System.out.println("已经有一个总统了");
        }
        return instance;
    }

}