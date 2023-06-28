package june.selfStudy.ExceptionTest;
/*
异常在java中是以什么样的形式存在的呢？
 */
public class ExceptionTest02 {
    public static void main(String[] args) {
        //创建异常类型的对象
        NumberFormatException nfe = new NumberFormatException("数字格式化异常发生了！");
        System.out.println(nfe);//java.lang.NumberFormatException: 数字格式化异常发生了！
        //这里表明NumberFormatException类中其实重写了从Object中继承的toString方法的
        /*通过看源代码发现这里的异常类的继承关系是 NumberFormatException extends IllegalArgumentException extends RunTimeException
     extends Exception extends Throwable Extends Object ,在这条继承链上发现真正是重写了Object类中的toString方法的代码是在Throwable
     这个异常类当中，而且代码的具体实现是
        public String toString() {
        String s = getClass().getName();
        String message = getLocalizedMessage();
        return (message != null) ? (s + ": " + message) : s;
    }
    而其直接或者间接的继承了Throwable这个异常类的的子类异常类其实都直接或者间接的继承了Throwable这个类当中的toString方法
         */
        //再创建一个其它的异常类的对象
        NullPointerException npe = new NullPointerException();
        /*
        NullPointerException extends RuntimeException  ，RunTimeException extends Throwable
        其实由于Throwable这个异常类是重写toString 方法的，那么无论是异常还是错误都应该继承了Throwable中的重写的ToString方法，只是可能有的
        异常或者错误子类又继续重写了toString方法，
         */
    }
}
