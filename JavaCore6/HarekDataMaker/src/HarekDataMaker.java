import java.util.Arrays;

public class HarekDataMaker {
    public String aggregateSingle(String name, String age, String planet){
      return  "name - " + name + ", age - " + age + ", planet - " + planet;


    }
    public String[] aggregateAll(String[] names, int[] ages, String[] planets){
       String [] a = new String[3];
       a[0] = aggregateSingle(names[0], Integer.toString(ages[0]), planets[0] );
       a[1] = aggregateSingle(names[1], Integer.toString(ages[1]), planets[1] );
       a[2] = aggregateSingle(names[2], Integer.toString(ages[2]), planets[2] );
       return a;


    }
}
