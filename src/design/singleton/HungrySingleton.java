package design.singleton;

/**
 * @Author: wy
 * @Date: 2021/3/4 19:18
 * @Description: 单例-饿汉模式 先创建好对象，直接返回
 */
public class HungrySingleton {

    private static final HungrySingleton INSTANCE = new HungrySingleton();

    private HungrySingleton(){
        //防止类在外部被实例化
    }

    public static HungrySingleton getInstance() {
        return INSTANCE;
    }
}
