package day06;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/*
这个类是用来对扑克牌对象进行操作的，里面应该存在买一副扑克牌的方法
洗牌的方法，然后我们可以在测试程序中实验打印牌对象
 */
public class CardDemo {
    /*如果我们要给牌的数字和花色全部安排上，我们也许可以使用集合的方式，把一个一个的扑克牌对象
    存储在我们定一的集合当中，然后我们可以定义一个买一副扑克牌的方法，调用这个方法的时候就会返回
    一副扑克牌（这副扑克牌是被存放在集合当中的，在这里我们选择的是ArrayList集合，这是一个顺序表）
     */
    public static final String[] suit = {"♥","♠","♣","♦"};
    List<Card> cards = new ArrayList<>();

    /**
     * 买一副大小花色按顺序排的崭新的扑克牌
     * @return 返回一副新牌（是一个集合）
     */
    public List<Card> buyDeskCard(){//这是一个买牌的方法，要求必须初始化每一张牌，而且要把牌装到我们已经准备好的集合中
        for (int i = 1; i < 14; i++) {
            for (int j = 0; j < 4; j++) {
                Card card = new Card(i,suit[j]);//通过循环创建很多的扑克牌对象，除去大小王一共是52张扑克牌对象
                cards.add(card);//把创建好的对象全部都放到我们准备好 的集合中去
            }
        }
        return  cards;
    }
    //如果调用买牌的方法就会发现打印出来的牌全部都是按顺序来的，如果我们想要不按顺序的获取集合中的牌，那我们就要把集合中的牌打乱

    /**
     * 洗牌，这里的牌必须是储存在集合中的
     * @param cards 一副待洗的牌
     */
    public void washDeskCard(List<Card> cards){
        Random random = new Random();
        for (int i = cards.size()-1; i >0; i--) {
           int index =  random.nextInt(i);
          //调用交换集合中元素的位置的方法来达到洗牌的目的
            swap(cards,index,i);//表示在集合cards中交换i和index下标对应的元素的值
        }
    }

    /**
     * 交换某个指定集合中两个指定元素的值的功能
     * @param cards 指定在某个集合中
     * @param i 待交换元素对应的下标
     * @param j 待交换元素对应的下标
     */
    public void swap(List<Card> cards ,int i,int j ){
        //还是和交换数组中两元素的思想方法是一样的，就是找一个空盒子
        //找一个空盒子用来先暂时保存其中一个元素
        Card temp = cards.get(i);
        //有一个方法可以完成把某下标的值设置成某个元素的功能
        cards.set(i,cards.get(j));//把i索引对应的元素修改成get(j)获取到的元素
        //现在完成把j索引对应的元素修改成之前i对应的的元素的值
        cards.set(j,temp);
        //这样我们就完成了交换某个指定集合中两个指定元素的值的功能
    }
    //现在我们来实现玩牌的方法，要求是：三个人轮流抓五张牌

    /**
     * 揭牌的方法，要求：三个人轮流抓五张牌
     * @param cards 传进来的是洗过的牌
     * @return 返回嵌套集合
     */
    public List<List<Card>> test(List<Card> cards){
        //这里传进来的一副扑克牌必须是经过洗牌的
        //先给每个人一个拿牌的集合，比喻成每个人的手
        List<Card> hand1 = new ArrayList<>();
        List<Card> hand2 = new ArrayList<>();
        List<Card> hand3 = new ArrayList<>();
        //然后声明一个集合，把这三个手装进去，这样就变成嵌套的集合了
        List<List<Card>> hands = new ArrayList<>();
        hands.add(hand1);
        hands.add(hand2);
        hands.add(hand3);
        //现在就开始揭牌了，要求是三个人轮流抓五张牌
        for (int i = 0; i < 5; i++) {
            for (int j = 0;j<3;j++){
                //现在要想的是我们应该抓什么样的牌给到每个人的手中
                /*要求是把洗过的一副扑克牌中的牌交给双层集合外层0 下标的人之后，这张牌就从扑克牌中
                移除，而到了0下标的人手中，那么要求这个方法的目的是取出扑克牌中的一张的牌的同时把这张
                牌从扑克牌集合中删除，集合中有这样一个remove(int index)方法
                 */
                /*
                对该方法的描述是：删除此列表中指定位置的元素（可选操作）。
                将任何后续元素向左移动（从其索引中减去一个）。返回已从列表中删除的元素。
                 */
                Card  card  = cards.remove(0);
                //存到集合中人的手上具体的位置
                hands.get(j).add(card);
            }
        }
        return hands;
    }
}
 /*
 该类是用来封装一个扑克牌抽象类的
 */
class Card{
    //数字字段
    public int rank ;
    //扑克牌花色字段
    public String suit;
    //构造方法
     public Card(){

     }
     public Card(int rank,String suit){
         this.rank = rank;
         this.suit = suit;
     }
     //toString方法
     public String toString(){
         return "["+suit+rank+"]";
     }
 }
