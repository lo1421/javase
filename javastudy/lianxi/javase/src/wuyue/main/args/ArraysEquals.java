package wuyue.main.args;
/*
在这个程序中好好研究一下java类库中已经编译好的Array.equals()方法，
其实在java的类库中Array类下应该定义了一个重写了父类Object类的equals方法
1.Arrays.equals（）方法在Array类中发生了很多次的重载
因为这个方法是比较两个数组对象的内容是否相等，那么Arrays.equals() 方法应该有两个数组类型的参数
我可以直接把这个方法的大概具体实现写出来了
其实这个方法还跟平时重写的equals方法还不太一样，因为这个equals方法的参数列表不是Object obj，我们平时继承Object类的equals方法的时候
其实是利用多态的语法，而且这个方法还是实例方法，必须new对象才可以完成调用，基本的格式：
public boolean equals(Object obj){
    if(obj==null||!(obj instanceof 在哪个类中重写就写对应的类名)) return false;
    if(obj == this) return true;
    //上述我已经在宏观上判断了当前对象和传进来的实际对象，现在继续判断两个对象在具体的内容上是否相等
    if(具体的判断两个对象相等的要求是自己规定的)引用类型的属性就调用equals方法判断，基本的数据的就用双等号运算符
}
public static boolean equals(type1[] t1, type2[] t2){
// 这里还是跟平时的重写equals方法其实不一样，先宏观上比较两个数组对象然后再具体细化判断俩个数组对象的内容是否一样
//针对保存了引用数据类型的数组，先判断两个传进来的数组对象的引用不是空引用，不然的话是无法访问数组里面保存的引用元素的，因为会出现空指针异常
if(t1 == null ||t2 == null)
 return false;
//要知道数组对象的引用是空的话，那么接下来是一定会发生空指针异常的，因为你之后是一定会使用数组的引用去访问数组当中保存的数据的，这些数据是
保存在数组对象当中的实例属性，记法： 数组引用名[下标]，其中的引用名是在创建数组对象的时候定义的
if(t1 == t2)
 return true;
 如果两个数组对象的引用直接是相同的，那么这两个数组对象一定是相等的
 接下来就要具体的比较两个数组对象当中储存的元素是否相同，那么可以先判断两个数组对象的的长度是否相同，如果两个数组对象的长度就不同，那么你也就不用比较了，
 因为相同的数组一定必须是长度相同的
 如果两个数组对象的长度已经是相等的了，那么继续判断分两种情况，
 一种是
 如果这个数组存的是引用数据类型的话，你要按顺序依次判断每个元素是否一一对应相等，
 先判断两个数组的元素的类型是否相同，因为一种数组里面保存的只能是同一种数据类型才行
 而且要调用引用数据类型的重写的Object的equals方法就可以实现啦
 如果元素的引用类型是Object[] , String[] 这种已经在元素对应的类中重写了Object类的equals方法，那么你直接调用就可以了
 但是要是是没有提前在元素的对应的类中重写Object类当中的equals方法，那么你就必须去手动补充重写了，因为如果你不重写的话，那么这个元素是默认继承Object类的
 那么你调用这个没有重写equals方法的元素的类的equals方法就是默认调用Object当中的equals方法，而这个方法只能实现判断两个数组的元素的引用是否相等，而不是引用指向的具体对象的具体内容是否相等
 这也是为什么建议把从Object中继承的equals方法啊toString方法等无法满足子类的方法去重写的原因
 如果这个数组保存的是基本数据类型的话就采用==双等号来依次一一对应判断所以元素是否相等
 这里的判断很显然是需要使用循环语句来实现的
 if(t1.length == t2.length){
 for(int i = 0;i<t2.length;i++){
 if(!(t1[i]==null?t2[i]==null:t1[i]equals(t2[i]))){
 return  false;
 }
 }
 //程序如果能执行到这里，则表明两个数组对象中的所以元素都相等
 return true;
}else
return false;
if(t1.length == t2.length){
 for(int i = 0;i<t2.length;i++){
 if(!t1[i]==t2[i]){
 return  false;
 }
 }
 //程序如果能执行到这里，则表明两个数组对象中的所以元素都相等
 return true;
}else
return false;
接下来我们就去验证一下java.util.Arrays 包下的equals方法是否是我这样推测的吧！！
 */
public class ArraysEquals {
    public static boolean equals(String[] t1, String[] t2) {
        if (t1 == t2)
            return true;
        if (t1 == null || t2 == null)
            return false;
        if (t1.length == t2.length) {
            for (int i = 0; i < t2.length; i++) {

                if (!(t1[i] == null ? t2[i] == null : t1[i].equals(t2[i]))) {
                    return false;
                }
            }
            return true;
        } else
            return false;

    }

    public static void main(String[] args) {

        String[] str1 ={"zhangsan","123456"};
        String[] str2={"zhangsan","123456"};
        System.out.println(ArraysEquals.equals(str1,str2));
    }
}

