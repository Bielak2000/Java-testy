package main.Problem14;


import main.exceptions.MyException;

public class Main {
    public static void main(String[] args) {
        try {
            Class c = new Class(2);
            double x = c.PI(100000);
            System.out.println(x);
        }
        catch (MyException e) {
            e.printError("Radius is too small!");
        }
    }
}
