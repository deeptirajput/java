package collectTutorial;


import java.util.HashSet;

import java.util.Set;



public class Question2 {
    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();
      
       String args1[] = {"this","is","deepti","this","date","deepti"};
        for (String a : args1){
               s.add(a);
               System.out.println(s.size() + " distinct words: " + s);
        }

    }
}
