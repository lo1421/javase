package day06;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CardTest {
    public static void main(String[] args) {
        //先创建一个CardDemo对象
        CardDemo cardDemo = new CardDemo();
        System.out.println("=================买牌====================");
        //买一副扑克牌
        List<Card> cards =  cardDemo.buyDeskCard();
        //System.out.println(cards);这里会直接调用集合中重写的toString方法，我们就可以不用自己去遍历集合了
        //遍历集合，打印出每一张牌的模样
        Iterator<Card> it = cards.iterator();
        while(it.hasNext()){
           Card card =  it.next();
            System.out.print(card);
        }
        //现在想把牌洗一下
        cardDemo.washDeskCard(cards);
        //然后我们再看看洗牌的效果是什么样的
        System.out.println();
        System.out.println("================洗牌之后=================");
        for (Card card:
             cards) {
            System.out.print(card);
        }
        System.out.println();
        //揭牌
        System.out.println("==================揭牌=====================");
    List<List<Card>> hands =  cardDemo.test(cards);
        for (int i = 0; i < hands.size(); i++) {
            System.out.println("第"+i+"个人的牌"+hands.get(i));
            //这里也是同一个道理，我们直接打印一个人的手其实也就直接调用集合的toString方法，就不用再遍历手这个集合了，很方便
        }

        //我们还可以输出剩余的牌
        System.out.println("剩余的牌：");
        System.out.println(cards);
    }
}
