package main;

import main.Problem233.Class;
import main.exceptions.MyException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem233Test {
    @Test
    public void Function_ResultIs3_true(){
        try{
            main.Problem233.Class c = new Class(5);
            int x = c.function();
            assertEquals(x,3);
        }
        catch (MyException e) {
            e.printError("Too few words!");
        }
    }

    @Test
    public void Function_ResultIs0_true(){
        try{
            main.Problem233.Class c = new Class(1);
            int x = c.function();
            assertEquals(x,0);
        }
        catch (MyException e) {
            e.printError("Too few words!");
        }
    }

    @Test
    public void Function_ResultIs1_true(){
        try{
            main.Problem233.Class c = new Class(2);
            int x = c.function();
            assertEquals(x,1);
        }
        catch (MyException e) {
            e.printError("Too few words!");
        }
    }

    @Test
    public void Function_TooFewWords_ThrowException(){
        try{
            main.Problem233.Class c = new Class(0);
            int x = c.function();
            assertEquals(x,0);
        }
        catch (MyException e) {
            e.printError("Too few words!");
        }
    }
}
