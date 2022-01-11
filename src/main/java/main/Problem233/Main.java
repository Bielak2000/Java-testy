package main.Problem233;

import main.exceptions.MyException;

public class Main {
    public static void main(String[] args) {
        try {
            Class c = new Class(5);
            int x = c.function();
            System.out.println(x);
        }
        catch (MyException e) {
            e.printError("Too few words!");
        }
    }
}
