package GO_IT_HM_8;

public class MyLinkedList implements MyList, MyQueue {

    Node firstNode;
    Node lastNode;
    int size;

    public void myLinkedList() {
        clear();
    }

    @Override
    public void add(Object value) {
        if (size == 0) {
            firstNode = new Node(value, null);
            lastNode = firstNode;
        } else {
            Node previous = lastNode;
            lastNode = new Node(value,null);
            previous.next = lastNode;
        }
        size++;
    }

    @Override
    public void remove(int index) {
        if (index == 0) {
            firstNode = firstNode.next;
        } else {
            Node previousNode = firstNode;
            Node followingNode = firstNode.next;
            for (int i = 1; i < index; i++) {
                previousNode = followingNode;
                followingNode = followingNode.next;
            }
            previousNode.next = followingNode.next;
        }
        size--;
    }

    @Override
    public void clear() {
        firstNode = null;
        lastNode = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object peek() {
        return firstNode.actual;
    }

    @Override
    public Object poll() {
        Node element = firstNode;
        firstNode = firstNode.next;
        size--;
        return element.actual;
    }

    @Override
    public Object get(int index) {
        if (index == 0) return firstNode.actual;
        try {
            Object result = null;
            Node resultNode = firstNode.next;
            for (int i = 1; i <= index ; i++) {
                result = resultNode.actual;
                resultNode = resultNode.next;
            }
            return result;
        }catch (NullPointerException e) {
            System.out.println("Елемента з данним індексом не існує");
        }
        return null;
    }
}
