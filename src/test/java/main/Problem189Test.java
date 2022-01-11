package main;

import main.Problem189.Class;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Problem189Test {
    @Test
    public void Function_ResultIs5_true(){
        List<Integer> L = new ArrayList<>();
        L.add(5);
        L.add(1);
        L.add(3);
        L.add(5);
        L.add(2);
        L.add(3);
        L.add(4);
        L.add(1);
        main.Problem189.Class c = new Class(L);
        int x = c.function();
        assertEquals(x,5);

    }
    @Test
    public void Function_ResultIsTrue_true(){
        List<Integer> L = new ArrayList<>();
        L.add(5);
        L.add(1);
        L.add(3);
        L.add(2);
        L.add(4);
        main.Problem189.Class c = new Class(L);
        int x = c.function();
        assertEquals(x,5);

    }
}
