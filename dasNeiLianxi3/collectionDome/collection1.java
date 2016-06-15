package collectionDome;

import oop.Cell;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by asus on 2016/6/15.
 */
public class collection1 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("java");
        c.add("java1");
        c.add("java2");
        c.add("java3");
        System.out.println(c);
        Collection d = new ArrayList();
        d.add("ios");
        d.add("ios1");
        d.add("ios2");
        System.out.println(d);
        Collection gg = new ArrayList<>();
        gg.add("java");
        boolean contransall = c.containsAll(gg);
        System.out.println(contransall);
        c.addAll(d);
        System.out.println(c);
        String f = "java";
        c.remove(f);
        System.out.println(c);

    }
}
