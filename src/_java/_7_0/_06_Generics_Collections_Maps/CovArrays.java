package _java._7_0._06_Generics_Collections_Maps;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Evegen on 01.05.2017.
 */

class Fruit {
    public int i = 0;
}

class Apple extends Fruit {
    void m () {
        i = 1;
    }
}

class Lohn extends Apple {
    void m2 () {
        i = 2;
    }
}

class Orange extends Fruit {
}

public class CovArrays {
    static List<? extends Fruit> list = new ArrayList<>();

    static List<Apple> list2 = new ArrayList<Apple>();

    static List<Fruit> list3 = new ArrayList<Fruit>();

    static <T> void wr(List<T> list, T item) {
        list.add(item);
    }

    static List<? super Fruit> list4 = new ArrayList<>();

    static void f1() {
        wr(list3, new Apple());
    }

    public static void main(String[] args) {
//        list = Arrays.asList(new Apple());
//        Apple apple = (Apple) list.get(0);
//        System.out.println(apple.get());
//        System.out.println(Fruit.count);
//        System.out.println(apple.get());

//        list2.add(new Apple());
//        list2.add((Apple) new Fruit());

        list3.add(new Apple());

        wr(list3, new Apple());

        list4.add(new Apple());

        list4.add(new Fruit());

        list4.add(new Orange());

        list4.add(new Lohn());

    }
}
