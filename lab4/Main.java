import java.util.*;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();

        Box<Apple> boxApple = new Box<Apple>();
        Box<Orange> boxOrange = new Box<Orange>();
        boxApple.addFruit(apple);
        boxApple.addFruit(apple);
        boxApple.addFruit(apple);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);

        System.out.println(boxApple.getWeight(apple));
        System.out.println(boxOrange.getWeight(orange));

        System.out.println(boxApple.compare(boxOrange));

        Box<Apple> boxApple1 = new Box<Apple>();
        System.out.println(boxApple1.getWeight(apple));
        boxApple.move(boxApple,boxApple1,apple);
        System.out.println(boxApple1.getWeight(apple));
    }
}
class Apple extends Fruit{
    public Apple() {
        super.weigth = 1f;
    }

}

class Orange extends Fruit{
    public Orange() {
        super.weigth = 1.5f;
    }
}

class Fruit {
    float weigth;
}

class Box<T> {
    private boolean isFree = true;
    float maxWeight = 100.0f;
    float currentWeight = 0;
    ArrayList<T> arrayList = new ArrayList<>();

    void addFruit(T fruit) {
        if (currentWeight + 1 <= maxWeight) {
            arrayList.add(fruit);
            currentWeight++;
            if (arrayList.size() < 1)
                isFree = false;
        } else
            System.out.println("The box is full");
    }

    float getWeight(Fruit f) {
        return arrayList.size() * f.weigth;
    }



    public boolean compare(Box box) {
        if (currentWeight == box.currentWeight)
            return true;
        return false;
    }

    public void move(Box box1, Box box2, Fruit fruit){
        for (int i = 0; i <box1.currentWeight;) {
            box2.addFruit(fruit);
            box1.arrayList.remove(box1.currentWeight-1);
            box1.currentWeight =box1.currentWeight- 1;
        }
    }

}
