package main.Problem11;

import java.util.ArrayList;
import java.util.List;

public class Dictionary {
   List<String> strings = new ArrayList<>();

    public Dictionary(List<String> s) {
        strings = s;
    }

    public List<String> getPartial(String s){
        List<String> stringReturn = new ArrayList<>();
        for(String s1 : strings){
            if (s1.startsWith(s)) {
                System.out.println(s1);
                stringReturn.add(s1);
            }
        }
        return stringReturn;
    }

    @Override
    public String toString(){
        String s = new String();
        for(String s1 : strings){
            s += s1;
            s+=" ";
        }

        return s;
    }
}
