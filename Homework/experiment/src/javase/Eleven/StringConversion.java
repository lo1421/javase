package javase.Eleven;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
    public class StringConversion {
        public static void main(String[] args) {
            List<String> list = new ArrayList<>();
            list.add("apple");
            list.add("banana");
            list.add("orange");
            // 使用索引循环访问并转换为大写
            for (int i = 0; i < list.size(); i++) {
                String element = list.get(i);
                list.set(i, element.toUpperCase());
            }
            // 使用迭代器访问并转换为大写
            Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()) {
                String element = iterator.next();
                iterator.remove();
                list.add(element.toUpperCase());
            }

            // 使用 replaceAll() 方法转换为大写
            list.replaceAll(String::toUpperCase);

            // 打印转换后的列表
            System.out.println(list);
        }
    }
