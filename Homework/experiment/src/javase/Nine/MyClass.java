package javase.Nine;
/*
9.1编译和执行下面的MyClass类，输出的结果如何？
 */
public class MyClass {
    protected InnerClass ic;
    public MyClass(){
        ic = new InnerClass();
    }
    public void displayStrings(){
        System.out.println(ic.getString()+".");
        System.out.println(ic.getAnotherString()+".");
    }
    protected class InnerClass{
        public String getString(){
            return "InnerClass:getString invoked";
        }
        public String getAnotherString(){
            return "InnerClass:getAnotherString invoked";
        }
    }
    public static void main(String[] args) {
        MyClass mc = new MyClass();
        mc.displayStrings();
    }
}
