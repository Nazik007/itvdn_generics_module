package GO_IT_HM_8;

public interface MyList {
    void add (Object value); // добавляє елемент в кінець
    void remove (int index); // видаляє елемент по індексу
    void clear (); // видаляє коллекцію
    int size (); // returns the collections size
    Object get(int index); // returns the element by the index
}
