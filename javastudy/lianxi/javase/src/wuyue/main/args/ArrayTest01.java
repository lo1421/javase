package wuyue.main.args;

public class ArrayTest01 {
    //现在我们开始学习java中的main方法中的String数组参数
    /*
    我们先看看ChatGPT是怎么描述java中的main方法中的String数组参数有什么用，并且由谁调用的
    java中的main方法是JVM负责调用的，那么JVM调用main方法的时候是会传一个String数组参数，我们可以获取main方法中的String数组对象的length
    即获取String数组的长度
     */
    public static void main(String[] args) {
        //获取String数组的length属性
        System.out.println(args.length);//0
        //这里表明JVM在调用main方法的的时候的确是创建了一个String数组对象，只不过这个数组对象是长度为零的
        //那么这个main方法的String数组到底有什么用呢？chatGPT很好的回答了这个问题
    /*
    在java中main方法的形式参数实际上是String数组类型的对象，这个地方其实是交给用户在运行程序的时候输入运行参数
    而用户输入的命令行参数其实会存储到main方法的String数组对象的，那么我们就可以在main方法中去获取这些用户输入的命令行参数
    在Java中，main方法是程序的入口点，当程序启动时，Java虚拟机（JVM）会自动调用该方法。
    main方法的参数是一个String类型的数组，这个数组可以用来接收从命令行传入的参数。

命令行参数是指在程序启动时，用户可以通过在命令行中输入参数来向程序传递信息。
在Java中，这些参数都会被存储在main方法的参数数组中，程序可以通过读取这个数组来获取这些参数。

例如，我们可以通过以下方式在命令行中运行一个Java程序并传递参数：

```
java MyProgram arg1 arg2 arg3
```

这里的`MyProgram`是程序的类名，`arg1`、`arg2`和`arg3`是传递给程序的参数。
在程序中，我们可以通过读取main方法的参数数组来获取这些参数，例如：

```java
public class MyProgram {
    public static void main(String[] args) {
        String arg1 = args[0];
        String arg2 = args[1];
        String arg3 = args[2];
        // ...
    }
}
```

在这个例子中，`args[0]`对应的是`arg1`，`args[1]`对应的是`arg2`，以此类推。
通过读取这个数组，我们就可以在程序中使用这些命令行参数了。
     */
//在main方法中去获取用户在命令行输入的参数
        String name = args[0];
        String password = args[1];
        //要知道如果用户给String数组参数输入了过多的命令行参数，这个时候你在main方法中去判断两个数组对象是否相等的时候就是你比较麻烦的
        //但是你可以使用Array.equals()方法来实现判断引用数据类型的数组对象的内容是否相等
        //要求用户的用户名和用户密码必须为 张三 和 123456 的时候才能启动这个系统
        //我就必须在这里先判断两个数组对象是否相同，比较之前是不是应该先判断main方法中的String数组对象是否传过来的是空引用
        //先在宏观上判断两个数组对象是否相同
        String[] str = {"张三", "123456"};//由于我已经提前知道了数组对象的具体的元素是什么，那么我采用静态初始化的方式会更加的合适
    }
}
/*
一.这里是如何在程序还没有运行前手动输入运行参数
在 Run Configurations 中设置程序的运行参数
在 IDEA 中打开需要运行的 Java 类
点击菜单栏中的 Run -> Edit Configurations...
在左侧的 Run/Debug Configurations 中选择对应的 Java 类
在右侧的 Configuration 标签页中找到 Program arguments
在 Program arguments 栏中输入需要的运行参数，参数之间以空格分隔
点击 OK 按钮，保存设置
点击 Run 按钮或使用快捷键 Shift + F10 运行程序
二.这里是如何在修改包名
在 IDEA 中修改包名需要以下步骤：

1. 在项目面板中选择要修改包名的包，右键点击并选择 "Refactor" -> "Rename"。

2. 在弹出的 "Rename" 对话框中，将 "Search in comments and strings" 和 "Search for text occurrences" 的选项取消勾选。

3. 输入新的包名，然后点击 "Refactor"。

4. IDEA 会在项目中自动搜索所有使用该包名的地方，并进行相应的更新。你需要在修改完成后仔细检查所有文件，确保没有遗漏的地方。

5. 修改完成后，你可以提交代码并将代码推送到远程仓库，以使其他开发者可以更新你的代码。
 */
