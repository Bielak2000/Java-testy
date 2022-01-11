package main;

import main.Problem11.Dictionary;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class Problem11Test {
    @Test
    public void Function_ListContainKacper_true(){
        List<String> words = new ArrayList<>();
        words.add("Kacper");
        words.add("Bielak");
        words.add("BIeKac");
        Dictionary d = new Dictionary(words);
        List<String> returnWords = d.getPartial("Kac");
        for(String s : returnWords){
            assertEquals(s,"Kacper");
        }
    }
}
