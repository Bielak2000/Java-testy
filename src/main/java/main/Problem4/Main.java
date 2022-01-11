package main.Problem4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> L = new ArrayList<>();
        L.add(-1);
        L.add(1);
        L.add(3);
        L.add(4);
        Class c = new Class(L);
        int k = c.function();
        System.out.println(k);

    }
}
