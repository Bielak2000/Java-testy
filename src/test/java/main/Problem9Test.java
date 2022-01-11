package main;

import main.Problem9.Class;
import main.exceptions.MyException;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Problem9Test {
    @Test
    public void Function_ResultEquals2_true(){
        List<Integer> L = new ArrayList<>();
        L.add(2);
        L.add(4);
        L.add(6);
        L.add(8);
        try {
            main.Problem9.Class c = new Class(L);
            int x = c.function();
            assertEquals(x, 12);
        }
        catch (MyException e){
            e.printError("Too few elements!");
        }
    }

    @Test
    public void Function_TooFewElements_ThrowException(){
        List<Integer> L = new ArrayList<>();
        L.add(2);
        L.add(4);
        try {
            main.Problem9.Class c = new Class(L);
        }
        catch (MyException e){
            e.printError("Too few elements!");
        }
    }
}
