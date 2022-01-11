package main;

import main.Problem2.Class;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class Problem2Test {
    @Test
    public void Function_L1EqualsL_true(){
        List<Integer> L = new ArrayList<>();
        L.add(1);
        L.add(2);
        L.add(3);
        L.add(4);
        L.add(5);
        List<Integer> L1 = new ArrayList<>();
        L1.add(120);
        L1.add(60);
        L1.add(40);
        L1.add(30);
        L1.add(24);
        List<Integer> L2 = new ArrayList<>();
        Class c = new Class(L);
        L2 = c.function();
        int j = 0;
        for(int i : L2 ){
            assertTrue(i==L1.get(j));

            j++;
        }
    }
}
