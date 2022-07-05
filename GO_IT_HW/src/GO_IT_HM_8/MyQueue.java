package GO_IT_HM_8;

public interface MyQueue {
    void add (Object value); // adding the element to the end
    void remove (int index); //deletes the element by the index
    void clear (); // clears the collection
    int size (); // returns the size of the collection
    Object peek (); // returns the first element in the queue (FIFO)
    Object poll (); // returns the first element from the queue and deletes it from the collection
}
