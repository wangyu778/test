package design.prototype;

/**
 * @Author: wy
 * @Date: 2021/3/4 19:53
 * @Description: 原型模式 ：优点：java自带的原型模式基于内存二进制流的复制，在性能上臂直接new一个对象更加优良
 *                               可以采用深克隆（即对象中的对象也被复制过来，但是内存地址会被改变）
 *                         缺点：clone方法位于类的内部，当对已有类进行改造时，需要修改代码，违背了开闭原则
 *                               当对象中的对象之间存在多重嵌套，为了实现深克隆，每一层都要必须支持深克隆，实现麻烦。
 */
 public class Prototype implements Cloneable{

    Prototype(){
        System.out.println("具体原型创建成功！");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功");
        return (Prototype)super.clone();
    }

}

 class PrototypeTest{
     public static void main(String[] args) throws CloneNotSupportedException {
         Prototype p1 = new Prototype();
         Prototype p2 = (Prototype) p1.clone();
         System.out.println("p1==p2?"+(p1 == p2));
     }
 }
