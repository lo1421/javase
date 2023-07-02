package javase.Eight;
/*
8.3有一个三角形的两条边长分别是4.0和5.0，夹角为30°，编写程序计算该三角形的面积
 */
public class Area {
    public static void main(String[] args) {
        double side1 = 4.0;
        double side2 = 5.0;
        double angle = 30.0; // 夹角，单位为度

        // 将角度转换为弧度
        double radians = Math.toRadians(angle);

        // 计算三角形的面积
        double area = 0.5 * side1 * side2 * Math.sin(radians);

        System.out.println("area: " + area);
    }
}
