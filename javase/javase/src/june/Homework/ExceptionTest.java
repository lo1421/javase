package june.Homework;

import java.util.Scanner;

/**
 * 编写程序模拟用户注册:
 * 程序开始执行时，提示用户输入”用户名”和”密码"信息。
 * 输入信息之后，后台java程序模拟用户注册。
 * 注册时用户名要求长度在[6-14]之间，小于或者大于都表示异常。
 * 注意:
 * 完成注册的方法放到一个单独的类中
 * 异常类自定义即可。
 * class UserService {
 * public void reqister(Strinq username,String password){
 * } 这个方法中完成注册!
 * }
 * 编写main方法，在main方法中接收用户输入的信息，在main方法中调用userService的reqister方法完成注册。
 */
public class ExceptionTest {

    public static void main(String[] args) {
        UserService  userService = new UserService();
        System.out.println("请输入用户名：");
        String username = new Scanner(System.in).nextLine();
        System.out.println("请输入用户密码：");
        String password = new Scanner(System.in).nextLine();
        try {
            userService.register(username,password);
        } catch (UsernameInputException e) {
            e.printStackTrace();
        }
    }
}
class UserService{
    String username;
    String password;
    public UserService(String username,String password) {
        this.username = username;
        this.password = password;
    }

    public UserService() {
    }

    public void register(String username, String password) throws UsernameInputException {
            if (username.length() < 6 || username.length() > 14) {
                throw new UsernameInputException("用户名长度只能在[6-14]之间！");
            } if (password.length() < 6 || password.length() > 14) {
            throw new UsernameInputException("密码长度只能在[6-14]之间！");
        }
            this.username = username;
            this.password = password;
            System.out.println(username + "注册成功！");
        }
    }
class UsernameInputException extends Exception{
    public UsernameInputException(){

    }
    public UsernameInputException(String name){
        super(name);
    }
}