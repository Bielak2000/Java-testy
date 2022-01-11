package main;

import main.Problem14.Class;
import main.exceptions.MyException;
import org.junit.Test;
import static org.junit.Assert.*;

public class Problem14Test {
    @Test
    public void Function_ResultIsPi_true(){
        try {
            Class c = new Class(2);
            double x = c.PI(100000);
            boolean y = ((x>3.13) && (x<3.15));
            assertTrue(y);
        }
        catch(MyException e){
            e.printError("There are too few steps!");
        }

    }

    @Test
    public void Function_RadiusIs0_ThrowException(){
        try {
            Class c = new Class(0);
            double x = c.PI(100000);
            boolean y = ((x>3.13) && (x<3.14));
            assertTrue(y);
        }
        catch(MyException e){
            e.printError("There are too few steps!");
        }

    }

    @Test
    public void Function_TestsEquals0_true(){
        try {
            Class c = new Class(2);
            double x = c.PI(0);
            assertTrue(x==0);
        }
        catch(MyException e){
            e.printError("There are too few steps!");
        }

    }
}
