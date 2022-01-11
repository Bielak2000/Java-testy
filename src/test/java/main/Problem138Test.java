package main;

import main.Problem138.Class;
import main.exceptions.MyException;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Problem138Test {
    @Test
    public void Function_ResultIs1And5_true(){
        List<Integer> L = new ArrayList<>();
        L.add(25);
        L.add(10);
        L.add(5);
        L.add(2);
        L.add(1);
        try {
            main.Problem138.Class c = new Class(16, L);
            int x = c.function1();
            assertEquals(x, 3);
        }
        catch(MyException e1){
            e1.printError("Amount is too small!");
        }
    }

    @Test
    public void Function_AmountIs0_ThrowException(){
        List<Integer> L = new ArrayList<>();
        L.add(25);
        L.add(10);
        L.add(5);
        L.add(2);
        L.add(1);
        try {
            main.Problem138.Class c = new Class(0, L);
            int x = c.function1();
            assertEquals(x, 3);
        }
        catch(MyException e1){
            e1.printError("Amount is too small!");
        }
    }
}
