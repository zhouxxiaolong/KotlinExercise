import java.util.ArrayList;
import java.util.List;

/**
 * Created
 * 创 建 人: zhouxiaolong
 * 创建日期: 2019/9/4
 * 邮   箱: 1016579848@qq.com
 * 参   考: @link
 * 描   述:
 */
public class JavaClass {

    public static void main(String[] args) {
        JavaClass javaClass = new JavaClass();
        List<A> list = new ArrayList();
        list.add(new Subclass());
        list.add(new Subclass());
        list.add(new Subclass());
        javaClass.get(list);
        javaClass.add(list);
    }

    void get(List<? extends A> list) {
//        list.add(new Subclass());
        A subclass = list.get(0);
        System.out.println("1-----" + subclass.toString());
    }

    void add(List<? super A> list) {
        list.add(new Subclass());
        A subclass = (A) list.get(0);
        System.out.println("2-----" + subclass.toString());
    }


}
