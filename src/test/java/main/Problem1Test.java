package main;

import main.Problem1.Class;
import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Problem1Test {

@Test
    public void Function_KIsInArray_True() {

    List<Integer> L = new ArrayList<>();
    L.add(10);
    L.add(15);
    L.add(3);
    L.add(7);
    Class c = new Class(L, 17);
    assertTrue(c.function());
    }


@Test
    public void function_KIsInArray_False() {

        List<Integer> L = new ArrayList<>();
        L.add(10);
        L.add(15);
        L.add(3);
        L.add(7);
        Class c = new Class(L, 5);
        assertFalse(c.function());
    }
}
