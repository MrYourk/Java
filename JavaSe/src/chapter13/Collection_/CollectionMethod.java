package chapter13.Collection_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hoengjing
 * @version 1.0
 */
public class CollectionMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("jack");//添加元素
        list.add(true);//有自动装箱过程
        ArrayList arrayList = new ArrayList();
        arrayList.add("红楼梦");
        arrayList.add("三国验仪");
        list.addAll(arrayList);
        System.out.println("list = " + list);

        list.remove(true);
        System.out.println("list = " + list);

        System.out.println(list.contains("fa"));
    }
}
