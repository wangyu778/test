package design.singleton;

/**
 * @Author: wy
 * @Date: 2021/3/4 19:14
 * @Description: 单例-懒汉模式 不创建对象，在调用的时候判断是否创建了对象。
 */
public class LazySingleton {

    private static volatile LazySingleton instance = null;

    private LazySingleton(){
        //防止类在外部被实例化
    }

    public static synchronized LazySingleton getInstance() {
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }

}
