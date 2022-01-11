package main.Problem138;

import main.exceptions.MyException;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            List<Integer> L = new ArrayList<>();
            L.add(25);
            L.add(10);
            L.add(5);
            L.add(2);
            L.add(1);
            Class c = new Class(100, L);
            int x = c.function1();
            System.out.println("Result: " + x);
        }
        catch(MyException e1){
            e1.printError("Amount is too small!");
        }
    }

}
