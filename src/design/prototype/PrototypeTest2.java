package design.prototype;

/**
 * @Author: wy
 * @Date: 2021/3/5 11:06
 * @Description: 克隆模式奖状例子
 */
public class PrototypeTest2 {

    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation("张三","获得2等奖状","北京大学");
        citation.display();
        Citation cloneCitation = (Citation)citation.clone();
        cloneCitation.setName("李四");
        cloneCitation.display();
    }

}

class Citation implements Cloneable{
    String name;
    String info;
    String college;

    Citation (String name, String info, String college){
        this.name = name;
        this.info = info;
        this.college = college;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    void display(){
        System.out.println(name + info + college);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("克隆成功");
        return (Citation)super.clone();
    }
}
