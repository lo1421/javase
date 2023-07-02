package javase.Eleven;
import java.util.HashSet;
class Animal {
    // Animal 类的定义
}

class Bird extends Animal {
    // Bird 类的定义
}

class Lion extends Animal {
    // Lion 类的定义
}

class Cage<T> extends HashSet<T> {
    // Cage 泛型类的定义
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Bird bird = new Bird();
        Lion lion = new Lion();

        Cage<Animal> animalCage = new Cage<>();
        Cage<Bird> birdCage = new Cage<>();
        Cage<Lion> lionCage = new Cage<>();

        animalCage.add(animal);
        birdCage.add(bird);
        lionCage.add(lion);

        Cage<? super Animal> mixedCage = new Cage<>();
        mixedCage.add(animal);
        mixedCage.add(bird);
        mixedCage.add(lion);

        // 输出笼子中的动物数量
        System.out.println("Animal Cage: " + animalCage.size() + " animals");
        System.out.println("Bird Cage: " + birdCage.size() + " birds");
        System.out.println("Lion Cage: " + lionCage.size() + " lions");
        System.out.println("Mixed Cage: " + mixedCage.size() + " animals");

        // 遍历 mixedCage 中的动物
        System.out.println("Animals in Mixed Cage:");
        for (Object obj : mixedCage) {
            if (obj instanceof Animal) {
                Animal a = (Animal) obj;
                System.out.println(a.getClass().getSimpleName());
            }
        }
    }
}
