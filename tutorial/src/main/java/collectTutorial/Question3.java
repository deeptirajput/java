package collectTutorial;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Question3{
  public static void main(String[] args) {
      List<String> totrim = new ArrayList<>();
       totrim.add("this ");
       totrim.add("  is ");
       totrim.add("   deepti");
       System.out.println("----before---"+totrim);
       ListIterator<String> lit=totrim.listIterator();
       while(lit.hasNext()){
           lit.set(lit.next().trim());
       }
       System.out.println("----after-----"+totrim);
   }
}