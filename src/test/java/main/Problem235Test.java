package main;

import main.Problem235.Class;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Problem235Test {
    @Test
    public void Function_ResultIs1And5_true(){
        List<Integer> L = new ArrayList<>();
        L.add(4);
        L.add(3);
        L.add(1);
        L.add(2);
        L.add(5);
        main.Problem235.Class c = new Class(L);
        List<Integer> L2 = c.function();
        int min = L2.get(0);
        int max = L2.get(1);
        assertEquals(min,1);
        assertEquals(max,5);
    }
}
