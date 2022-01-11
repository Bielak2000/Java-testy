package main;

import main.Problem4.Class;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Problem4Test {
    @Test
    public void Function_ResultEquals2_true(){
        List<Integer> L = new ArrayList<>();
        L.add(-1);
        L.add(1);
        L.add(3);
        L.add(4);
        main.Problem4.Class c = new Class(L);
        int k = c.function();
        assertEquals(k,2);
    }
}
