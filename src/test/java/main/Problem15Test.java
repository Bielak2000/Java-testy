package main;

import main.Problem15.Class;
import main.exceptions.MyException;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Problem15Test {
    @Test
    public void Function_ResultIsTrue_true(){
        List<Integer> L = new ArrayList<>();
        L.add(1);
        L.add(8);
        L.add(20);
        L.add(10);
        L.add(3);
        L.add(25);
        main.Problem15.Class c = new Class(L);
        int x = c.Rand();
        boolean t = false;
        for(int i : L)
            if(i==x)
                t=true;
        assertTrue(t);

    }
}
