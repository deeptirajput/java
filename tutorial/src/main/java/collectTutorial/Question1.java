package collectTutorial;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Question1{

    public static void main(String[] args) {
       String args1[] = {"this","is","deepti"};
       List<String> argslist= Arrays.asList(args1);
       Collections.shuffle(argslist);
      argslist.stream()
      .forEach(e -> System.out.println(e));
       System.out.println("-----------------------------------------");
      for(String one: argslist ){
        System.out.println(one);
      }
     
    }
}

