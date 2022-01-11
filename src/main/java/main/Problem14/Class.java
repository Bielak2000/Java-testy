package main.Problem14;

import main.exceptions.MyException;

import java.util.Random;

public class Class {
    int r;

    public Class(int r1) throws MyException {
        if (r1 <= 0)
            throw new MyException();
        r = r1;
    }

    public double PI(int tests) {
            if (tests <= 0)
                return 0;
            Random r3 = new Random();
            int counter = 0;
            double r2 = Math.pow(r, 2);
            double x;
            double y;
            int i = 0;
            while (i < tests) {
                x = Math.random() * r;
                y = Math.random() * r;
                if ((Math.pow(x, 2) + Math.pow(y, 2)) < r2) {
                    counter++;
                    //System.out.println("xx");
                }
                i++;
            }
            double result = 4.0 * counter / tests;
            return (result);
    }
}