package generics_3;

import java.util.ArrayList;

public class MyDictionary <T> {
    ArrayList<T> myDictionary = new ArrayList<T>();

    public void add (T t) {
        myDictionary.add(t);
    }

    public int index (int t){
        return myDictionary.indexOf(t);
    }

    public int count (int t){
        return myDictionary.size();
    }

    public ArrayList<T> getMyDictionary (){
        return myDictionary;
    }
}

class Main {
    public static void main(String[] args) {
        MyDictionary<String> dictionary = new MyDictionary<>();

        dictionary.add("random");
        dictionary.add("words");
        dictionary.add("for");
        dictionary.add("testing");
        System.out.println(dictionary.getMyDictionary());
        System.out.println(dictionary.getMyDictionary().indexOf("for"));
        System.out.println(dictionary.count(1));

    }
}
