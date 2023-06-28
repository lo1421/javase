package june.selfStudy.ExceptionTest;

public class ExceptionTest03 {
    public static void main(String[] args){
        //在这里测试一下try-catch语句的一些特点
        String s = null;
        try {
            s.length();//这里会发生空指针异常，是运行时异常，也可以对异常进行处理
        }catch(NullPointerException e){
            e.getMessage();
            e.printStackTrace();
        }
        }
}
