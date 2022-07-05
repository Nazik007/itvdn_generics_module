package GO_IT_HM_10;

import java.io.*;
import java.util.*;

public class WordCounter {
    public static final String ABSOLUT_PATH = "/Users/nsovi/Desktop/GO_IT_HW/src/words.txt";

    public static void main(String[] args) {

        File file = new File(ABSOLUT_PATH);

        try (BufferedReader reader = new BufferedReader(new FileReader(file))){

            String line = reader.readLine();
            List<String> list = new ArrayList<>();
            Map<String,Integer> map = new HashMap<>();

            while (line!=null){
                String[] words ;
                words=line.split(" ");
                for (int i = 0; i < words.length; i++) {
                    list.add(words[i]);
                }
                line=reader.readLine();
            }

            for (String words : list) {
                if (map.containsKey(words)) {
                    map.put(words, map.get(words) + 1);
                    continue;
                }
                map.put(words,1);
            }

            map.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue().reversed()).forEach(s -> System.out.println(s.getKey()+" "+s.getValue()));
            //System.out.println(sorted.collect(Collectors.toMap());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
