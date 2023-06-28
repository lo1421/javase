package june.selfStudy.OuterClass;
/*
1.java 中允许一个类的内部定义另一个类（接口，枚举或者注解），这种类被称为内部类或者嵌套类
接下俩的程序中OuterClass 就是外部类，Inn二Class就是内部类
2.java中定义内部类的作用是什么？
java中定义内部类的作用是能够增强两个类之间的联系，并且可以使代码更加的清晰和简洁
java中使用内部类的情况是在一处使用类并将类进行分组，这可以提高封装性，增强代码的可读性和可维护性。
3.java中的内部类的分类
如果按照内部类所在的位置进行分类的话可以大致分为三个方面：
成员内部类：
实例内部类：相当于实例变量

静态内部类：相当于静态变量

局部内部类：相当于局部变量

匿名内部类：相当于外部的类，专门用来继承和实现的
为什么说匿名内部类是专门用来继承和实现的，这是因为匿名内部类自身的结构决定的，匿名内部类没有类名，只能跟在new运算符创建对象的时候使用
匿名内部类在声明的同时完成了实例对象，而且由于匿名内部类没有类名，导致匿名内部类不能够重复使用，这也是为什么匿名内部类有几个因为没有类名
的特点而具备的一些性质.

/*
在这里将进行对实例内部类的测试，实例内部内是宏观上的地位是一个类，所以这个类是可以定义变量和方法的
但是这个类由于定义在外部类当中的，所以这个类又是属于类当中的一个成员变量
由于实例内部类在java中是相当于成员变量，所以如果想在外部实现访问内部类的话就必须是建立在外部类实例化的基础之上，必须要先new外部类的对象，然后通过
外部类实例化的对象去访问内部类才可以，而且内部类当中定义的实例变量和实例方法必须要先创建内部类的对象之后才可以访问
 */

public class OuterClass01 {
    //在这里定义外部类的实例变量，记得要封装！！！！
    private String name;//外部类的实例变量
    private static  int no = 111;//外部类的静态变量
    //提供构造方法（可以是手动的，也可以是利用IDEA中的自动生成，使用组合键Alt加上insert）

//忘记手动提供有参构造方法之后应该手动提供一个有参的构造方法了，因为在这种情况之下，系统是不会自动提供一个缺省构造器的！！！！！
    public OuterClass01(){


    }
    public OuterClass01(String name) {
        this.name = name;
    }
    //setter and getter 也是同样的道理

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //然后再在声明成员变量的位置可以定义成员内部类，也就是main方法外和类体当中
    public class InnerClass{
        //在成员内部类当中也是可以声明变量和方法的
        private int id;
        private static boolean sex;
        //试着提供构造方法
//这里又忘记手动的提供一个无参构造方法了
        public InnerClass(){

        }
        public InnerClass(int id) {
            this.id = id;
        }
        //试着定义setter and getter 方法

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
        //自定义的内部类中的方法，可以测试一下内部类当中是否可以定义静态的方法
        public static void innerMethod(){
            System.out.println("InnerClass中的静态方法执行了！");
            System.out.println("实例内部类中的静态方法可以访问外部类的静态变量："+no);
            //System.out.println(""+name);这里会爆红，因为实例内部类的静态方法无法直接访问外部类的实例变量和实例方法
        }
        //由于上述的静态方法在定义的时候编译器没有报错，那么就表明实力内部类当中也是可以定义静态的方法的，那么这个静态的方法的访问
        //应该是使用实力内部类的类名来访问的
        //现在在这个地方再定义一个实例内部类当中的自定义的实例方法
        public void innerMethod1(){
            //同一个类当中的实例方法和静态方法是不可以同名的
            System.out.println("InnerClass中的实例方法执行了！");
            System.out.println("实例内部类中的实例方法可以访问外部类的静态变量："+no);
            System.out.println("实例内部类中的实例方法可以直接访问外部类的实例变量："+name);
        }

        public static void main(String[] args) {
            //经过测试知道是可以在实例内部类中定义一个main方法的，那么就在这个main方法中能干些什么呢？
            OuterClass01 outer  = new OuterClass01();
            OuterClass01.InnerClass  inner = outer.new InnerClass();
            //这里是通过在内部类中定义一个main方法，然后先创建一个外部类的对象之后，再创建通过外部类的一个对象来创建一个内部类的对象
            System.out.println(inner.getId());
            //发现内部类中的main方法虽然可以定义但是无法单独运行！！！！！！
           //由于实例内部类中的main方法是静态的方法，而静态的方法是跟类关联的，而不是与实例关联的，所以无法隐式的引用外部类的实例变量或者实例方法
            /*
            其实我在这里定义的这个main方法其实只是实例方法中定义的跟外部了中的main方法刚好同名的方法，而不是所谓的真正的程序的入口，
            只有外部类的静态方法main才是程序的入口点，用于启动程序，编译器将寻找名为main的静态方法，然后执行其中的代码。实例内部类是依赖于外部类
            的实例存在的，它需要外部类的实例作为上下文才可以创建和使用，方法无法直接作为程序的入口点运行，如果实在想通过创建外部类的实例，然后使用该实例
            创建内部类的实例，并调用内部类的相应的方法来间接执行相应的代码
             */
        }
        /*
        在这里创建一个实例内部类的实例方法，实例内部类的静态方法是可以看做外部类对象的一个静态方法，因为它们可以访问外部类的静态成员和
        静态方法，但是实例内部类的静态方法与外部类的静态方法想比，实例内部类的静态方法无法直接访问外部类的实例成员和实例方法，
        接下来将会列举出实例内部类中的静态方法和外部类的静态方法之间的差别
        差别就在实例内部类无法直接访问外部类的实例变量和实例方法
         */

    }
    //这里是外部类中但是是外部类的main方法外
    //思考：是否可以在实例内部中定义一个main方法？？？？
    //在这里定义一个外部类的静态main方法，因为只有外部类的静态main方法才可以作为程序的入口
    public static void main(String[] args) {
        OuterClass01 outer  = new OuterClass01();
        OuterClass01.InnerClass  inner = outer.new InnerClass();
        //在这里调用实例内部类中的静态方法
        OuterClass01.InnerClass.innerMethod();
        //在这里调用实例内部类中的实例方法
        inner.innerMethod1();
        //调用外部类的实例方法
        outer.outerMethod();

    }
    //那么外部类的实例方法应该是可以任意访问内部类中的变量和方法吧！！！
    public void outerMethod(){
        System.out.println(OuterClass01.InnerClass.sex);
        OuterClass01 outer  = new OuterClass01();
        OuterClass01.InnerClass  inner = outer.new InnerClass();
        System.out.println(inner.id);
    }

}
